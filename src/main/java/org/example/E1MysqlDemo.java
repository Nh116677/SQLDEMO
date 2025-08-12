package org.example;

import java.sql.*;

public class E1MysqlDemo {
    public static void main(String[] args) throws SQLException {
        String dbUrl ="jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String userName= "syntax_hrm";
        String password ="syntaxhrm123";

        Connection connection = DriverManager.getConnection(dbUrl,userName,password);

        Statement statement = connection.createStatement();
        String query ="Select * from person";
        ResultSet resultSet = statement.executeQuery(query);
        while(resultSet.next()){
            String id = resultSet.getString("id");
            String firstName = resultSet.getString("FirstName");
            String age = resultSet.getString("age");
            System.out.println(id + " " + firstName + " " + age);
        }

    }
}
