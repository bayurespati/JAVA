package Chapter_11.library_class_chapter_11;

/**
 * Created by bnamora on 2/27/17.
 */
public class Transaction {
    private java.util.Date date = new java.util.Date();
    private char type;
    private double amount;
    private double balance;
    private String description;


    public Transaction(){
    }

    public Transaction(char type, double amount,double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public java.util.Date getDate(){
        return date;
    }

    public char getType(){
        return type;
    }

    public double getAmount(){
        return amount;
    }

    public double getBalance(){
        return balance;
    }

    public String getDescription(){
        return description;
    }

    public void setType(char type){
        this.type = type;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String toString(){
        return "\nTransaction Date : "+date+
                "\nType : "+type+
                "\nAmount : "+amount+
                "\nBalance : "+balance+
                "\nDescription : "+description;
    }

}
