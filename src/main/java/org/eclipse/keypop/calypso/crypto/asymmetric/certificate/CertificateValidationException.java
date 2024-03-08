/* ******************************************************************************
 * Copyright (c) 2024 Calypso Networks Association https://calypsonet.org/
 *
 * This program and the accompanying materials are made available under the
 * terms of the MIT License which is available at
 * https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: MIT
 ****************************************************************************** */
package org.eclipse.keypop.calypso.crypto.asymmetric.certificate;

/**
 * Indicates an issue encountered during the certificate validation.
 *
 * <p>This exception can be triggered by various issues such as an invalid signature or incorrect
 * metadata values within the certificate.
 *
 * @since 0.2.0
 */
public class CertificateValidationException extends Exception {

  /**
   * @param message Message to identify the exception context.
   * @since 0.2.0
   */
  public CertificateValidationException(String message) {
    super(message);
  }

  /**
   * Encapsulates a lower level exception.
   *
   * @param message Message to identify the exception context.
   * @param cause The cause.
   * @since 0.2.0
   */
  public CertificateValidationException(String message, Throwable cause) {
    super(message, cause);
  }
}
