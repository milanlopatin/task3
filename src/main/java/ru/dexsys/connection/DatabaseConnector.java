package ru.dexsys.connection;
import ru.dexsys.database.properties.DatabaseProp;
import java.io.IOException;
import java.sql.*;


public class DatabaseConnector {
    private static String URL;
    private static String USERNAME;
    private static String PASSWORD;
    private static Connection connection;


    public static Connection getConnection() throws SQLException, IOException {
        DatabaseProp.setDatabaseProp();
        URL = DatabaseProp.getURL();
        USERNAME = DatabaseProp.getUsername();
        PASSWORD = DatabaseProp.getPassword();
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return connection;
    }

}
