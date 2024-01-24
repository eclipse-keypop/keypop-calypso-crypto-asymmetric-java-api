/* ******************************************************************************
 * Copyright (c) 2024 Calypso Networks Association https://calypsonet.org/
 *
 * This program and the accompanying materials are made available under the
 * terms of the MIT License which is available at
 * https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: MIT
 ****************************************************************************** */
package org.eclipse.keypop.calypso.crypto.asymmetric.transaction.spi;

import org.eclipse.keypop.calypso.crypto.asymmetric.certificate.spi.CardPublicKeySpi;

/**
 * Calypso card asymmetric key cryptography service.
 *
 * <p>It defines the API needed by a terminal to perform the cryptographic operations required by a
 * Calypso card when using asymmetric keys.
 *
 * <p>An instance of this interface can be obtained via the method {@link
 * AsymmetricCryptoCardTransactionManagerFactorySpi#createCardTransactionManager()}.
 *
 * @since 0.2.0
 */
public interface AsymmetricCryptoCardTransactionManagerSpi {

  /**
   * Initialize the cryptographic context for a new secure session in PKI mode with the provided
   * card public key.
   *
   * @param cardPublicKey The card public key.
   * @since 0.2.0
   */
  void initSession(CardPublicKeySpi cardPublicKey);

  /**
   * Updates the session signature computation with data sent or received from the card as a byte
   * array.
   *
   * @param cardApdu The APDU bytes exchanged with the card (ingoing or outgoing).
   * @since 0.2.0
   */
  void updateSession(byte[] cardApdu);

  /**
   * Verifies the provided secure session signature (a 64-byte byte array) from the previously
   * initialized and updated context.
   *
   * @param cardSessionSignature The card signature.
   * @return True if the signature is valid, false otherwise.
   * @since 0.2.0
   */
  boolean verifySession(byte[] cardSessionSignature);
}
