// Finding Largest among three numbers
package Java;
import java.util.Scanner;


public class Largest {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter The three Numbers to find largest among them");
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("The is the largest among three is : " + a);
            } else {
                System.out.println("The is the largest among three is : " + c);
            }
        }
        else if(b > c){
                System.out.println("The is the largest among three is : "+ b);
            }
        else {
            System.out.println("The is the largest among three is : " + c);
        }


    }

}
