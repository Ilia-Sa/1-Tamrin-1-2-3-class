package com.java.ilia;

public class EquationSolver {
    public static void SolveEq(double a, double b, double e, double c, double d, double f) {
        System.out.println("Solving equation: a*x + b*y = e, c*x + d*y = f ");

        if ((a*d-b*c)!=0) {
            System.out.format("Where a = %f, b = %f,e = %f, c = %f, d = %f, f = %f\n ", a, b, e, c, d, f);
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);
            System.out.format("x = %f, y = %f\n", x, y);
        }
        else {
            System.out.println("The equation has no result");
        }
    }
}
