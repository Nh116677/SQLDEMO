package org.example;

import java.sql.*;

public class E2MysqlDemo {
    public static void main(String[] args) throws SQLException {
        String dbUrl ="jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String userName= "syntax_hrm";
        String password ="syntaxhrm123";

        Connection connection = DriverManager.getConnection(dbUrl,userName,password);

        Statement statement = connection.createStatement();
        String query ="Select * from person";
        ResultSet resultSet = statement.executeQuery(query);
        ResultSetMetaData rsm = resultSet.getMetaData();
        for (int i = 1; i < rsm.getColumnCount(); i++) {
            System.out.print(rsm.getColumnLabel(i) + " ");

        }
        System.out.println();
        while (resultSet.next()){
            for (int i = 1; i <= rsm.getColumnCount(); i++) {
                System.out.print(resultSet.getString(i) + " ");
            }
            System.out.println();
        }

    }
}
