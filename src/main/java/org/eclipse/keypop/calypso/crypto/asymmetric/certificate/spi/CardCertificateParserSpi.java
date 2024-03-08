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

import org.eclipse.keypop.calypso.crypto.asymmetric.certificate.CertificateValidationException;

/**
 * SPI dedicated to the creation of card certificates from raw data stored on a card.
 *
 * @since 0.2.0
 */
public interface CardCertificateParserSpi {

  /**
   * Returns the certificate type.
   *
   * @return A byte.
   * @since 0.2.0
   */
  byte getCertificateType();

  /**
   * Parses the given card output data and creates a new card certificate instance.
   *
   * <p>The first byte of the provided byte array is the certificate type.
   *
   * @param cardOutputData A byte array containing the card certificate as stored on the card (316
   *     bytes).
   * @return A non-null reference.
   * @throws CertificateValidationException If the provided certificate has an unsupported format.
   * @since 0.2.0
   */
  CardCertificateSpi parseCertificate(byte[] cardOutputData) throws CertificateValidationException;
}
