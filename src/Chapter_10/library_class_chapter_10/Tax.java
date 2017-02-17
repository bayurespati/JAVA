package Chapter_10.library_class_chapter_10;

/**
 * Created by bnamora on 2/17/17.
 */
public class Tax {
    private int fillingStatus;
    private double taxableIncome;
    private int[][] brackets;
    private double[] rates;
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;
    private String[] status = {"single filer", "married jointly or qualifying widow(er)", "married separately" ,"head of household"};

    public Tax(){
        this.fillingStatus = 0;
        this.taxableIncome = 50000;
    }

    public Tax(int fillingStatus, double taxableIncome, int[][] brackets, double[] rates){
        this.fillingStatus = fillingStatus;
        this.taxableIncome = taxableIncome;
        this.brackets = brackets;
        this.rates = rates;
    }

    public int getFillingStatus(){
        return fillingStatus;
    }

    public double getTaxableIncome(){
        return taxableIncome;
    }

    public int[][] getBracket(){
        return brackets;
    }

    public double[] rate(){
        return rates;
    }

    public void setFillingStatus(int fillingStatus){
        this.fillingStatus = fillingStatus;
    }

    public void setTaxableIncome(double taxableIncome){
        this.taxableIncome = taxableIncome;
    }

    public void setBracket(int[][] brackets){
        this.brackets = brackets;
    }

    public void setRates(double[] rates){
        this.rates = rates;
    }

    public double getTax(){
        return getTaxForEachStatus();
    }

    public double getTaxForEachStatus(){
        int limitIteration = getLimitFromIncome();
        double tax = 0;
        for(int i = 0; i < limitIteration; i++){
            if( i == 0) {
                tax += brackets[fillingStatus][i] * rates[i];
            }else
                tax += (brackets[fillingStatus][i] - brackets[fillingStatus][i - 1]) * rates[i];
        }
        tax += ((taxableIncome - brackets[fillingStatus][limitIteration - 1]) * rates[limitIteration]);
        return tax;
    }

    public int getLimitFromIncome(){
        for(int i = 0; i < brackets[0].length; i++){
            if(taxableIncome <= brackets[fillingStatus][i]){
                return i;
            }
        }
        return brackets[0].length;
    }

    public void printTaxTable(double limit){
        for(double income = taxableIncome; income <= limit; income += 1000){
            System.out.println(status[fillingStatus]+" income : "+income+" tax : "+getTax());
        }
    }
}
