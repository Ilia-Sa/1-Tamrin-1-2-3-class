//Ilia Safarian
package com.java.ilia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Librarian shopKeeper = new Librarian();
        Librarian bookLender = new Librarian();

        shopKeeper.firstName="Arthur";
        shopKeeper.lastName="Morgan";

        bookLender.firstName="John";
        bookLender.lastName="MacTavish";

        System.out.println(shopKeeper.firstName);
        System.out.println(shopKeeper.lastName);
        shopKeeper.sell();
        System.out.println(bookLender.firstName);
        System.out.println(bookLender.lastName);
        bookLender.lend();
        System.out.println(shopKeeper.firstName);
        System.out.println(shopKeeper.lastName);
        shopKeeper.noBook();
        System.out.println(bookLender.firstName);
        System.out.println(bookLender.lastName);
        shopKeeper.returnBook();

    }
}
