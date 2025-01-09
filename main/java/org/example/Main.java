package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        //variable declarations
        Scanner terminalInput = new Scanner(System.in);
        int choice;

        System.out.println("Calculator");
        System.out.println("Addition        + : 1");
        System.out.println("Subtraction     - : 2");
        System.out.println("Multiplication  * : 3");
        System.out.println("Division        / : 4");
        System.out.println("Exit: 5");
        System.out.println("Choose one of the following operation: ");
        choice = terminalInput.nextInt();

        //The following code checks user input and calls correct method
        if (choice == 1)
        {
            System.out.println("Addition: ");
        }
        else if  (choice == 2)
        {
            System.out.println("Subtraction: ");
        }
        else if (choice == 3){
            System.out.println("Multiplication: ");
        }
        else if (choice == 4)
         {
             System.out.println("Division: ");
         }
         else
         {
             System.out.println("Closing calculator! ");
         }
        }
    }