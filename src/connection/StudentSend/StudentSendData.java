package connection.StudentSend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentSendData {
    public void  entryDetails(Connection connection,int rollNo,String name,double cpi,int age) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("Insert into student values (?,?,?,?);");
        preparedStatement.setInt(1,rollNo);
        preparedStatement.setString(2,name);
        preparedStatement.setDouble(3,cpi);
        preparedStatement.setInt(4,age);
        int rows =preparedStatement.executeUpdate();
        System.out.println("Successfully entered..");
    }
}
