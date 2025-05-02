// Write a program to find sum of all even numbers between 1 to n
import java.util.*;
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the nummber to sum :");
        int n = inp.nextInt();
        int res = 0;
        for (int i = 2; i <= n; i += 2) {
            res += i;
        }
        System.out.println(res);
    }
}
