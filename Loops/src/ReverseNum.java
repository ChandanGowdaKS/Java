
import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number to Add:");
        int num = inp.nextInt();
        int finalresult = 0;
        int result =0;
        while(num >0){
            int rem = num%10;
            result = result*10+rem;
            num /=10;
        }
        System.out.println(result);
    }
}
