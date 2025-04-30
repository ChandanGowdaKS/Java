public class pat1 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < n; row++) {
            for (int col = 1; col <= row*2+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
