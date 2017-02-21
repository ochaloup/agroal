// Copyright (C) 2017 Red Hat, Inc. and individual contributors as indicated by the @author tags.
// You may not use this file except in compliance with the Apache License, Version 2.0.

package io.agroal.api.configuration;

import java.security.Principal;
import java.util.Collection;
import java.util.Properties;

/**
 * @author <a href="lbarreiro@redhat.com">Luis Barreiro</a>
 */
public interface AgroalConnectionFactoryConfiguration {

    boolean autoCommit();

    String jdbcUrl();

    String initialSql();

    String driverClassName();

    ClassLoaderProvider classLoaderProvider();

    TransactionIsolation jdbcTransactionIsolation();

    InterruptProtection interruptProtection();

    Principal principal();

    Collection<Object> credentials();

    Properties jdbcProperties();

    // --- //

    enum TransactionIsolation {
        NONE, READ_UNCOMMITTED, READ_COMMITTED, REPEATABLE_READ, SERIALIZABLE
    }
}