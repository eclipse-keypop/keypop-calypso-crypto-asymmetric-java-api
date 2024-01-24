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
 * SPI interface for the CA certificate factory.
 *
 * @since 0.2.0
 */
public interface CaCertificateFactorySpi {

  /**
   * Get certificate type.
   *
   * @return the type of the certificate as byte.
   * @since 0.2.0
   */
  byte getCertificateType();

  /**
   * Create a new CA certificate instance with the given card output data.
   *
   * @param cardOutputData the data used to create the certificate.
   * @return the created certificate instance.
   * @since 0.2.0
   */
  CaCertificateSpi createCertificate(byte[] cardOutputData);
}
