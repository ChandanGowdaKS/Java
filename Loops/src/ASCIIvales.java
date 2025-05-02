// 12. Write a program to print the ASCII values
import java.sql.SQLOutput;
import java.util.*;
public class ASCIIvales {
    public static void main(String[] args) {
        for (char a = 'a'; a <= 'z'; a++) {
            System.out.println((int) a);
        }

        System.out.println("enter the character to print that in Ascii code:");
                Scanner inp = new Scanner(System.in);
        char a = inp.next().charAt(0);
        System.out.println("Your AScii code is :"+(int) a);
    }
}
