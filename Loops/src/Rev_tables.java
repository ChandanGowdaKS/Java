import java.util.*;

public class Rev_tables {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number to Print The Tables in Reverse order");
        int a= inp.nextInt();
        System.out.printf("Your number is %d%n",a);
        System.out.println("-------------------------------------------------------------------");
        for (int i =10;i>=1;i--){
            System.out.printf("%d X %d = %d%n",a,i,(a*i));
        }
    }

}
