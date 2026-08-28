import java.util.Iterator;
import java.util.Iterator;

class Bank {

    synchronized void withdraw(int amount) {
        System.out.println("Withdrawing " + amount);
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Withdrawal completed");
    }
}

class MyThread extends Thread {
    Bank bank;

    MyThread(Bank bank) {
        this.bank = bank;
    }

    public void run() {
        bank.withdraw(500);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        MyThread t1 = new MyThread(bank);
        MyThread t2 = new MyThread(bank);

        t1.start();
        t2.start();
    }
}