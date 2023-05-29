package com.example.week4;

import java.io.IOException;

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
        return bookID;
    }
}
