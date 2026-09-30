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
package org.eclipse.keypop.calypso.crypto.asymmetric;

/**
 * Immutable properties of the Asymmetric Crypto API.
 *
 * <p>See <a
 * href="https://docs.terminal-api.calypsonet.org/calypsonet-terminal-calypso-crypto-asymmetric-uml-api/0.2.1-SNAPSHOT/YYMMDD-SP-CNATerminalAPI-CalypsoCryptoAsymmetric_v0.2.1-SNAPSHOT.html#type_AsymmetricCryptoApiProperties">AsymmetricCryptoApiProperties</a>
 * for the normative contract.
 *
 * @since 0.2.0
 */
public final class AsymmetricCryptoApiProperties {

  /**
   * Version of the API implemented by this binding, as a "MAJOR.MINOR" dotted decimal: {@value}
   *
   * @since 0.2.0
   */
  public static final String VERSION = "0.2";

  /** Private constructor */
  private AsymmetricCryptoApiProperties() {}
}
