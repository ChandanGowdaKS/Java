/* Develop a Java program to illustrate classes, objects and constructors. Create a class Product with data
        members: code, name, quantity, and price. Demonstrate appropriate accessor, mutator and driver
methods with N Product objects.
*/


import java.util.Scanner;

public class Product {
    int code,quantity,price;
    String name;

    // constructor
    public Product(String name,int code,int quantity,int price){
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
     String getname(){
         return name;
    }
    public int getcode(){
        return code;
    }
    public int getquantity(){
        return quantity;
    }
    public int getprice(){
        return price;
    }

    //setter

    void setname(String name){
        this.name = name;
    }
    void setCode(){
        this.code = code;
    }
    void setQuantity(){
        this.quantity = quantity;
    }
    void setPrice(){
        this.price = price;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number of products:");
        int N = inp.nextInt();

        Product obj[] = new Product[N];
        for (int i=0; i<N; i++){
            System.out.println("Enter the name:");
            inp.nextLine();
            String name = inp.nextLine();

            System.out.println("Enter the code");
            int code = inp.nextInt();
            System.out.println("Enter the Quantity:");
            int quantity = inp.nextInt();
            System.out.println("Enter the price:");
            int price = inp.nextInt();

            obj[i] = new Product(name,code,quantity,price);
        }
        obj[0].code = (obj[0].getcode()+10);
        for(int p =0; p<N ; p++){
            System.out.println("Name "+ obj[p].getname() + "\n Code " + obj[p].getcode() +
                    "\n quantity "+ obj[p].getquantity() + "\n Price " + obj[p].getprice());
        }
    }
}