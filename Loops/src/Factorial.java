//Write a program to find the factorial value of any number

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number to Find Factorial of That number :");
        int a = inp.nextInt();
        int result = 1;
        for (int i =a; i>= 1; i--){
            result *=i;
            System.out.println(result);
        }
        System.out.println(result);
    }
}
