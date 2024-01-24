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
 * SPI dedicated to the creation of card certificates from raw data stored on a card.
 *
 * @since 0.2.0
 */
public interface CardCertificateFactorySpi {

  /**
   * Returns the certificate type.
   *
   * @return A byte.
   * @since 0.2.0
   */
  byte getCertificateType();

  /**
   * Creates a new card certificate instance with the given card output data.
   *
   * <p>The first byte of the provided byte array is the certificate type.
   *
   * @param cardOutputData A non-empty byte array.
   * @return A non-null reference.
   * @throws IllegalArgumentException If the argument is null or has an invalid format.
   * @since 0.2.0
   */
  CardCertificateSpi createCertificate(byte[] cardOutputData);
}
