package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
     //   1. Loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

     //   2. Creating a connection
        String username = "root";
        String password = "root";
        String connectionUrl = "jdbc:mysql://localhost:3306/8ambatch";

        Connection con = DriverManager.getConnection(connectionUrl,username,password);

     //   3. Creating statement
        Statement st = con.createStatement();

     //   4. Execute query - insert , update, delete , select

        // DML - Data manipulation language - insert, update, delete
        // DDL - Data Definition language - select

        String sql = "insert into schoolstudent values(1,'Girija','IT',67)";
        st.executeUpdate(sql);

        // 5. close connections

        st.close();
        con.close();

    }


}
