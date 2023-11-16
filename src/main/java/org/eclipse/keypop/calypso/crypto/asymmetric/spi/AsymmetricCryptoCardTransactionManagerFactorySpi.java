/* ******************************************************************************
 * Copyright (c) 2023 Calypso Networks Association https://calypsonet.org/
 *
 * This program and the accompanying materials are made available under the
 * terms of the MIT License which is available at
 * https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: MIT
 ****************************************************************************** */
package org.eclipse.keypop.calypso.crypto.asymmetric.spi;

/**
 * Factory of {@link AsymmetricCryptoCardTransactionManagerSpi}.
 *
 * @since 0.1.0
 */
interface AsymmetricCryptoCardTransactionManagerFactorySpi {

  /**
   * Returns a new instance of {@link AsymmetricCryptoCardTransactionManagerSpi}.
   *
   * @return A new instance of {@link AsymmetricCryptoCardTransactionManagerSpi}.
   * @since 0.1.0
   */
  AsymmetricCryptoCardTransactionManagerSpi createCardTransactionManager();
}
