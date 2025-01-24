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
package com.helger.phase4.crypto;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.apache.wss4j.common.WSS4JConstants;

import com.helger.commons.annotation.Nonempty;
import com.helger.commons.id.IHasID;
import com.helger.commons.lang.EnumHelper;

/**
 * Enumeration of all key encryption algorithms.
 *
 * @author Gregor Scholtysik
 * @author Philip Helger
 * @since 2.1.0
 */
public enum ECryptoKeyEncryptionAlgorithm implements IHasID <String>
{
  RSA15 (WSS4JConstants.KEYTRANSPORT_RSA15),
  RSA_OAEP (WSS4JConstants.KEYTRANSPORT_RSAOAEP),
  RSA_OAEP_XENC11 (WSS4JConstants.KEYTRANSPORT_RSAOAEP_XENC11),
  // ECDH-ES KEYWRAP was added in WSS4J 3.0.3
  ECDH_ES_KEYWRAP_AES_128 (WSS4JConstants.KEYWRAP_AES128),
  ECDH_ES_KEYWRAP_AES_192 (WSS4JConstants.KEYWRAP_AES192),
  ECDH_ES_KEYWRAP_AES_256 (WSS4JConstants.KEYWRAP_AES256),
  ECDH_ES_KEYWRAP_3DES (WSS4JConstants.KEYWRAP_TRIPLEDES),
  KDF_CONCAT (WSS4JConstants.KEYDERIVATION_CONCATKDF),
  AGREEMENT_METHOD_ECDH_ES (WSS4JConstants.AGREEMENT_METHOD_ECDH_ES);

  private final String m_sID;

  ECryptoKeyEncryptionAlgorithm (@Nonnull @Nonempty final String sID)
  {
    m_sID = sID;
  }

  @Nonnull
  @Nonempty
  public String getID ()
  {
    return m_sID;
  }

  @Nullable
  public static ECryptoKeyEncryptionAlgorithm getFromIDOrNull (@Nullable final String sID)
  {
    return EnumHelper.getFromIDOrNull (ECryptoKeyEncryptionAlgorithm.class, sID);
  }

  @Nullable
  public static ECryptoKeyEncryptionAlgorithm getFromIDOrDefault (@Nullable final String sID,
                                                                  @Nullable final ECryptoKeyEncryptionAlgorithm eDefault)
  {
    return EnumHelper.getFromIDOrDefault (ECryptoKeyEncryptionAlgorithm.class, sID, eDefault);
  }
}
