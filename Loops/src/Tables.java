import java.util.*;

public class Tables {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number to print The tables of that Number:");
        int a = inp.nextInt();
        System.out.println("You Entered a number : "+a);
        System.out.println("-------------------------------------------------------------------------");
        int i = 1;
        while (i <= 10){
            System.out.println(a + " X "+ i + " = "+ (a*i));
            i++;
        }
        int j = 1;
        while (j <= 10){
            System.out.printf("%d X %d = %d%n",a,j,(a*j));
            j++;
        }

    }}

