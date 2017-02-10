package Chapter_9;

import Chapter_9.libaray_class_chapter_9.Account;

/**
 * Created by bnamora on 2/10/17.
 */
public class ex_7_ch_9_the_account_class {
    public static void main(String[] args) {
        Account account = new Account(1122,20000,4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("ID : "+account.getId());
        System.out.println("Balance : "+account.getBalance());
        System.out.println("Monthly Interest : "+account.getMonthlyInterest());
        System.out.println("Date Create : "+account.getDateCreated());
    }
}
