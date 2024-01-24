/* ******************************************************************************
 * Copyright (c) 2024 Calypso Networks Association https://calypsonet.org/
 *
 * This program and the accompanying materials are made available under the
 * terms of the MIT License which is available at
 * https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: MIT
 ****************************************************************************** */
package org.eclipse.keypop.calypso.crypto.asymmetric.certificate.spi;

/**
 * SPI interface dedicated to card certificate management.
 *
 * @since 0.2.0
 */
public interface CardCertificateSpi {

  /**
   * Retrieves the reference of the issuer's public key.
   *
   * @return byte array containing the reference of the issuer's public key.
   * @since 0.2.0
   */
  byte[] getIssuerPublicKeyReference();

  /**
   * Extracts the public key from the card certificate using the issuer's public key.
   *
   * @param issuerPublicKey Public key of the issuer.
   * @return PublicKeySpi the public key extracted from the card certificate.
   * @since 0.2.0
   */
  CardPublicKeySpi extractPublicKey(PublicKeySpi issuerPublicKey);
}
