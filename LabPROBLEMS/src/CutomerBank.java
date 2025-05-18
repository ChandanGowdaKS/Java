import SBI.*;
import HDFC.*;

public class CutomerBank {
    public static void main(String[] args) {
        System.out.println("------SBI Transaction------");
        SBi sbiobj = new SBi();
        sbiobj.deposit(5000);
        sbiobj.withdraw(1000);
        sbiobj.withdraw(6000);
        sbiobj.getbalance();

        System.out.println("-----------HDFC Transaction-------");
        HDFC HDFCobj = new HDFC();
        HDFCobj.deposit(6000);
        HDFCobj.withdraw(7000);
        HDFCobj.withdraw(200);
        HDFCobj.getbalance();
    }
}
