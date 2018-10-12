package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        int output = 0;
        for(int x = 1; x <= n; x++)
        {
            output = output + x;
        }
        System.out.println("The sum from 1 to n is " + output);
    }
}
