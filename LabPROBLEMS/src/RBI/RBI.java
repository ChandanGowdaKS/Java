package RBI;

public interface RBI {
    int min_balance = 1000;
    String Rules = "Strict";
    void deposit(int depo);
    void withdraw(int with);
    void getbalance();
}
