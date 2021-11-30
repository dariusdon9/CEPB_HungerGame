package com.example.gameoflife;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DataBase {
    public Connection link;
    public static Connection getConnection()throws Exception, SQLException {
       try{
           String driver = "com.mysql.cj.jdbc.Driver";
           String url = "jdbc:mysql://localhost:3306/test";
           String username = "root";
           String password = "Speedy09@";
           Class.forName(driver);

           Connection connection = DriverManager.getConnection(url,username,password);
           System.out.println("Connected");

           return connection;
       }catch (Exception e){
           System.out.println(e);
       }
        return null;
    }
    public static void createTable() throws Exception{
        try{

            Connection connection = getConnection();
            PreparedStatement create = connection.prepareStatement(
                    "CREATE TABLE CELL(ID INT NOT NULL AUTO_INCREMENT,CELL_X_COORDINATE INT,CELL_Y_COORDINATE INT,CELL_TYPE VARCHAR(255),PRIMARY KEY(ID))"
            );
            create.executeUpdate();

        }catch (Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Function Complete");
        };
    }
}
