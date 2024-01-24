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
 * Provides card identification data such as application identifier (AID) and card serial number.
 *
 * @since 0.2.0
 */
public interface CardIdentifierApi {

  /**
   * Returns the card's application identifier (AID) as byte array between 5 and 16 bytes long.
   *
   * @return A non-empty byte array.
   * @since 0.2.0
   */
  byte[] getAid();

  /**
   * Returns the card's serial number as an 8-byte byte array.
   *
   * @return A non-empty byte array.
   * @since 0.2.0
   */
  byte[] getSerialNumber();
}
