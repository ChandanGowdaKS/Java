// Program to Find Factorial of a Number

package Java;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number to Calculate Factorial");
        int a = inp.nextInt();
        int result = 1;
        for ( int i = a; i >= 1; i--){
            result *=i;
        }
        System.out.println("Factorial of "+ a + " is "+ result);
    }
}
