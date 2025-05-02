//14. Write a program to find the value of one number raised to the power of another
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = inp.nextInt();
        System.out.println("Enter the power of that number");
        int b = inp.nextInt();
        long result = 1;
        for (int i = 1; i <=b; i++){
            result *= (a);
        }
        System.out.println(result);
    }
}
