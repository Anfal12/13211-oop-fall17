package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {



            public static void main (String[]args) throws IOException {
                String first;
                // Person’s first name
                String last; // Person’s last name
                String middle; // Person’s middle initial
                String firstLast; // Name in first-last format
                String lastFirst; // Name in last-first format
                String firstMiddleLast;
                BufferedReader in; // Input stream for strings
                Scanner a = new Scanner(System.in);

                in = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter first name: "); // Prompt for first name
                first = a.next();

                //first = in.readLine(); // Get first name
                System.out.print("Enter last name: "); // Prompt for last name
                last = a.next();
                //last = in.readLine(); // Get last name
                System.out.print("Enter middle initial: "); // Prompt for middle initial
                middle = a.next();
                //middle = in.readLine(); // Get middle initial
                firstLast = first + " " + last; // Generate first format
                System.out.println("Name in first-last format is " + firstLast);
                lastFirst = last + ", " + first + ", "; // Generate second format
                System.out.println("Name in last-first-initial format is " + lastFirst + middle + ".");
                firstMiddleLast = first + " " + middle + " " + last;
                System.out.println("Name in First-Middle-Lastformat is " + firstMiddleLast);
                Main printName = new Main();
                printName.displayInFirstMiddleLast(first, last, middle);

            }




    /**
     * this method defines each variable
     * @param first is used to store the first wrds of the name
     * @param last is used to store the last words of the name
     * @param middle is used to store the middle name
     * @pram firstMiddleLast is used to store the name in the format first last middle
     * @return
     */

    private String displayInFirstMiddleLast(String first, String last, String middle){
        String  firstMiddleLast = first + " " +middle +"." +" "+last ;
        System.out.println("Name in first-middle-last format is : " + firstMiddleLast);
        return  firstMiddleLast;

        }
            }
