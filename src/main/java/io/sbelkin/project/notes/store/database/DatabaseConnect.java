package io.sbelkin.project.notes.store.database;

import io.sbelkin.project.notes.ConfigurationContainer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by sbelkin on 8/7/2016.
 */
public class DatabaseConnect {

    public Connection initialize() throws SQLException {
        ConfigurationContainer configurationContainer = new ConfigurationContainer();
        Properties properties = configurationContainer.getProperties();
        String host = properties.getProperty("database.host");
        String port = properties.getProperty("database.port");
        String user = properties.getProperty("database.user");
        String password = properties.getProperty("database.password");

        Connection db = DriverManager.getConnection(host,user,password);
        return db;
    }
}
