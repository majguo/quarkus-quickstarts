package org.acme.getting.started;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(targets = { com.azure.identity.extensions.jdbc.postgresql.AzurePostgresqlAuthenticationPlugin.class })
public class MyReflectionConfiguration {
}