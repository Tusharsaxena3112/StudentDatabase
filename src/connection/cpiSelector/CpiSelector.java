package connection.cpiSelector;

import connection.Student.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CpiSelector {
    public boolean getStudents(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet data =statement.executeQuery("SELECT * from student where cpi < 9.0;");
        while (data.next()){
            Student student =new Student(data.getInt("rollNumber"),data.getString("name"),data.getDouble("cpi"),data.getInt("age"));
            System.out.println(student);
        }
        return data.next();
    }
}
