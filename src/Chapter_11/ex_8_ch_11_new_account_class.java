package Chapter_11;

import Chapter_11.library_class_chapter_11.NewAccount;

/**
 * Created by bnamora on 2/27/17.
 */
public class ex_8_ch_11_new_account_class {
    public static void main(String[] args) {
        NewAccount account = new NewAccount("George",1122,1000,1.5);
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println(account.toString());
        account.printTransaction();
    }
}
