package Chapter_12.library_class_chapter_12;

/**
 * Created by bnamora on 3/7/17.
 */
public class LoanWithException {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public LoanWithException(){
        this(2.5, 1, 1000);
    }

    public LoanWithException(double annualInterestRate, int numberOfYears, double loanAmount){
        setAnnualInterestRate(annualInterestRate);
        setLoanAmount(loanAmount);
        setNumberOfYears(numberOfYears);
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException{
        if(annualInterestRate > 0){
            this.annualInterestRate = annualInterestRate;
        }
        else
            throw new IllegalArgumentException("Annual interest Rate can be negative or zero");
    }

    public int getNumberOfYears(){
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) throws  IllegalArgumentException{
        if(numberOfYears > 0)
            this.numberOfYears = numberOfYears;
        else
            throw new IllegalArgumentException("number Of years cannot be negative or zero");
    }

    public double getLoanAmount(){
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) throws  IllegalArgumentException{
        if(loanAmount > 0)
            this.loanAmount = loanAmount;
        else
            throw new IllegalArgumentException("Loan Amount cannot be negative or zero");
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 1200;
        return loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate,numberOfYears * 12)));
    }

    public double getTotalPayment(){
        return getMonthlyPayment() * numberOfYears * 12;
    }

    public java.util.Date getLoanDate(){
        return loanDate;
    }
}
