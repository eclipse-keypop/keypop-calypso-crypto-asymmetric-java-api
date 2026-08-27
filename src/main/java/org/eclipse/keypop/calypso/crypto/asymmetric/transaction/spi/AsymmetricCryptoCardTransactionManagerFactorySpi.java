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
 * <p>See <a
 * href="https://docs.terminal-api.calypsonet.org/calypsonet-terminal-calypso-crypto-asymmetric-uml-api/0.2.1-SNAPSHOT/YYMMDD-SP-CNATerminalAPI-CalypsoCryptoAsymmetric_v0.2.1-SNAPSHOT.html#type_AsymmetricCryptoCardTransactionManagerFactorySpi">AsymmetricCryptoCardTransactionManagerFactorySpi</a>
 * for the normative contract.
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
