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
package org.eclipse.keypop.calypso.crypto.asymmetric.transaction.spi;

/**
 * Factory of {@link AsymmetricCryptoCardTransactionManagerSpi}.
 *
 * @since 0.2.0
 */
public interface AsymmetricCryptoCardTransactionManagerFactorySpi {

  /**
   * Returns a new instance of {@link AsymmetricCryptoCardTransactionManagerSpi}.
   *
   * @return A non-null reference.
   * @since 0.2.0
   */
  AsymmetricCryptoCardTransactionManagerSpi createCardTransactionManager();
}
