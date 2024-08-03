package com.company;

// you have to implement a library using java class "Library"
// Method: addBook, issueBook, returnBook, showAvailableBooks
// properties: Array to store the available books,
// array to store the issued books
class Library {
    String[] books;
    int no_of_books;

    Library() { // constructor
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addbook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    void showAvailableBooks() {
        System.out.println("Available Books are:");
        for (String book : this.books) {
            if (book == null) {
                //break;
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
                if (this.books[i].equals(book)) {
                    System.out.println("The book has been issued!");
                    this.books[i] = null;
                   // return;
                }
            }
            System.out.println("This book does not exist");
        }
        void returnBook(String book){
        addbook(book);
        }
    }
public class cwp_ex4sol {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addbook("Think and grow Rich");
        centralLibrary.addbook("Discrete Mathematics");
        centralLibrary.addbook("Web Development");
        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("Web Development");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("Web Devlopment");
        centralLibrary.showAvailableBooks();
    }
}
