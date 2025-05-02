// 7. Write a program to print all even numbers between 1 to 100


public class Even_Num {
//    public static void main(String[] args) {
//        for(int i = 2 ; i<=100; i+=2){
//            System.out.println(i);
//        }
//    }
//}

    public static void main(String[] args) {
        // Another method
        for(int i = 1; i <= 100; i++){
            if (i %2 == 0){
                System.out.println(i);
            }
        }
    }

}