package com.github.brucemelo.springmicrostream;

import one.microstream.afs.sql.types.SqlDataSourceProvider;
import one.microstream.configuration.types.Configuration;
import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;

public class DataSourceProvider implements SqlDataSourceProvider {
    @Override
    public DataSource provideDataSource(Configuration configuration) {
        String url = configuration.get("url");
        String user = configuration.get("user");
        String password = configuration.get("password");
        PGSimpleDataSource pgSimpleDataSource = new PGSimpleDataSource();
        pgSimpleDataSource.setUrl(url);
        pgSimpleDataSource.setUser(user);
        pgSimpleDataSource.setPassword(password);
        return pgSimpleDataSource;
    }
}
