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
 * The CardIdentifierApi interface provides functions to interact with the card's identifier by
 * allowing to get the Application Identifier (AID) and serial number of the card.
 *
 * @since 0.1.0
 */
public interface CardIdentifierApi {

  /**
   * Returns the Application Identifier (AID) of the card. A byte array containing the AID is
   * returned.
   *
   * @return a byte array containing the Application Identifier (AID) of the card. The length of the
   *     byte array is between 5 and 16 bytes.
   * @since 0.1.0
   */
  byte[] getAid();

  /**
   * Returns the serial number of the card. A byte array containing the serial number is returned.
   *
   * @return an 8-byte byte array containing the serial number of the card
   * @since 0.1.0
   */
  byte[] getSerialNumber();
}
