package connection.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//attemptConnection method ----> It checks for the connection with the database

public class DatabaseConnection {
    public Connection connection=null;
    public Connection getConnection()
    {
        return connection;
    }
        public boolean attemptConnection() throws SQLException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
            //Creating object of connection class.
            boolean isConnected=false;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/GLA?useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            if (getConnection() != null) {
                isConnected = true;
            }
            return isConnected;
        }
        public boolean closeConnection() throws SQLException {
            boolean isConnectionClosed = false;
            if (getConnection()!=null){
                connection.close();
                isConnectionClosed =true;
            }
            return isConnectionClosed;
        }
}

