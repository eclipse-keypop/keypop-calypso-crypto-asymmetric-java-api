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

import java.security.PublicKey;

/**
 * SPI providing a generic public key.
 *
 * <p>See <a
 * href="https://docs.terminal-api.calypsonet.org/calypsonet-terminal-calypso-crypto-asymmetric-uml-api/0.2.1-SNAPSHOT/YYMMDD-SP-CNATerminalAPI-CalypsoCryptoAsymmetric_v0.2.1-SNAPSHOT.html#type_CaCertificateContentSpi">CaCertificateContentSpi</a>
 * for the normative contract.
 *
 * @since 0.2.0
 */
public interface CaCertificateContentSpi {

  /**
   * Returns the public key.
   *
   * <p>See <a
   * href="https://docs.terminal-api.calypsonet.org/calypsonet-terminal-calypso-crypto-asymmetric-uml-api/0.2.1-SNAPSHOT/YYMMDD-SP-CNATerminalAPI-CalypsoCryptoAsymmetric_v0.2.1-SNAPSHOT.html#op_CaCertificateContentSpi_getPublicKey">CaCertificateContentSpi.getPublicKey</a>
   * for the normative contract.
   *
   * @return A non-null reference.
   * @see PublicKey
   * @since 0.2.0
   */
  PublicKey getPublicKey();

  /**
   * Returns the reference of the public key as a byte array.
   *
   * <p>See <a
   * href="https://docs.terminal-api.calypsonet.org/calypsonet-terminal-calypso-crypto-asymmetric-uml-api/0.2.1-SNAPSHOT/YYMMDD-SP-CNATerminalAPI-CalypsoCryptoAsymmetric_v0.2.1-SNAPSHOT.html#op_CaCertificateContentSpi_getPublicKeyReference">CaCertificateContentSpi.getPublicKeyReference</a>
   * for the normative contract.
   *
   * @return A non-empty byte array.
   * @since 0.2.0
   */
  byte[] getPublicKeyReference();

  /**
   * Returns the validity start date of the certificate in long format.
   *
   * <p>The date is represented in the format 0xYYYYMMDD, where YYYY is the four-digit year, MM is
   * the two-digit month, and DD is the two-digit day.
   *
   * <p>If the validity start date is not defined or available, the method returns 0.
   *
   * <p>See <a
   * href="https://docs.terminal-api.calypsonet.org/calypsonet-terminal-calypso-crypto-asymmetric-uml-api/0.2.1-SNAPSHOT/YYMMDD-SP-CNATerminalAPI-CalypsoCryptoAsymmetric_v0.2.1-SNAPSHOT.html#op_CaCertificateContentSpi_getStartDate">CaCertificateContentSpi.getStartDate</a>
   * for the normative contract.
   *
   * @return 0 if the validity start date is not defined.
   * @since 0.2.0
   */
  long getStartDate();

  /**
   * Returns the validity end date of the certificate in long format.
   *
   * <p>The date is represented in the format 0xYYYYMMDD, where YYYY is the four-digit year, MM is
   * the two-digit month, and DD is the two-digit day.
   *
   * <p>If the validity end date is not defined or available, the method returns 0.
   *
   * <p>See <a
   * href="https://docs.terminal-api.calypsonet.org/calypsonet-terminal-calypso-crypto-asymmetric-uml-api/0.2.1-SNAPSHOT/YYMMDD-SP-CNATerminalAPI-CalypsoCryptoAsymmetric_v0.2.1-SNAPSHOT.html#op_CaCertificateContentSpi_getEndDate">CaCertificateContentSpi.getEndDate</a>
   * for the normative contract.
   *
   * @return 0 if the validity end date is not defined.
   * @since 0.2.0
   */
  long getEndDate();

  /**
   * Indicates if the AID has to be checked.
   *
   * <p>See <a
   * href="https://docs.terminal-api.calypsonet.org/calypsonet-terminal-calypso-crypto-asymmetric-uml-api/0.2.1-SNAPSHOT/YYMMDD-SP-CNATerminalAPI-CalypsoCryptoAsymmetric_v0.2.1-SNAPSHOT.html#op_CaCertificateContentSpi_isAidCheckRequested">CaCertificateContentSpi.isAidCheckRequested</a>
   * for the normative contract.
   *
   * @return true if the AID must be checked.
   * @since 0.2.0
   */
  boolean isAidCheckRequested();

  /**
   * Indicates if the AID is truncated.
   *
   * <p>See <a
   * href="https://docs.terminal-api.calypsonet.org/calypsonet-terminal-calypso-crypto-asymmetric-uml-api/0.2.1-SNAPSHOT/YYMMDD-SP-CNATerminalAPI-CalypsoCryptoAsymmetric_v0.2.1-SNAPSHOT.html#op_CaCertificateContentSpi_isAidTruncated">CaCertificateContentSpi.isAidTruncated</a>
   * for the normative contract.
   *
   * @return true if the AID is truncated.
   * @since 0.2.0
   */
  boolean isAidTruncated();

  /**
   * Return the AID value.
   *
   * <p>See <a
   * href="https://docs.terminal-api.calypsonet.org/calypsonet-terminal-calypso-crypto-asymmetric-uml-api/0.2.1-SNAPSHOT/YYMMDD-SP-CNATerminalAPI-CalypsoCryptoAsymmetric_v0.2.1-SNAPSHOT.html#op_CaCertificateContentSpi_getAid">CaCertificateContentSpi.getAid</a>
   * for the normative contract.
   *
   * @return null if the AID check is not requested.
   * @since 0.2.0
   */
  byte[] getAid();

  /**
   * Indicates if the certificate can be used to authenticate CA certificates.
   *
   * <p>See <a
   * href="https://docs.terminal-api.calypsonet.org/calypsonet-terminal-calypso-crypto-asymmetric-uml-api/0.2.1-SNAPSHOT/YYMMDD-SP-CNATerminalAPI-CalypsoCryptoAsymmetric_v0.2.1-SNAPSHOT.html#op_CaCertificateContentSpi_isCaCertificatesAuthenticationAllowed">CaCertificateContentSpi.isCaCertificatesAuthenticationAllowed</a>
   * for the normative contract.
   *
   * @return true if the certificate can be used to authenticate CA certificates.
   * @since 0.2.0
   */
  boolean isCaCertificatesAuthenticationAllowed();

  /**
   * Indicates if the certificate can be used to authenticate card certificates.
   *
   * <p>See <a
   * href="https://docs.terminal-api.calypsonet.org/calypsonet-terminal-calypso-crypto-asymmetric-uml-api/0.2.1-SNAPSHOT/YYMMDD-SP-CNATerminalAPI-CalypsoCryptoAsymmetric_v0.2.1-SNAPSHOT.html#op_CaCertificateContentSpi_isCardCertificatesAuthenticationAllowed">CaCertificateContentSpi.isCardCertificatesAuthenticationAllowed</a>
   * for the normative contract.
   *
   * @return true if the certificate can be used to authenticate card certificates.
   * @since 0.2.0
   */
  boolean isCardCertificatesAuthenticationAllowed();
}
