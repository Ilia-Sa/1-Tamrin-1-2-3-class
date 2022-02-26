package com.java.ilia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the coefficients of equation :  a*x + b*y = e, c*x + d*y = f");

        System.out.print("Please enter a: ");
        double a = scanner.nextFloat();
        System.out.print("Please enter b: ");
        double b = scanner.nextFloat();
        System.out.print("Please enter e: ");
        double e = scanner.nextFloat();
        System.out.print("Please enter c: ");
        double c = scanner.nextFloat();
        System.out.print("Please enter d: ");
        double d = scanner.nextFloat();
        System.out.print("Please enter f: ");
        double f = scanner.nextFloat();

        EquationSolver.SolveEq(a, b, e, c, d, f);
    }

}
