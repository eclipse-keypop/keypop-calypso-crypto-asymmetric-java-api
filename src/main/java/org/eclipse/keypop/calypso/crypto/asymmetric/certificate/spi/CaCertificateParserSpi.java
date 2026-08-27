/* **************************************************************************************
 * Copyright (c) 2024 Calypso Networks Association https://calypsonet.org/
 *
 * See the NOTICE file(s) distributed with this work for additional information
 * regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the terms of the
 * MIT License which is available at https://opensource.org/licenses/MIT
 *
 * SPDX-License-Identifier: MIT
 ************************************************************************************** */
package org.eclipse.keypop.calypso.crypto.asymmetric.certificate.spi;

import org.eclipse.keypop.calypso.crypto.asymmetric.certificate.CertificateValidationException;

/**
 * SPI dedicated to the creation of CA certificates from raw data stored on a card.
 *
 * <p>See <a
 * href="https://docs.terminal-api.calypsonet.org/calypsonet-terminal-calypso-crypto-asymmetric-uml-api/0.2.1-SNAPSHOT/YYMMDD-SP-CNATerminalAPI-CalypsoCryptoAsymmetric_v0.2.1-SNAPSHOT.html#type_CaCertificateParserSpi">CaCertificateParserSpi</a>
 * for the normative contract.
 *
 * @since 0.2.0
 */
public interface CaCertificateParserSpi {

  /**
   * Returns the certificate type.
   *
   * <p>See <a
   * href="https://docs.terminal-api.calypsonet.org/calypsonet-terminal-calypso-crypto-asymmetric-uml-api/0.2.1-SNAPSHOT/YYMMDD-SP-CNATerminalAPI-CalypsoCryptoAsymmetric_v0.2.1-SNAPSHOT.html#op_CaCertificateParserSpi_getCertificateType">CaCertificateParserSpi.getCertificateType</a>
   * for the normative contract.
   *
   * @return A byte.
   * @since 0.2.0
   */
  byte getCertificateType();

  /**
   * Parses the given card output data and creates a new CA certificate instance.
   *
   * <p>The first byte of the provided byte array is the certificate type.
   *
   * <p>See <a
   * href="https://docs.terminal-api.calypsonet.org/calypsonet-terminal-calypso-crypto-asymmetric-uml-api/0.2.1-SNAPSHOT/YYMMDD-SP-CNATerminalAPI-CalypsoCryptoAsymmetric_v0.2.1-SNAPSHOT.html#op_CaCertificateParserSpi_parseCertificate">CaCertificateParserSpi.parseCertificate</a>
   * for the normative contract.
   *
   * @param cardOutputData A byte array containing the CA certificate as stored on the card.
   * @return A non-null reference.
   * @throws CertificateValidationException If the provided certificate has an unsupported format.
   * @since 0.2.0
   */
  CaCertificateSpi parseCertificate(byte[] cardOutputData) throws CertificateValidationException;
}
