package com.exemplo.msproject.odata;

import java.sql.SQLException;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Future;

import org.springframework.transaction.TransactionStatus;
import org.teiid.jdbc.TeiidDriver;
import org.teiid.olingo.service.LocalClient;
import org.teiid.spring.autoconfigure.TeiidServer;

public class SpringClient{// extends LocalClient {
//    private TeiidServer server;
//    private TransactionStatus status;
//
//    public SpringClient(String vdbName, String vdbVersion, Properties properties, TeiidServer server,
//                        Map<Object, Future<Boolean>> loading) {
//        super(vdbName, vdbVersion, properties, loading);
//        this.server = server;
//    }
//
//
//    protected TeiidDriver getDriver() {
//        return this.server.getDriver();
//    }
//
//
//    @Override
//    public String startTransaction() throws SQLException {
//        if (this.server.isUsingPlatformTransactionManager()) {
//            status = this.server.getPlatformTransactionManagerAdapter().getOrCreateTransaction(true).status;
//            return "anyid";
//        }
//        return super.startTransaction();
//    }
//
//    @Override
//    public void commit(String txnId) throws SQLException {
//        if (this.server.isUsingPlatformTransactionManager()) {
//            this.server.getPlatformTransactionManagerAdapter().commit(status);
//        } else {
//            super.commit(txnId);
//        }
//    }
//
//    @Override
//    public void rollback(String txnId) throws SQLException {
//        if (this.server.isUsingPlatformTransactionManager()) {
//            this.server.getPlatformTransactionManagerAdapter().rollback(status);
//        } else {
//            super.rollback(txnId);
//        }
//    }
}