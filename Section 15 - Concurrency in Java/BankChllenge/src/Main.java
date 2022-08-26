public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00, "12345-678");

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(300.00);
                account.withdraw(50.00);
                System.out.println("New  balance thread1: " + account.getBalance());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(203.75);
                account.withdraw(100.00);
                System.out.println("New balance thread2: " + account.getBalance());
            }
        });

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}