//Ilia Safarian
package com.java.ilia;


public class Librarian {
    public int libraryNumber;
    public String firstName;
    public String lastName;

    public void lend()
    {
        System.out.println("the book has been lent.");
    }
    public void returnBook()
    {
        System.out.println("the book has been returned.");
    }
    public void sell()
    {
        System.out.println("the book has been sold.");
    }
    public void noBook()
    {
        System.out.println("the book is no longer available.");
    }

}
