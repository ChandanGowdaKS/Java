package SBI;
import RBI.*;
public class SBi implements RBI{
//    int depo;
//    int with;
    int balance = 0;
    public void deposit(int depo){
        balance +=depo;
        System.out.println("You deposited : "+depo);
    }
    public void withdraw(int with){
        if(with> balance - min_balance){
            System.out.println("can't withdraw, " + with +" Amount is higer than balance & RBI rule");
        }
        else {
            System.out.println("Withdrawing Amount : "+with);
            balance -= with;
            System.out.println("Balance : "+balance);
        }
    }
    public void getbalance(){
        System.out.println("Balance : "+balance);
    }
}
