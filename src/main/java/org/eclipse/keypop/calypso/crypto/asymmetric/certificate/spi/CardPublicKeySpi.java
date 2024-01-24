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

/**
 * Specifies the contract of card public keys. It provides a single method to fetch the raw public
 * key value.
 *
 * @since 0.2.0
 */
public interface CardPublicKeySpi {

  /**
   * Get the raw value of the card's public key as a byte array.
   *
   * @return byte array representing the raw public key
   * @since 0.2.0
   */
  byte[] getRawValue();
}
