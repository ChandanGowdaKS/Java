import java.util.Scanner;

public class Book{
    int id,edition;
    String course,title,author,publisher;
    double price;
Scanner a = new Scanner(System.in);
    public void read(){
        System.out.println("Enter the Cousre of the Book");
        course = a.nextLine();
        System.out.println("Enter the Title of the Book");
        title = a.nextLine();
        System.out.println("Enter the author of the Book");
        author = a.nextLine();
        System.out.println("Enter the Publisher of the Book");
        publisher = a.nextLine();
        System.out.println("Enter the id of the Book");
        id = a.nextInt();
        System.out.println("Enter the edition of the Book");
        edition = a.nextInt();
        System.out.println("Enter the price of the Book");
        price = a.nextDouble();       
    }

    public void display(){

        System.out.println("Cousre of the Book: "+course);
        System.out.println("Title of the Book: "+title);
        System.out.println("author of the Book: "+author);
        System.out.println("Publisher of the Book: "+publisher);
        System.out.println("id of the Book: "+id);
        System.out.println("edition of the Book : "+edition);
        System.out.println("price of the Book :"+price);
        System.out.println();
    }
    
    public static void main(String[] args){
        int n;
        System.out.println("Enter the number of books:");
        Scanner a = new Scanner(System.in);
        n = a.nextInt(); 
       
       Book b1[] = new Book[n];
       for(int i=0;i<n;i++){
        b1[i] = new Book();
        b1[i].read();
    }
    for(int i=0;i<n;i++){
        b1[i].display();
    }
    double price1;
    for(int i=0; i<b[i];i++){
        if(this.price > price1){
            price1 = this.price;
        }
    }



}}
// completed completed

