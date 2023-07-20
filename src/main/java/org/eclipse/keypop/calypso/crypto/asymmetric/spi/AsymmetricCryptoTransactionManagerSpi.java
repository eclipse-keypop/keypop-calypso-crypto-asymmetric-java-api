/*
 * Copyright (c) 2023 Calypso Networks Association https://calypsonet.org/
 *
 * This file is part of Eclipse Keypop.
 *
 * Eclipse Keypop is free software: you can redistribute it and/or modify
 * it under the terms of the MIT License. A copy of the License is located at
 *
 * http://opensource.org/licenses/MIT
 */
package org.eclipse.keypop.calypso.crypto.asymmetric.spi;

/**
 * Calypso card asymmetric key cryptography service.
 *
 * <p>It defines the API needed by a terminal to perform the cryptographic operations required by a
 * Calypso card when using asymmetric keys.
 *
 * <p>An instance of this interface can be obtained via the method {@link
 * AsymmetricCryptoTransactionManagerFactorySpi#createTransactionManager()}.
 *
 * @since 0.1.0
 */
interface AsymmetricCryptoTransactionManagerSpi {

  /**
   * Returns the public key of a card contains in a card certificate.
   *
   * @param cardCertificate The card certificate.
   * @return A non-null byte array.
   * @since 0.1.0
   */
  byte[] extractCardPublicKey(byte[] cardCertificate);

  /**
   * Starts a new session with a card.
   *
   * @param cardPublicKey The public key of the card.
   * @since 0.1.0
   */
  void initTerminalSessionSignature(byte[] cardPublicKey);

  /**
   * Updates the session signature computation with data sent or received from the card.
   *
   * @param cardApdu A byte array containing either the input or output data of a card command APDU.
   * @since 0.1.0
   */
  void updateTerminalSessionSignature(byte[] cardApdu);

  /**
   * Ends the current opened card session by checking if the card session signature is correct.
   *
   * @param cardSessionSignature The card session signature to check.
   * @return True if the card session is correct, false otherwise.
   * @since 0.1.0
   */
  boolean isCardSessionSignatureValid(byte[] cardSessionSignature);
}
