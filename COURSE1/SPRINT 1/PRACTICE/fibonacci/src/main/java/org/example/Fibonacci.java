package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Fibonacci
{
    public static void main( String[] args )
    {

        System.out.print("Enter number :");
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        generateFibonnaci(d);
    }

    public static void generateFibonnaci(int d){
        int a = 1, b = 0, c;
        for (int i = 0; i < d; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
