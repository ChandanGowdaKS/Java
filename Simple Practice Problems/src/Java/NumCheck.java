// Program to Check Whether a Number is Positive or Negative

package Java;

import java.util.Scanner;
public class NumCheck {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println(" Enter the number to check whether it's positive or negative");
        int a = inp.nextInt();
        if (a <0){
            System.out.println("Its a negative number");
        }
        else if( a == 0){
            System.out.println(" Its neither negative nor positive");
        }
        else {
            System.out.println("It's Positive number");
        }
    }
}
