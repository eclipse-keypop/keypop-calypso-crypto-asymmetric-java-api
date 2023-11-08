/* **************************************************************************************
 * Copyright (c) 2023 Calypso Networks Association https://calypsonet.org/
 *
 * This file is part of Eclipse Keypop.
 *
 * Eclipse Keypop is free software: you can redistribute it and/or modify
 * it under the terms of the MIT License. A copy of the License is located at
 *
 * http://opensource.org/licenses/MIT
 ************************************************************************************** */
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
