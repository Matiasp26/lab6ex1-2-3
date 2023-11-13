package com.company;
import java.util.HashSet;

public class Ex2 {

    public static void main(String[] args){
        HashSet<String> books = new HashSet<String>();
        books.add("Book1");
        books.add("Book2");
        books.add("Book3");
        books.add("Book4");
        System.out.println("Books before removal: ");
        System.out.println(books);
        System.out.println(books.contains("Book2"));
        books.remove("Book3");
        System.out.println("Books after removal: ");
        System.out.println(books);
        System.out.println(books.size());
        for(String i : books)
            System.out.println(i);
    }
}
