/* ******************************************************************************
 * Copyright (c) 2024 Calypso Networks Association https://calypsonet.org/
 *
 * This program and the accompanying materials are made available under the
 * terms of the MIT License which is available at
 * https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: MIT
 ****************************************************************************** */
package org.eclipse.keypop.calypso.crypto.asymmetric.transaction;

/**
 * Exception that is thrown when the card public key is not compliant with the current elliptic
 * curve.
 *
 * @since 0.2.0
 */
public class InvalidCardPublicKeyException extends Exception {

  /**
   * @param message Message to identify the exception context.
   * @since 0.2.0
   */
  public InvalidCardPublicKeyException(String message) {
    super(message);
  }

  /**
   * Encapsulates a lower level exception.
   *
   * @param message Message to identify the exception context.
   * @param cause The cause.
   * @since 0.2.0
   */
  public InvalidCardPublicKeyException(String message, Throwable cause) {
    super(message, cause);
  }
}
