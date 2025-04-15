//Java Program to Compute Quotient and Remainder

package Java;
import java.util.Scanner;
public class Quotient_Remainder {
        public static void main(String[] args){
            Scanner inp = new Scanner(System.in);
            System.out.println("Enter the Two numbers ");
            int a = inp.nextInt();
            float b = inp.nextInt();

            System.out.println("The Quotient of your number is : "+ (a/b));
            System.out.println("The remainder of your number is : "+ (a % b));
        }

}
