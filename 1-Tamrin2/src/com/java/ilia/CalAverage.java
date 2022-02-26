//Ilia Safarian
package com.java.ilia;
import javax.swing.*;
import java.util.*;

public class CalAverage {
    public static void main(String[] args) {
        System.out.println("Calculate the Average score the student: ");

        Scanner scanner = new Scanner(System.in);
        double x;

        System.out.print("Enter the grade of Physics and it's coefficient: ");
        double p = scanner.nextFloat();
        double p1 = scanner.nextFloat();//coefficient
        System.out.print("Enter the grade of Mathematics and it's coefficient: ");
        double m = scanner.nextFloat();
        double m1 = scanner.nextFloat();
        System.out.print("Enter the grade of Advanced Programing and it's coefficient: ");
        double a = scanner.nextFloat();
        double a1 = scanner.nextFloat();
        System.out.print("Enter the grade of Differential equations and it's coefficient: ");
        double d = scanner.nextFloat();
        double d1 = scanner.nextFloat();
        System.out.print("Enter the grade of Discrete mathematics and it's coefficient: ");
        double dm = scanner.nextFloat();
        double dm1 = scanner.nextFloat();
        System.out.println(x = ((p * p1 + m * m1 + a * a1 + d * d1 + dm * dm1) / (p1 + m1 + a1 + d1 + dm1)));
        System.out.println(x);
        if (x > 12)
            System.out.println("Passed");
        else if (12 > x && x > 10)
            System.out.println("Academic probation");
        else
            System.out.println("Faild");
        }
    }


