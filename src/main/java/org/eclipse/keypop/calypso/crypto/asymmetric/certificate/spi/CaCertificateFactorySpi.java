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
 * SPI dedicated to the creation of CA certificates from raw data stored on a card.
 *
 * @since 0.2.0
 */
public interface CaCertificateFactorySpi {

  /**
   * Returns the certificate type.
   *
   * @return A byte.
   * @since 0.2.0
   */
  byte getCertificateType();

  /**
   * Creates a new CA certificate instance with the given card output data.
   *
   * @param cardOutputData A non-empty byte array.
   * @return A non-null reference.
   * @throws InvalidCertificateException If the certificate is invalid.
   * @since 0.2.0
   */
  CaCertificateSpi createCertificate(byte[] cardOutputData) throws InvalidCertificateException;
}
