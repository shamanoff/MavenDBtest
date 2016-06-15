package dbtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Calendar;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "azart1976";

    private static final String INSERT_NEW = "INSERT INTO dish VALUES(?,?,?,?,?,?,?)";

    public static void main(String[] args) {
        Connection connection;
        PreparedStatement preparedStatement = null;
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            preparedStatement = connection.prepareStatement(INSERT_NEW);
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Inserted title");
            preparedStatement.setString(3, "Inserted title");
            preparedStatement.setFloat(1, 0.2f);
            preparedStatement.setBoolean(1,true);
            preparedStatement.setDate(1,new Date(Calendar.getInstance().getTimeInMillis()));
            preparedStatement.setBlob(7, new FileInputStream("smile.png"));
            preparedStatement.execute();

        }catch (SQLException | FileNotFoundException e){
            e.printStackTrace();
        }
    }


}
