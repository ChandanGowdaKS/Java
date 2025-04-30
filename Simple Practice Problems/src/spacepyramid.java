public class spacepyramid {
    public static void main(String[] args) {
        int n = 5;
        String s = " ";
       int n1=n;
       boolean a = true;
            for (int row = 0; row < n; row++) {
                while(a){
                for (int sp = n1;sp > 1;sp-- ) {
                    System.out.print(s);
                }
                a = false;
                }
                n1-=1;
                for (int col = 1; col <= row * 2 + 1; col++) {
                    System.out.print("*");
                    a = true;
                }


                System.out.println();
        }
    }
}
