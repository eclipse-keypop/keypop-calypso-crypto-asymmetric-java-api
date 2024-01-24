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

/**
 * Represents an interface for a public key.
 *
 * @since 0.2.0
 */
public interface PublicKeySpi {

  /**
   * Retrieves the public key value.
   *
   * @return The public key value.
   * @since 0.2.0
   */
  PublicKey getValue();

  /**
   * Retrieves the reference of the public key as a byte array.
   *
   * @return The reference of the public key as a byte array.
   * @since 0.2.0
   */
  byte[] getReference();
}
