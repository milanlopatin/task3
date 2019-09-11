package ru.dexsys.database.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DatabaseProp {
    private static String URL;
    private static String USERNAME;
    private static String PASSWORD;

    public static void setDatabaseProp() throws IOException {
        Properties databaseProperties = new Properties();
        FileInputStream fis;
        try {
            fis = new FileInputStream("src/main/resources/database.properties");
            databaseProperties.load(fis);

            URL = databaseProperties.getProperty("url");
            USERNAME = databaseProperties.getProperty("username");
            PASSWORD = databaseProperties.getProperty("password");
        } catch (IOException e) {
            System.err.println("Error");
        }
    }

    public static String getURL() {
        return URL;
    }

    public static String getUsername() {
        return USERNAME;
    }

    public static String getPassword() {
        return PASSWORD;
    }
}
