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

/**
 * SPI providing the card's public key.
 *
 * @since 0.2.0
 */
public interface CardPublicKeySpi {

  /**
   * Get the raw value of the card's public key as a byte array.
   *
   * @return A 64-byte byte array.
   * @since 0.2.0
   */
  byte[] getRawValue();
}
