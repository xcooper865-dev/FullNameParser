package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Fullname {
    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in);

      System.out.println("First name here");
String firstName = scanner.nextLine();

System.out.println("Print last name ");
String LastName = scanner.nextLine();

String Fullname = firstName+""+LastName;
System.out.println("First name:" +" " +firstName);
System.out.println("last name:" +" "+LastName);



        }
    }
