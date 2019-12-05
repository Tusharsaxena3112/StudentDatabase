package register;

import com.sun.security.jgss.GSSUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Register {
    public void  register(Connection connection) throws SQLException {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter Rollnumber");
        int roll = scanner.nextInt();
        System.out.println("Enter CPI:");
        double cpi = scanner.nextDouble();
        System.out.println("Enter your Age");
        int age =scanner.nextInt();
        String query = "Insert into student values (?,?,?,?);";
        PreparedStatement preparedStatement =connection.prepareStatement("Insert into student values (?,?,?,?);");
        preparedStatement.setString(2,name);
        preparedStatement.setInt(1, (roll));
        preparedStatement.setDouble(3, cpi);
        preparedStatement.setInt(4,age);
        int rows =preparedStatement.executeUpdate();
        System.out.println("Success Registered");
    }
}
