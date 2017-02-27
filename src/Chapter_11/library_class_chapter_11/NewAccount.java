package Chapter_11.library_class_chapter_11;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by bnamora on 2/27/17.
 */
public class NewAccount {
    private String name;
    private int id;
    private ArrayList<Transaction> transaction = new ArrayList<Transaction>();
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    public NewAccount(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    public NewAccount (String name, int id, double balance, double annualInterestRate ){
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public NewAccount(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public String getDateCreated(){
        return dateCreated.toString();
    }

    public void setId(int id){
        this.id = id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public void setDateCreated(Date dateCreated){
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate(){
        return (annualInterestRate / 12) / 100;
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double withdraw){
        transaction.add(new Transaction('w',withdraw,(balance - withdraw),"Doing withdrawal"));
    }

    public void deposit(double deposit){
        transaction.add(new Transaction('D',deposit,(balance + deposit),"Doing Deposit"));
    }

    public String toString(){
        return "Name : "+name+
                "\nInterestRate : "+annualInterestRate+
                "\nBalance : "+balance;
    }

    public void printTransaction(){
        for(int i = 0; i < transaction.size(); i++)
            System.out.println(transaction.get(i).toString());
    }
}
