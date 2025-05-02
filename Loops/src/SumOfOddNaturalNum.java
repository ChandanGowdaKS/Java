// 11. Write a program to find sum of all odd numbers between 1 to n

import java.util.*;
public class SumOfOddNaturalNum {
//    public static void main(String[] args) {
//        Scanner inp = new Scanner(System.in);
//        System.out.println("Enter the number to Add SUm of odd Natural Numbers:");
//        int n = inp.nextInt();
//        int res = 0;
//        for (int i =1; i <=n; i+=2){
//            res += i;
//            System.out.println(res);
//        }
//        System.out.println(res);
//    }
//}
public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter the number to Add SUm of odd Natural Numbers:");
    int n = inp.nextInt();
    int res = 0;
    for (int i =1; i <=n*2; i+=2){
            res += i;
            System.out.println(res);
        }
        System.out.println(res);
    }
}
