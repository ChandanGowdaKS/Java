// Program to Calculate the Sum of Natural Numbers

package Java;

import java.util.Scanner;
public class Natural_num {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = inp.nextInt();
        int result = 0;
        for ( int i = 1; i <= num ; i++){
            result +=i;
        }
        System.out.println("The Sum of natural number for "+ num+ " is : "+ result);
    }
}
