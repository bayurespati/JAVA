package Chapter_11.library_class_chapter_11;

import Chapter_9.libaray_class_chapter_9.Account;

/**
 * Created by bnamora on 2/27/17.
 */
public class CheckingAccount extends Account {
    private double limitOverDraft = 3000;
    public double overdraft;

    public CheckingAccount(int id, double balance, double annualInterestRate){
        super(id,balance,annualInterestRate);
    }

    public void withdraw(double withdraw){
        double overdraft = withdraw - getBalance();
        if(getBalance() - withdraw < 0){
            if(overdraft > limitOverDraft){
                System.out.println("You can't make withdraw because overdraft limit");
            }else
                setBalance(0);
                this.overdraft = overdraft;
        }else
            setBalance(getBalance() - withdraw);

    }

    public String toString(){
        return super.toString()+"\nOverdraft : "+overdraft;
    }
}
