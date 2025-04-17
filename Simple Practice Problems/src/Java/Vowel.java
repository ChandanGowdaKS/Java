// program to check whether the alphabet is Vowel or consonant
package Java;
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args){
        // On first try
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the alphabet to check it is Vowel or not");
        char User_input = inp.next().charAt(0);

//        switch (User_input){
//            case 'a' :
//                System.out.println("A is a Vowel");
//                break;
//            case 'e' :
//                System.out.println("e is a Vowel");
//                break;
//            case 'i' :
//                System.out.println("i is a Vowel");
//                break;
//            case 'o' :
//                System.out.println("o is a Vowel");
//                break;
//            case 'u' :
//                System.out.println("u is a Vowel");
//                break;
//            default:
//                System.out.println("Its a consonant");
//                break;

        // Second case
        /*    switch (User_input) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("Your input "+ User_input +" is Vowel");
                    break;
                default:
                    System.out.println("Its a Consonant");
                    break;
*/

        // Third Case
        switch (Character.toLowerCase(User_input)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Your input "+ User_input +" is Vowel");
                break;
            default:
                if( Character.isLowerCase(User_input)) {
                    System.out.println("Its a Consonant");
                }
                else{
                    System.out.println("Invalid input");
                    }
                }

        }

    }

