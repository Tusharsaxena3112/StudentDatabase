package login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
    public void login(Connection connection) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name  = scanner.nextLine();
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        String query  = "SELECT * FROM student where rollNumber = " + number;
        Statement st = connection.createStatement();
        ResultSet resultSet = st.executeQuery(query);
        while(resultSet.next()){
            System.out.println(resultSet.getString("name")+" " + resultSet.getInt("rollNumber"));
        }
        st.close();
    }
}
