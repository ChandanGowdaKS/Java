package Java;
import java.util.Scanner;

/* tried this but didin't worked


public class Output_formatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1 =sc.next();
            int x =sc.nextInt();
            //Complete this line
        }
        for (int i=1;i<=s1.length();i++){
            System.out.print(s1);
        }
        for (int i=s1.length();i<16;i++){
            System.out.print(" ");
        }
        if(x.length()== 3){
            print(x);
        }
        else if(x.length()==2){
            print(0);
            print(x);
        }
        else if(x.length()==1){
            print("00");
            print(x);
        }
        System.out.println("================================");

    }
}

 */

public class Output_formatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n", s1, x);
        }

        System.out.println("================================");

    }
}



