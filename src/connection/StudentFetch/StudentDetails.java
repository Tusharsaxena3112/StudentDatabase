package connection.StudentFetch;

import connection.Student.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDetails {
    public boolean getStudentDetails(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT  * from student;");
        //System.out.println(String.format("%s\t\t%s\t\t%s\t\t%s","RollNumber","Name","CPI","Age"));
        while (resultSet.next()){
            String name = resultSet.getString("name");
            int rollNo = resultSet.getInt("rollNumber");
            double cpi = resultSet.getDouble("cpi");
            int age =resultSet.getInt("age");
            Student student =new Student(rollNo, name,cpi,age);
            System.out.println(student);
        }
        return resultSet.next();
    }
}
