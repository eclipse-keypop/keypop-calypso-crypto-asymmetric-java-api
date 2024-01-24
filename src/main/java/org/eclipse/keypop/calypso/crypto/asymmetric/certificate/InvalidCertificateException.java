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
 * Exception that is thrown when an invalid certificate is encountered during the cryptographic
 * operation.
 *
 * @since 0.2.0
 */
public class InvalidCertificateException extends Exception {

  /**
   * Constructs an InvalidCertificateException with the specified detail message.
   *
   * @param message the detail message.
   * @since 0.2.0
   */
  public InvalidCertificateException(String message) {
    super(message);
  }

  /**
   * Constructs a new exception with the specified detail message and cause.
   *
   * @param message the detail message (which is saved for later retrieval by the
   *     Throwable.getMessage() method).
   * @param cause the cause (which is saved for later retrieval by the Throwable.getCause() method).
   *     (A null value is permitted, and indicates that the cause is nonexistent or unknown.)
   * @since 0.2.0
   */
  public InvalidCertificateException(String message, Throwable cause) {
    super(message, cause);
  }
}
