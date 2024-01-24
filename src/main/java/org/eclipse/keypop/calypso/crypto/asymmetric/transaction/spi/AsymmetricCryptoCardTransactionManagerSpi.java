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
   * Starts a new session with a card.
   *
   * @param cardPublicKey The public key of the card.
   * @since 0.2.0
   */
  void initTerminalSessionSignature(CardPublicKeySpi cardPublicKey);

  /**
   * Updates the session signature computation with data sent or received from the card.
   *
   * @param cardApdu A byte array containing either the input or output data of a card command APDU.
   * @since 0.2.0
   */
  void updateTerminalSessionSignature(byte[] cardApdu);

  /**
   * Ends the current opened card session by checking if the card session signature is correct.
   *
   * @param cardSessionSignature The card session signature to check.
   * @return True if the card session is correct, false otherwise.
   * @since 0.2.0
   */
  boolean isCardSessionSignatureValid(byte[] cardSessionSignature);
}
