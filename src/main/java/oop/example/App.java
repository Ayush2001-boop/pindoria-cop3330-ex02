package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ayush Pindoria
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("What is the input string? ");
        name = input.nextLine();

        int length = name.length();
        System.out.printf("%s has %d characters.", name, length);

    }//end main method
}//end classB