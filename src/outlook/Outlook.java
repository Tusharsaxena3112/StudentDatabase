package outlook;

import connection.database.DatabaseConnection;
import login.Login;
import register.Register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Outlook {
    public void outLook() throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter What you wanna do ..... > ");
        System.out.println("1...> Register");
        System.out.println("2...> Login");
        String entry = scanner.nextLine();
        switch (entry) {
            case "Register":
                //System.out.println("Register");
                Register register = new Register();
                register.register(db.getConnection());
                break;
            case "Login" :
                Login login =new Login();
                login.login(db.getConnection());
                break;
            default:
                System.out.println("Enter valid Entry.");
        }
    }
}
