// Write a program to find sum of all natural numbers between 1 to n
import java.util.*;

public class SumOfNAturalNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the number to sum :");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int result = 0;
        for (int i = 1; i<=n; i++ ){
            result += i;
            System.out.println(result);
        }
        System.out.println(result);
    }
}

