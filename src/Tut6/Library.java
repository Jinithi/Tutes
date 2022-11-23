package Tut6;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<Book>();

    void populate() {
        for (int i = 1; i <= 4; i++) {

            Book book = new Book();
            book.author = "author" + i;
            book.title = "title" + i;

            books.add(book);
        }
    }

    void displayAllBooks() {
        for (int i=0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println("Author of the book is : " + book.author );
            System.out.println("Title of the book is : "+book.title);
        }
    }

    public static void main(String[] args) {
        Library library1 = new Library();
        library1.populate();
        library1.displayAllBooks();
    }



}
