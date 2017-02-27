package Chapter_9.libaray_class_chapter_9;

import java.util.Date;

/**
 * Created by bnamora on 2/10/17.
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    public Account(int id, double balance, double annualInterestRate){
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
        balance = (balance - withdraw);
    }

    public void deposit(double deposit){
        balance = balance + deposit;
    }

    public String toString(){
        return "ID : "+id+"\nBalance : "+balance+
                "\nMonthly Interest  : "+getMonthlyInterest()+"\nDate Create : "+dateCreated;
    }
}
