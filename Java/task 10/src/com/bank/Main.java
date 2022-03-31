package com.bank;
import  java.util.Scanner;

public class Main extends Operations {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Main obj = new Main();
            String Case = "";
            while (Case != "exit") {
                Case = input.next().toLowerCase();
                obj.switchCase(Case);
            }
        }
    }

