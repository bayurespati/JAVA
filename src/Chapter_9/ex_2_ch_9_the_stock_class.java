package Chapter_9;

/**
 * Created by bnamora on 2/9/17.
 */
public class ex_2_ch_9_the_stock_class {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL","Oracle Corporation");
        stock.setPreviousClosingPrice(35.5);
        stock.setCurrentPrice(34.5);
        System.out.println("Change percentage Of "+stock.getName()+" is : "+stock.getChangePercent());
    }
}

class Stock{
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public String getSymbol(){
        return symbol;
    }

    public String getName(){
        return name;
    }

    public double getPreviousClosingPrice(){
        return previousClosingPrice;
    }

    public double getCurrentPrice(){
        return previousClosingPrice;
    }

    public void setSymbol(String symbol){
        this.symbol = symbol;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPreviousClosingPrice(double previousClosingPrice){
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }

    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent(){
        double percent = (currentPrice - previousClosingPrice) / ((currentPrice + previousClosingPrice) / 2) * 100;
        return (percent < 0) ? -(percent) : percent;
    }
}
