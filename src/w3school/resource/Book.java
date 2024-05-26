package w3school.resource;
//TODO Write a Java program to create a class called "Book"
// with attributes for title, author, and ISBN, and methods to add and remove books from a collection
public class Book {
    private String title;
    private String author;
    private long ISBN;

    //Book [] book = new Book();

    public static void main(String[] args) {

    }
    public Book(String title, String author, long ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
}
