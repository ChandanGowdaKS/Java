// Program to Check Whether a Character is Alphabet or Not

package Java;

import java.util.Scanner;
public class AlphabetORnot {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the any letter to check whether it's a Alphabet or not");
        char a = inp.next().charAt(0);

        if (Character.isAlphabetic(a)){
            System.out.println("Its Alphabet");
        }
        else{
            System.out.println("Its not a alphabet");
        }
    }
}
