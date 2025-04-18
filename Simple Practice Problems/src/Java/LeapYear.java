// Program to Check Leap Year

/* A leap year is exactly divisible by 4 except for century years (years ending with 00).
 The century year is a leap year only if it is perfectly divisible by 400.

 Any year that is divisible by 4 is a leap year, such as 2016, 2020, 2024, 2028. Note: The above rule does not apply to century years.
  Centuries such as 1900 and 2000 only have a leap day if they are divisible by 400. 1900 is divisible by 4 and also by 100,
  but not by 400, so not a leap year.*/
package Java;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        boolean leap = false;
        System.out.println("Please Enter the Year to check it's Leap year or not");
        int a = inp.nextInt();
        if ( a % 4 == 0){
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    leap = true;
                }
                else {
                    leap = false;
                }
            }
            else {
                leap = true;
                }
        }
        else {
            leap = false;
        }
        if (leap){
            System.out.println(" The year "+ a + " is a leap Year");
        }
        else {
            System.out.println(" The year "+ a + " it's not a leap Year");
        }
    }
}
