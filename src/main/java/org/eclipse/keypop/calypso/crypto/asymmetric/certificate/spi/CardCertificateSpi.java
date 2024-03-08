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

import org.eclipse.keypop.calypso.crypto.asymmetric.AsymmetricCryptoException;
import org.eclipse.keypop.calypso.crypto.asymmetric.certificate.CertificateValidationException;

/**
 * SPI dedicated to card certificate management.
 *
 * @since 0.2.0
 */
public interface CardCertificateSpi {

  /**
   * Retrieves the reference of the issuer's public key as a byte array.
   *
   * @return A non-empty byte array.
   * @since 0.2.0
   */
  byte[] getIssuerPublicKeyReference();

  /**
   * Retrieves the AID of the autonomous application of the card as a byte array ranging from 5 to
   * 16 bytes.
   *
   * @return A non-empty byte array.
   * @since 0.2.0
   */
  byte[] getCardAid();

  /**
   * Retrieves the serial number of the card as 8-byte byte array.
   *
   * @return A non-empty byte array.
   * @since 0.2.0
   */
  byte[] getCardSerialNumber();

  /**
   * Verifies the certificate signature and other relevant fields, then returns the public key.
   *
   * <p>This method performs a comprehensive validation of the certificate, including but not
   * limited to checking the validity of the signature. It also verifies other essential fields of
   * the certificate, such as the validity period, the issuer and subject details, and any relevant
   * constraints or extensions. The method ensures the certificate is not only properly signed by
   * the issuer but also conforms to the expected standards and requirements.
   *
   * @param issuerCertificateContent The issuer certificate content to be used for signature
   *     verification.
   * @return A non-null reference.
   * @throws CertificateValidationException If the certificate is invalid, expired, revoked, or
   *     fails any other validation checks.
   * @throws AsymmetricCryptoException If a technical error occurs during the cryptographic
   *     computations.
   * @since 0.2.0
   */
  CardPublicKeySpi checkCertificateAndGetPublicKey(CaCertificateContentSpi issuerCertificateContent)
      throws CertificateValidationException, AsymmetricCryptoException;
}
