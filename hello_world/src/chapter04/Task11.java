/* Task: Create a Java class to represent a Book and implement a constructor to initialize its attributes.
 */
package chapter04;
// import java.util.*;
// Create a new Java class called "Book" with attributes:
class Book {
    // attributes: title, author, yearPublished, price
    String title;
    String author;
    int yearPublished;
    double price;
    // implement a constructor that takes four parameters corresponding to the attributes
    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }
    // assign setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // assign getters

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        // return as a String object
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                ", price=" + price +
                '}';
    }

    // public void getBookDetails() {
    //     return {this.title, this.author, this.yearPublished, this.price};
    // }

}

public class Task11 {
    public static void main(String[] args) {
        Book[] books = new Book[] {
            new Book("Java Programming", "John Smith", 2021, 39.99),
            new Book("Python Basics", "Jane Doe", 2020, 29.99),
            new Book("C++ Essentials", "Michael Johnson", 2019, 49.99),

        };
//        String bookList = Arrays.toString(books);
//        System.out.println(bookList);

        int count = 0;
        for (Book b : books) {
            ++count;
            System.out.println(b.toString());
        }
    }
}