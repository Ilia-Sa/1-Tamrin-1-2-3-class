package com.java.ilia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length and width of the square/rectangle :  ");

        System.out.print("Please enter a/length: ");
        double a = scanner.nextFloat();
        System.out.print("Please enter b/width: ");
        double b = scanner.nextFloat();

        AreaCalculator.CalArea(a, b);
    }
}
