package Chapter_11.library_class_chapter_11;

import Chapter_9.libaray_class_chapter_9.Account;

/**
 * Created by bnamora on 2/27/17.
 */
public class SavingAccount extends Account {

    public SavingAccount(){}

    public SavingAccount(int id, double balance, double annualInterestRate){
        super(id,balance,annualInterestRate);
    }

    public void withdraw(double withdraw){
        double balance = getBalance() - withdraw;
        if(balance < 0){
            System.out.println("Your account balance is not enough doing this withdrawal");
        }else
            setBalance(balance);
    }

    public String toString(){
        return super.toString();
    }
}
