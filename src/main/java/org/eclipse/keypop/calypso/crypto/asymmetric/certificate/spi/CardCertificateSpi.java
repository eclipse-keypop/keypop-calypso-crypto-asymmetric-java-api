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

import org.eclipse.keypop.calypso.crypto.asymmetric.certificate.InvalidCertificateException;

/**
 * SPI dedicated to card certificate management.
 *
 * @since 0.2.0
 */
public interface CardCertificateSpi {

  /**
   * Retrieves the reference of the issuer's public key as a byte array.
   *
   * @return A non-empty byte array.
   * @since 0.2.0
   */
  byte[] getIssuerPublicKeyReference();

  /**
   * Verifies the certificate signature and returns the public key.
   *
   * @param issuerPublicKey The issuer public key.
   * @return A non-null reference.
   * @throws InvalidCertificateException If the certificate is invalid.
   * @since 0.2.0
   */
  CardPublicKeySpi getPublicKey(PublicKeySpi issuerPublicKey) throws InvalidCertificateException;
}
