//write a program to Check Whether a Given Number is Prime or Not

import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = inp.nextInt();
        boolean check = true;
        while(check){
            if (a == 1) {
                System.out.println("its not a prime");
                break;
            }
            if (a % 2 == 0 ){
                if(a != 2){
                    System.out.println("ita a not prime");
                }
                else{
                    System.out.println("its a prime");
                }
            }
            else if (a % 3 == 0 ){
                if(a != 3){
                    System.out.println("ita a not prime");
                }
                else{
                    System.out.println("its a prime");
                }
            }
            else if (a % 5 == 0){
                if(a != 5){
                    System.out.println("ita a not prime");
                }
                else{
                    System.out.println("its a prime");
                }
            }
            else if (a % 7 == 0){
                if(a != 7){
                    System.out.println("ita a not prime");
                }
                else{
                    System.out.println("its a prime");
                }
            }
            else {
                System.out.println("Its a prime");
            }
            check = false;
        }
    }}


