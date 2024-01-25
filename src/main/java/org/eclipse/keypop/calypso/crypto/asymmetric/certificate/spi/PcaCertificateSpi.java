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
import org.eclipse.keypop.calypso.crypto.asymmetric.certificate.CertificateException;

/**
 * SPI dedicated to Primary Certification Authority (PCA) certificate management.
 *
 * @since 0.2.0
 */
public interface PcaCertificateSpi {

  /**
   * Verifies the certificate signature and other relevant fields, then returns the public key.
   *
   * <p>This method performs a comprehensive validation of the certificate, including but not
   * limited to checking the validity of the signature. It also verifies other essential fields of
   * the certificate, such as the validity period, the issuer and subject details, and any relevant
   * constraints or extensions. The method ensures the certificate is not only properly signed by
   * the issuer but also conforms to the expected standards and requirements.
   *
   * <p>Note: The certificate is expected to be self-signed in this context.
   *
   * @return A non-null reference to the verified public key of the certificate.
   * @throws CertificateException If the certificate is invalid, expired, revoked, or fails any
   *     other validation checks.
   * @see PublicKey
   * @since 0.2.0
   */
  PublicKeySpi checkCertificateAndGetPublicKey() throws CertificateException;
}
