package com.booking.replication.configuration;

import javax.naming.ConfigurationException;

/**
 * Created by edmitriev on 2/22/17.
 */
public class HBaseConfiguration {
    private String       namespace;
    private ZookeeperConfiguration zookeeperConfiguration;
    private boolean      writeRecentChangesToDeltaTables;
    private HiveImportsConfiguration hiveImports;
    private boolean isDryRunMode;

    public HBaseConfiguration(String namespace, ZookeeperConfiguration zookeeperConfiguration, boolean writeRecentChangesToDeltaTables, HiveImportsConfiguration hiveImports, boolean isDryRunMode) throws ConfigurationException {
        this.namespace = namespace;
        this.zookeeperConfiguration = zookeeperConfiguration;
        this.writeRecentChangesToDeltaTables = writeRecentChangesToDeltaTables;
        this.hiveImports = hiveImports;
        this.isDryRunMode = isDryRunMode;

        if (namespace == null) throw new ConfigurationException("HBase namespace cannot be null.");
    }

    public String getNamespace() {
        return namespace;
    }

    public ZookeeperConfiguration getZookeeperConfiguration(){
        return zookeeperConfiguration;
    }

    public boolean isWriteRecentChangesToDeltaTables() {
        return writeRecentChangesToDeltaTables;
    }

    public HiveImportsConfiguration getHiveImports() {
        return hiveImports;
    }

    public boolean isDryRunMode() {
        return isDryRunMode;
    }
}
