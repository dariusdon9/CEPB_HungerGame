package com.example.gameoflife;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DataBase {
    public Connection link;
    public static int count;
    public static int x;
    public static int y;
    public static String type;
    public static String name;
    public static Connection getConnection() throws SQLException,Exception {
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
    public static void refreshTable(String name) throws Exception {
        DataBase.name = name;
        Connection connection = getConnection();
        PreparedStatement refresh = connection.prepareStatement("DELETE FROM TEST."+name +" " + "WHERE 1=1");
        refresh.executeUpdate();
    }

    public static void createTable(String name) throws Exception{
        try{
            DataBase.name = name;
            Connection connection = getConnection();
            PreparedStatement create = connection.prepareStatement(
                    "CREATE TABLE "+name+"(ID INT NOT NULL AUTO_INCREMENT,CELL_X_COORDINATE INT,CELL_Y_COORDINATE INT,CELL_TYPE VARCHAR(255),PRIMARY KEY(ID))"
            );
            create.executeUpdate();

        }catch (Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Function Complete");
        };
    }

    public static void enter(int x, int y, String type)throws Exception{
        DataBase.x = x;
        DataBase.y = y;
        DataBase.type = type;

        try{
            Connection connection = getConnection();
            PreparedStatement posted = connection.prepareStatement("INSERT INTO "+name+"(CELL_X_COORDINATE,CELL_Y_COORDINATE,CELL_TYPE)VALUES('"+x+"','"+y+"','" + type +"')");
            posted.executeUpdate();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Insert Completed");
        }
    }
}
