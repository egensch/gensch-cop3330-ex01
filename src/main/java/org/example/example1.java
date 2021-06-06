/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Emily Gensch
 */
package org.example;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = myObj.nextLine();

        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
