package Chapter_10;

import Chapter_10.library_class_chapter_10.Tax;

/**
 * Created by bnamora on 2/17/17.
 */
public class ex_8_ch_10_financial_tax_class {
    public static void main(String[] args) {
        int[][] brackets2009 = {
            {8350, 33950, 82250, 171550, 372950},
            {16700, 67900, 137050, 20885, 372950},
            {8350, 33950, 68525, 104425, 186475},
            {11950, 45500, 117450, 190200, 372950}
        };
        double[] rates2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        int[][] brackets2001 ={
                {27050, 65550, 136750, 297350},
                {45200, 109250, 166500, 297350},
                {22600, 54625, 83250, 148675},
                {36250, 93650, 151650, 297350}
        };
        double[] rates2001 = {0.15,   0.275, 0.305,  0.355,  0.391};

        Tax singleFiler = new Tax(Tax.SINGLE_FILER, 50000, brackets2009, rates2009);
        Tax marriedQW = new Tax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW, 50000, brackets2009, rates2009);
        Tax marriedSeparate = new Tax(Tax.MARRIED_SEPARATELY, 50000, brackets2009, rates2009);
        Tax headOfHousehold = new Tax(Tax.HEAD_OF_HOUSEHOLD, 50000, brackets2009, rates2009);

        singleFiler.printTaxTable(60000);
        marriedQW.printTaxTable(60000);
        marriedSeparate.printTaxTable(60000);
        headOfHousehold.printTaxTable(60000);

        for(int status = 0; status < 4; status++) {
             Tax tax2001 = new Tax(status, 50000, brackets2001, rates2001);
             tax2001.printTaxTable(60000);
        }
    }
}