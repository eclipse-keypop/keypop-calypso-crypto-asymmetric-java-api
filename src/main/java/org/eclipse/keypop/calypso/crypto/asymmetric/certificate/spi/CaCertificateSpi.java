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

import java.security.PublicKey;
import org.eclipse.keypop.calypso.crypto.asymmetric.certificate.InvalidCertificateException;

/**
 * SPI dedicated to Certification Authority (CA) certificate management.
 *
 * @since 0.2.0
 */
public interface CaCertificateSpi {

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
   * @see PublicKey
   * @since 0.2.0
   */
  PublicKeySpi getPublicKey(PublicKey issuerPublicKey) throws InvalidCertificateException;
}
