public class Publ {
    void display(){
        System.out.println("Hello Bro! this is without static");
        //Checking whether this method will work or not without creating object to this class
    }
    static void dis(){
        System.out.println("Hello Bro! this is with static");
    }
    public static void main(String[] args){
        dis();
       // display();  it will not work we need to create object
        Publ obj = new Publ();
        //obj.display();
    }
}
