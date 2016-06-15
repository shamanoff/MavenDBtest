import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBWorker {
    private final String HOST = "jdbs:postgresql://localhost:5433/tables";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "azart1976";

    private Connection connection;

    public DBWorker() {
        try {
            connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
