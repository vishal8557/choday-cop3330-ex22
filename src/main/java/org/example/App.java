package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Vishal Choday

Exercise 22 - Comparing Numbers
        Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

        Write a program that asks for three numbers. Check first to see that all numbers are different. If they’re not different, then exit the program. Otherwise, display the largest number of the three.

        Example Output
        Enter the first number: 1
        Enter the second number: 51
        Enter the third number: 2
        The largest number is 51.
        Constraint
        Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.
*/
import java.util.Scanner;
public class App{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the first number: ");
        int First_Number = in.nextInt();
        System.out.print("Enter the second number: ");
        int Second_Number = in.nextInt();
        System.out.print("Enter the third number: ");
        int Third_Number = in.nextInt();


        if( First_Number >=Second_Number  && First_Number >= Third_Number)
            System.out.println( "The largest number is " + First_Number +".");

        else if (Second_Number >= First_Number && Second_Number >= Third_Number)
            System.out.println( "The largest number is " + Second_Number +".");

        else
            System.out.println( "The largest number is " + Third_Number +".");
    }
}

