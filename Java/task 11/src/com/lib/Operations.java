package com.lib;
import java.sql.*;
import java.util.*;

public class Operations {
    static Scanner sc = new Scanner(System.in) ;
    public static void getData( Connection conn , Statement statement ) {
        try {

            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Books");
            while (resultSet.next()){
                System.out.print("id : "+resultSet.getInt(1));
                System.out.print("BookName : "+resultSet.getString(2));
                System.out.print("Author : "+resultSet.getString(3));
                System.out.print("Price : "+resultSet.getDouble(4));
                System.out.println();
            }
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }


    public  static String insertData (Statement statement,Connection connection) {
        try {
            statement = connection.createStatement();
            String sql = "INSERT INTO Books (book_name, price, Author) VALUES (?, ?, ?)";
            PreparedStatement stat = connection.prepareStatement(sql);

            System.out.println("Enter->"+" BookName : "+ "Price: "+ "Author : ");
            String book_name = sc.next();
            double price = sc.nextInt();
            String Author = sc.next();

            stat.setString(1,book_name);
            stat.setDouble(2,price);
            stat.setString(3,Author);

            int rowsInserted = stat.executeUpdate();

            if (rowsInserted > 0) {
                return "A new Book is inserted successfully!";
            }

        } catch (Exception e) {
            System.out.println(e);

        }
        return  "Error";
    }

    public  static  void deleteData(Statement statement,Connection connection) {
        System.out.println("Enter BookName to delete.. ");
        String book_name = sc.next();

        try {
            String sql = "delete from Books where book_name ='" + book_name +"'";
            PreparedStatement p = connection.prepareStatement(sql);
            int result = 0;
            result = statement.executeUpdate(sql);

            if (result == 0) {
                System.out.println("record not found to delete");
            } else {
                System.out.println(result+" no.of records found and deleted");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public  static  void search(Statement statement,Connection connection) {
        System.out.println("Enter BookName to Search.. ");
        String book_name = sc.next();

        try {
            statement = connection.createStatement();
            String sql = "Select *  from Books where book_name ='" + book_name +"'";
            ResultSet resultSet = statement.executeQuery(sql);

            if( !resultSet.next() ){
                System.out.println("not found");

            } else {
                while (resultSet.next()){
                    System.out.print("id : "+resultSet.getInt(1));
                    System.out.print("BookName : "+resultSet.getString(2));
                    System.out.print("Price : "+resultSet.getInt(3));
                    System.out.print("Author : "+resultSet.getString(4));
                    System.out.println();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }





}

