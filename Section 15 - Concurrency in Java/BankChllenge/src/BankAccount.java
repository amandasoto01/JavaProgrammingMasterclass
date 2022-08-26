import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private String accountNumber;
    private Lock bufferLock;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.bufferLock = new ReentrantLock();
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        // Challenge 5
        try {
            if (bufferLock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try {
                    balance += amount;
                } finally {
                    bufferLock.unlock();
                }
            } else {
                System.out.println("Could not get the lock");
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        // Challenge 4
        /* bufferLock.lock();
        try {
            balance += amount;
        } finally {
            bufferLock.unlock();
        }*/

        // Challenge 1 and 2
        /*  synchronized (this) {
            balance += amount;
        }*/
    }

    public void withdraw(double amount) {
        try {
            if(bufferLock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try {
                    balance -= amount;
                } finally {
                    bufferLock.unlock();
                }
            } else {
                System.out.println("Could not get the lock");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Challenge 4
        /*bufferLock.lock();
        try {
            balance -= amount;
        } finally {
            bufferLock.unlock();
        }*/

        // Challenge 1 and 2
        /*
        synchronized (this) {
            balance -= amount;
        } */
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber() {
        System.out.println("Account number = " + accountNumber);
    }

}