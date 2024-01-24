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
 * SPI dedicated to Primary Certification Authority (PCA) certificate management.
 *
 * @since 0.2.0
 */
public interface PcaCertificateSpi {

  /**
   * Extracts the public key from the PCA certificate.
   *
   * @return A non-null reference.
   * @throws InvalidCertificateException If the certificate is invalid.
   * @since 0.2.0
   */
  PublicKeySpi extractPublicKey() throws InvalidCertificateException;
}
