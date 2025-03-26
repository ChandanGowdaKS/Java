

import java.util.Scanner;


public class Ifelse {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number");
        if (scanner.hasNextInt()) {
            
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (n % 2 == 0 && n >=2 && n<=5 || n % 2 == 0 && n > 20){
            System.out.println("Not Weird");
        }
        else if(n % 2== 0 && n >=6 && n <= 20){
            System.out.println("Weird");
        }
        else if(n % 2!=0){
            System.out.println("Weird");
        }
    }
    else{
        System.out.println("Please enter a valid number");
    }

        scanner.close();
    }
}
 // Due to internals not practiced today 26/3/25
 // Due to internals not practiced today 27/3/25
