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
 * SPI interface dedicated to card certificate creation.
 *
 * @since 0.2.0
 */
public interface CardCertificateFactorySpi {

  /**
   * Returns certificate type.
   *
   * @return the type of the certificate as byte.
   * @since 0.2.0
   */
  byte getCertificateType();

  /**
   * Creates a new card certificate instance with the given card output data.
   *
   * @param cardOutputData the data used to create the certificate.
   * @return the created certificate instance.
   * @since 0.2.0
   */
  CardCertificateSpi createCertificate(byte[] cardOutputData);
}
