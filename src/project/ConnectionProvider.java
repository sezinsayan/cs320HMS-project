package project;

import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","4421");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}
