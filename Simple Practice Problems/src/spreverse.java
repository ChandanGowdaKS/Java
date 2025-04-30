class spreverse {
    public static void main(String[] args) {
        int n = 5;
        for (int row = n; row>=0; row--) {
            for (int sp = 1;sp <= n-row;sp++){
                System.out.print(" ");
            }
            for (int col = 1; col <= row * 2 + 1; col++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
