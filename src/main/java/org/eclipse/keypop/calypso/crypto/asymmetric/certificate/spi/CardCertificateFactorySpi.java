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
 * This is the SPI interface for the card certificate factory.
 *
 * @since 0.1.0
 */
public interface CardCertificateFactorySpi {

  /**
   * Get certificate type.
   *
   * @return the type of the certificate as byte.
   * @since 0.1.0
   */
  byte getCertificateType();

  /**
   * Create a new card certificate instance with the given card output data.
   *
   * @param cardOutputData the data used to create the certificate.
   * @return the created certificate instance.
   * @since 0.1.0
   */
  CardCertificateSpi createCertificate(byte[] cardOutputData);
}
