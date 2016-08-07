package io.sbelkin.project.notes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by sbelkin on 8/7/2016.
 */
public class ConfigurationContainer {
    private Properties properties;

    public void load() throws Exception{
        properties = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("src\\main\\resources\\default.configuration");
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Properties getProperties(){
        return properties;
    }
}
