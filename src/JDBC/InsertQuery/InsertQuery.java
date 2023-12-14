package JDBC.InsertQuery;

import JDBC.in.JDBC_util.JDBCUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {
    public static void main(String[] args) {
        Connection vConn = null;
        Statement vStatement = null;
        String vInsert_Query = "insert into student(name,rollnum,result) values ('Animesh',25,'PASS')";
        try {
            vConn = JDBCUtil.getJDBC_connection();
            if(vConn != null) {
                System.out.println("Connection Done ");
                vStatement = vConn.createStatement();
                int rows = vStatement.executeUpdate(vInsert_Query);
                if(rows > 0)
                    System.out.println(rows + "rows affected");
                else
                    System.out.println("0 rows affected");
            }
        }
        catch (IOException | SQLException  e) {
            e.printStackTrace();
        }
    }
}
