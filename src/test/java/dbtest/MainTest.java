package dbtest;

import java.sql.*;

public class MainTest {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "azart1976";

    public static void main(String[] args) {

        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
        }catch (SQLException e){
            e.printStackTrace();
        }
        try {Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            //System.out.println(connection.isClosed());
           /* statement.execute("INSERT INTO animal(animal_name, animal_desc)" +
                    "VALUES('name', 'desc');");*/
            //int res = statement.executeUpdate("UPDATE animal SET amimal_name ='SARA' WHERE id=1;");
            //ResultSet res = statement.executeQuery("SELECT * FROM animal");
           /* statement.addBatch("INSERT INTO animal(animal_name, animal_desc)VALUE ('batch1', 'desc1')");
            statement.addBatch("INSERT INTO animal(animal_name, animal_desc)VALUE ('batch2', 'desc1')");
            statement.addBatch("INSERT INTO animal(animal_name, animal_desc)VALUE ('batch3', 'desc1')");
            statement.executeBatch();*/
           /* boolean status = statement.isClosed();
            System.out.println(status);*/
            statement.getConnection();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
