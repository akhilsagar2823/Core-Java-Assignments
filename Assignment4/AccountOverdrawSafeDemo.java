package Assignment4;

public class AccountOverdrawSafeDemo implements Runnable {
    private static Account account = new Account();

    @Override
    public void run() {
        AccountOverdrawSafeDemo.debit();
    }

    static synchronized void debit() {
        int debitmoney = 102;
        int i = 0;
        while (i != 5) {
            if (account.balance >= debitmoney) {
                System.out.println(Thread.currentThread().getName() + " debited " + debitmoney + " from Account.");
                account.withdraw(debitmoney);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Error Occured !!");
                }
            } else {
                System.out.println("Account has no enough money.\n!! Transaction Failed !!");
            }
            System.out.println("\nRemaining Balance = " + account.balance);
            i++;
        }
    }
}
