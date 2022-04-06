package com.lib;

import java.sql.*;
import java.util.*;



public class Main  extends  Operations{
    static Statement statement= null ;
    static Connection conn = null;
    public static  void getConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "root", "root");
            statement = conn.createStatement();
        } catch (Exception exception) {
            System.out.println(exception);

        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean status = true;
        getConnection();

        while(status) {
            System.out.println("insertData " + " getData " + " deleteData " + " search ");
            String option = sc.next();



            switch(option) {
                case "getdata" :
                    getData(conn,statement);
                    break;
                case  "insertdata" :
                    System.out.println(insertData(statement,conn));
                    break;
                case "deletedata" :
                    deleteData(statement,conn);
                    break;
                case "search" :
                    search(statement,conn);
                    break;
                case "exit" :
                    try {
                        if(statement != null) {
                            statement.close();
                        }

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.exit(0);

                    break;
            }

        }
    }

}