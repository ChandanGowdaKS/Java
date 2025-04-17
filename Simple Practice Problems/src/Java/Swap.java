// Swapping Two numbers
package Java;

public class Swap {
    public static void main(String[] args){
        // using temporary variable
        int a = 10;
        int b = 20;
        System.out.println(" Before Swapping a = "+ a + " b = "+ b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(" After Swapping a = "+ a + " b = "+ b);

        // without temporary variable
        a = 10;
        b = 20;
        a = a+b;
        b = a - b;
        a = a - b;
        System.out.println("without temporary variable After Swapping  a = "+ a + " b = "+ b);
        // diffrent method
        a = 10;
        b = 20;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("Different method After Swapping  a = "+ a + " b = "+ b);
        //System.out.println(10^20);
        // one more df method
        a = a+b-(b=a);
        System.out.println("After Swapping  a = "+ a + " b = "+ b);
    }
}
