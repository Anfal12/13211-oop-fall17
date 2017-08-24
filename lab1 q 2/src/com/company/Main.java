package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
 Scanner a= new Scanner (System.in);

     // String[] mgt = new String[5];

        //int size = mgt.length;
       // for (int i=0; i<size; i++);
        System.out.println("Enter first line");
String line1= a.nextLine();
        System.out.println("Enter second line");
            String line2= a.nextLine();

            System.out.println( line1 + "," + line2 +".");
            System.out.println("Enter third line");
            String line3= a.nextLine();
        System.out.println( line1 + "," + line2 + "," + line3 + ".");

            System.out.println("Enter forth line");
            String line4= a.nextLine();
        System.out.println( line1 + "," + line2 + "," +line3 + "," + line4 + ".");

            System.out.println("Enter fifth line");
             String line5= a.nextLine();
        System.out.println( line1 + "," + line2 + "," +line3 + "," + line4 + "," + line5 + ".");
    }
}
