package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "What is your name? " );
        Scanner scanner = new Scanner(System.in);
        String end;

        String userInput = scanner.nextLine();

        end = "Hello, " + userInput + ", nice to meet you!";
        System.out.println( end );

        scanner.close();
    }
}
