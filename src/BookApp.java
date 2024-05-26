public class BookApp {
    public static void main(String[] args) {
    Book b1 = new Book("Caribian", "Jony ",(short)2023);
    //b1.setTitle("Basics of Java");
    //System.out.println(b1.getTitle());
        System.out.println(b1);
        //System.out.println(b1.getYear());
    }
}
class Book {
    // for the future objects
    private String title;
    private String author;
    private short year;

    //Constructor
    public Book(String title, String author, short year) {
        setTitle(title);
        setAuthor(author);
        setYear(year);
    }
    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        // value can be validated here
        if (title != null && title.length() > 0){  //pesimistic approuch
        this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }
      // todo don't let the author to be null, al least 5 characters
      // todo John Doe" - check if it contains 1 space
      // todo hint: check the String methods
      // todo hint: String.contains("text") check the test interior

    public void setAuthor(String author) {
        if (author == null){
            System.out.println( "The author name is null");}
            if(author.length() < 5){
                System.out.println(" The author name is less that 5 characters");}
                if (author.contains(" ")){
                    System.out.println("The author name contains one space");}
                else
                    this.author = author;
    }

    public short getYear() {
        return year;
    }
    // todo don't allow values under 1900
    //todo don't allow value over 2023
    public void setYear(short year) {
            if(year < 1900 || year > 2023){
                System.out.println( "The year should be between 1900 - 2023");
            } else {
                this.year = year;
            }
    }
    public String toString () {
        return "Book:"+ title + " " + author + " "+ year;
    }
}

