//  Write a program to enter the numbers till
//  the user wants and at the end it should display the count of positive, negative and zeros entered


import java.util.Scanner;

public class NumberCalculation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        boolean condition = true;
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        int a;
        while(condition){
        System.out.println("1. enter the number \n2. enter any 01 to exit:");
        a =  inp.nextInt();

        if (a == 0 ){
            zeros +=1;
        } else if (a >=1) {
            positive +=1;
        } else if (a<0) {
            negative +=1;
        }
//         System.out.print("Do you want to Continue y/n? ");
//            char choice = inp.next().charAt(0);
//            if (choice == 'y' || 'Y') {
//            }
//            else{



        }
        System.out.println("positive : "+ positive);
        System.out.println("negative: " +negative);
        System.out.println("zeros" +zeros);
}}}
