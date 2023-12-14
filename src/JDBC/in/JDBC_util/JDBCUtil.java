package JDBC.in.JDBC_util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {
    // 1. FIRST METHOD TO LOAD DRIVERS AND OPEN CONNECTION
    public static Connection getJDBC_connection() throws IOException, SQLException {

        FileInputStream vFileInputStream = new FileInputStream("./src/JDBC/application.properties");
        Properties prop = new Properties();
        prop.load(vFileInputStream);

        String url = prop.getProperty("url");
        String username = prop.getProperty("User");
        String password = prop.getProperty("password");


        System.out.println(url);
        System.out.println(username);
        System.out.println(password);

        return DriverManager.getConnection(url,username,password);
    }
    // 2. SECOND METHOD TO CLOSE ALL CONNECTIONS

    public static void closeResource(Connection vConnection, Statement vStatement) throws SQLException {
        if(vConnection != null)
            vConnection.close();
        if(vStatement != null)
            vStatement.close();
    }
}