package com.example.week4;

import java.io.IOException;
import java.sql.*;

public class DBUtility {
    // user, pass and connectionString
    private static String user;
    private static String pass;

    static {
        try {
            user = DBCreds.findUser();
            pass = DBCreds.findPass();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // You dont have to create the above files
    // write your username and pass as a string
    private static String connectURL = "jdbc:mysql://172.31.22.43:3306/" + user;

    // static method to store book in the db
    // this will return the bookId
    public static int insertBookIntoDB(Book book){
        int bookID = -1;
        ResultSet resultSet = null;

        String sql = "INSERT INTO book (book_name, author, genre, price, is_available)\n" +
                "VALUES (?,?,?,?,?);";

        // this is called a 'try with resources' block
        // everything inside this will be closed automatically
        try(
                Connection conn = DriverManager.getConnection(connectURL, user, pass);
                PreparedStatement preparedStatement = conn.prepareStatement(sql, new String[]{"bookID"})
                ){

        }
        catch (Exception e){

        }
        finally {

        }

        return bookID;
    }
}
