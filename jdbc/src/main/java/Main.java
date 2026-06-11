import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // load driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // get connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","1234");

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM member WHERE id > ?");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            var member = new Member(
                    resultSet.getLong("id"),
                    resultSet.getString("name"),
                    resultSet.getString("email"),
                    resultSet.getInt("age")
            );
            System.out.println(member);
        }

        connection.close();
    }
}