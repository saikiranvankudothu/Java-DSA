import java.sql.*;
public class JDBCExample {

    static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database";
    static final String USER = "your_username";
    static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            Statement statement = connection.createStatement();

            updateTable(statement);
            showTableFrontend(statement);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void updateTable(Statement statement) throws SQLException {
        String updateQuery = "UPDATE your_table SET column1 = 'new_value' WHERE some_condition";
        int rowsAffected = statement.executeUpdate(updateQuery);
        System.out.println(rowsAffected + " row(s) updated.");
    }

    private static void showTableFrontend(Statement statement) throws SQLException {
        String selectQuery = "SELECT * FROM your_table";
        ResultSet resultSet = statement.executeQuery(selectQuery);

        while (resultSet.next()) {
            int column1Value = resultSet.getInt("column1");

            System.out.println("Column1: " + column1Value + ", Column2: " + column2Value);
        }
        resultSet.close();
    }
}
