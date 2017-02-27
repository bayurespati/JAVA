package Chapter_11;

import Chapter_11.library_class_chapter_11.CheckingAccount;
import Chapter_11.library_class_chapter_11.SavingAccount;
import Chapter_9.libaray_class_chapter_9.Account;

/**
 * Created by bnamora on 2/27/17.
 */
public class ex_3_ch_11_subclass_of_account {
    public static void main(String[] args) {
        Account account = new Account(1122,20001,4.5);
        System.out.println(account.toString());

        Account account1 = new Account(1123,20002,4.5);
        System.out.println(account1.toString());

        CheckingAccount checkingAccount = new CheckingAccount(1124,20003,4.5);
        checkingAccount.withdraw(24000);
        System.out.println(checkingAccount.toString());


        SavingAccount savingAccount = new SavingAccount(1125,20004,4.5);
        savingAccount.withdraw(20005);
        System.out.println(savingAccount.toString());

    }
}
