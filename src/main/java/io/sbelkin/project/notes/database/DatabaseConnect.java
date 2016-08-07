package io.sbelkin.project.notes.database;

import io.sbelkin.project.notes.ConfigurationContainer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by sbelkin on 8/7/2016.
 */
public class DatabaseConnect {
    // get the property value and print it out
//            System.out.println(prop.getProperty("database.host"));
//            System.out.println(prop.getProperty("dbuser"));
//            System.out.println(prop.getProperty("dbpassword"));
    private void initialize(){
        ConfigurationContainer configurationContainer = new ConfigurationContainer();
        Properties properties = configurationContainer.getProperties();
        String host = properties.getProperty("database.host");
        String port = properties.getProperty("database.port");
        String user = properties.getProperty("database.user");
        String password = properties.getProperty("database.password");

        try {
            Connection db = DriverManager.getConnection(host,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
