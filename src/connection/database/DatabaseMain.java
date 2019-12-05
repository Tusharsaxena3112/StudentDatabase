package connection.database;

import connection.StudentFetch.StudentDetails;
import connection.StudentSend.StudentSendData;
import connection.cpiSelector.CpiSelector;
import connection.database.DatabaseConnection;
import outlook.Outlook;

import java.sql.SQLException;
import java.util.Scanner;

public class DatabaseMain {
    public static void main(String[] args) throws SQLException {
        Scanner scanner =new Scanner(System.in);
        DatabaseConnection db =new DatabaseConnection();
        if(db.attemptConnection()){
            System.out.println("Connection OK");
        }
        else{
            System.out.println("Connection Not ok");
        }
//        System.out.println("Enter your name:");
//        String name = scanner.nextLine();
//        System.out.println("Enter your Roll number:");
//        int rollNumber =scanner.nextInt();
//        System.out.println("Enter your age:");
//        int age =scanner.nextInt();
//        System.out.println("Enter your cpi:");
//        double cpi =scanner.nextDouble();
        StudentDetails studentDetails = new StudentDetails();
        //StudentSendData sendData =new StudentSendData();
        //sendData.entryDetails(db.getConnection(),rollNumber,name,cpi,age);
        studentDetails.getStudentDetails(db.getConnection());
////        System.out.println();
////        CpiSelector cpiSelector =new CpiSelector();
////        cpiSelector.getStudents(db.getConnection());
//        Outlook outlook =new Outlook();
//        outlook.outLook();
        db.closeConnection();
    }
}
