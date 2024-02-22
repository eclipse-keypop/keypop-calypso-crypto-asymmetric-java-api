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
import java.util.Date;

/**
 * SPI providing a generic public key.
 *
 * @since 0.2.0
 */
public interface CaCertificateContentSpi {

  /**
   * Returns the public key.
   *
   * @return A non-null reference.
   * @see PublicKey
   * @since 0.2.0
   */
  PublicKey getPublicKey();

  /**
   * Returns the reference of the public key as a byte array.
   *
   * @return A non-empty byte array.
   * @since 0.2.0
   */
  byte[] getPublicKeyReference();

  /**
   * Returns the validity start date of the certificate.
   *
   * @return null if the validity start date is not defined.
   * @since 0.2.0
   */
  Date getStartDate();

  /**
   * Returns the validity end date of the certificate.
   *
   * @return null if the validity end date is not defined.
   * @since 0.2.0
   */
  Date getEndDate();

  /**
   * Indicates if the AID has to be checked.
   *
   * @return true if the AID must be checked.
   * @since 0.2.0
   */
  boolean isAidCheckRequested();

  /**
   * Indicates if the AID is truncated.
   *
   * @return true if the AID is truncated.
   * @since 0.2.0
   */
  boolean isAidTruncated();

  /**
   * Return the AID value.
   *
   * @return null if the AID check is not requested.
   * @since 0.2.0
   */
  byte[] getAid();

  /**
   * Indicates if the certificate can be used to authenticate CA certificates.
   *
   * @return true if the certificate can be used to authenticate CA certificates.
   * @since 0.2.0
   */
  boolean isCaCertificatesAuthenticationAllowed();

  /**
   * Indicates if the certificate can be used to authenticate card certificates.
   *
   * @return true if the certificate can be used to authenticate card certificates.
   * @since 0.2.0
   */
  boolean isCardCertificatesAuthenticationAllowed();
}
