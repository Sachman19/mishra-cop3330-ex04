/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Sachin Mishra
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a noun. ");
        String noun = input.nextLine();

        System.out.print("Please enter a verb. ");
        String verb = input.nextLine();

        System.out.print("Please enter a adjective. ");
        String adjective = input.nextLine();

        System.out.print("Please enter a adverb. ");
        String adverb = input.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's Hilarious." , verb, adjective, noun, adverb);
    }
}
