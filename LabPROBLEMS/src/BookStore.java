/* Develop a Java program to demonstrate book sales. Create a class Book with data members: id, course
title, author, publisher, edition and price. Design the program to perform the following operations with
appropriate methods.
i. Find total number of books with same course title.
ii. Find and print the book with the highest price.
*/

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String courseTitle;
    String author;
    String publisher;
    String edition;
    double price;

    // Constructor
    public Book(int id, String courseTitle, String author, String publisher, String edition, double price) {
        this.id = id;
        this.courseTitle = courseTitle;
        this.author = author;
        this.publisher = publisher;
        this.edition = edition;
        this.price = price;
    }

    // Method to display book details
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Course Title: " + courseTitle);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Edition: " + edition);
        System.out.println("Price: $" + price);
        System.out.println("-------------------------");
    }
}

public class BookStore {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        // Sample book entries (you can change or expand this)
        books.add(new Book(1, "Java Programming", "Herbert Schildt", "McGraw-Hill", "8th", 500.0));
        books.add(new Book(2, "Data Structures", "Mark Allen Weiss", "Pearson", "3rd", 550.0));
        books.add(new Book(3, "Java Programming", "James Gosling", "Sun Microsystems", "1st", 600.0));
        books.add(new Book(4, "Operating Systems", "Galvin", "Wiley", "9th", 750.0));
        books.add(new Book(5, "Java Programming", "E. Balagurusamy", "McGraw-Hill", "7th", 480.0));

        Scanner scanner = new Scanner(System.in);

        // i. Count books with same course title
        System.out.print("Enter course title to count books: ");
        String searchTitle = scanner.nextLine();
        int count = 0;
        for (Book b : books) {
            if (b.courseTitle.equalsIgnoreCase(searchTitle)) {
                count++;
            }
        }
        System.out.println("Total number of books with course title '" + searchTitle + "': " + count);

        // ii. Find and print the book with highest price
        Book mostExpensive = books.get(0);
        for (Book b : books) {
            if (b.price > mostExpensive.price) {
                mostExpensive = b;
            }
        }

        System.out.println("\nBook with the highest price:");
        mostExpensive.display();
    }
}
