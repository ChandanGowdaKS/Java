// Program to Display Fibonacci Series
/* The Fibonacci series is a series where the next term is the sum of the previous two terms.
The first two terms of the Fibonacci sequence are 0 followed by 1.

Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/

package Java;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = inp.nextInt();
        int first_num1 = 0;
        int last_num = 1;

        int result = 0;

        for (int i = 1; i<=a; ++i){
            System.out.print(result+" ");

            result = first_num1 + last_num;
            first_num1 = last_num;
            last_num = result;
        }
    }
}
