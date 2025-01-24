/*
 * Copyright (C) 2015-2025 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.phase4.model.mpc;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.state.EChange;
import com.helger.dao.DAOException;
import com.helger.phase4.CAS4;
import com.helger.phase4.model.mpc.IMPC;
import com.helger.phase4.model.mpc.IMPCManager;
import com.helger.phase4.model.mpc.MPC;
import com.helger.photon.audit.AuditHelper;
import com.helger.photon.io.dao.AbstractPhotonMapBasedWALDAO;
import com.helger.photon.security.object.BusinessObjectHelper;

/**
 * Manager for {@link com.helger.phase4.model.mpc.MPC} objects.
 *
 * @author Philip Helger
 */
@ThreadSafe
public class MPCManagerXML extends AbstractPhotonMapBasedWALDAO <com.helger.phase4.model.mpc.IMPC, com.helger.phase4.model.mpc.MPC> implements IMPCManager
{
  public MPCManagerXML (@Nullable final String sFilename) throws DAOException
  {
    super (com.helger.phase4.model.mpc.MPC.class, sFilename);
  }

  @Override
  @Nonnull
  protected EChange onInit ()
  {
    // Create default MPC
    createMPC (new com.helger.phase4.model.mpc.MPC(CAS4.DEFAULT_MPC_ID));
    return EChange.CHANGED;
  }

  public void createMPC (@Nonnull final com.helger.phase4.model.mpc.MPC aMPC)
  {
    ValueEnforcer.notNull (aMPC, "MPC");

    m_aRWLock.writeLocked ( () -> internalCreateItem (aMPC));
    AuditHelper.onAuditCreateSuccess (com.helger.phase4.model.mpc.MPC.OT, aMPC.getID ());
  }

  @Nonnull
  public EChange updateMPC (@Nonnull final com.helger.phase4.model.mpc.IMPC aMPC)
  {
    ValueEnforcer.notNull (aMPC, "MPC");
    final com.helger.phase4.model.mpc.MPC aRealMPC = getOfID (aMPC.getID ());
    if (aRealMPC == null)
    {
      AuditHelper.onAuditModifyFailure (com.helger.phase4.model.mpc.MPC.OT, aMPC.getID (), "no-such-id");
      return EChange.UNCHANGED;
    }
    if (aRealMPC.isDeleted ())
    {
      AuditHelper.onAuditModifyFailure (com.helger.phase4.model.mpc.MPC.OT, aMPC.getID (), "already-deleted");
      return EChange.UNCHANGED;
    }

    m_aRWLock.writeLock ().lock ();
    try
    {
      BusinessObjectHelper.setLastModificationNow (aRealMPC);
      internalUpdateItem (aRealMPC);
    }
    finally
    {
      m_aRWLock.writeLock ().unlock ();
    }
    AuditHelper.onAuditModifySuccess (com.helger.phase4.model.mpc.MPC.OT, "all", aRealMPC.getID ());

    return EChange.CHANGED;
  }

  @Nonnull
  public EChange markMPCDeleted (@Nullable final String sMPCID)
  {
    final com.helger.phase4.model.mpc.MPC aDeletedMPC = getOfID (sMPCID);
    if (aDeletedMPC == null)
    {
      AuditHelper.onAuditDeleteFailure (com.helger.phase4.model.mpc.MPC.OT, "no-such-object-id", sMPCID);
      return EChange.UNCHANGED;
    }

    m_aRWLock.writeLock ().lock ();
    try
    {
      if (BusinessObjectHelper.setDeletionNow (aDeletedMPC).isUnchanged ())
      {
        AuditHelper.onAuditDeleteFailure (com.helger.phase4.model.mpc.MPC.OT, "already-deleted", sMPCID);
        return EChange.UNCHANGED;
      }
      internalMarkItemDeleted (aDeletedMPC);
    }
    finally
    {
      m_aRWLock.writeLock ().unlock ();
    }
    AuditHelper.onAuditDeleteSuccess (com.helger.phase4.model.mpc.MPC.OT, sMPCID);

    return EChange.CHANGED;
  }

  @Nonnull
  public EChange deleteMPC (@Nullable final String sMPCID)
  {
    final com.helger.phase4.model.mpc.MPC aDeletedMPC = getOfID (sMPCID);
    if (aDeletedMPC == null)
    {
      AuditHelper.onAuditDeleteFailure (com.helger.phase4.model.mpc.MPC.OT, "no-such-object-id", sMPCID);
      return EChange.UNCHANGED;
    }

    m_aRWLock.writeLock ().lock ();
    try
    {
      internalDeleteItem (sMPCID);
    }
    finally
    {
      m_aRWLock.writeLock ().unlock ();
    }
    AuditHelper.onAuditDeleteSuccess (MPC.OT, sMPCID);

    return EChange.CHANGED;
  }

  @Nullable
  public IMPC getMPCOfID (@Nullable final String sID)
  {
    return getOfID (sID);
  }
}
