package com.huawei.zkexp.curator.factory;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

/**
 * Created by y on 2016/3/6.
 */
public class ClientFactory {

    public static CuratorFramework newClient() {
        String connectionString = "127.0.0.1:2180,127.0.0.1:2181,127.0.0.1:2182";
        ExponentialBackoffRetry retryPolicy = new ExponentialBackoffRetry(1000,3);
        return CuratorFrameworkFactory.newClient(connectionString, retryPolicy);
    }
}
