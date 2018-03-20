import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionProvider {
    private static ConnectionProvider instance = new ConnectionProvider();

    public Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/library?autoReconnect=true&useSSL=false", "root", "root");
    }

    public static ConnectionProvider getInstance() {
        return instance;
    }

    private ConnectionProvider() {
    }
}
