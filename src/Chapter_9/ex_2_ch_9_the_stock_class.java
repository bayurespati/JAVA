package Chapter_9;

import Chapter_9.libaray_class_chapter_9.Stock;

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
