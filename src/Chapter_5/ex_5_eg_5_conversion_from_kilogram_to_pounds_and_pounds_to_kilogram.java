package Chapter_5;

/**
 * Created by DWP on 9/28/16.
 */
public class ex_5_eg_5_conversion_from_kilogram_to_pounds_and_pounds_to_kilogram {
    public static void main(String[] args) {

        System.out.printf("%s%15s","Kilogram","Pounds");
        System.out.printf("\t|\t");
        System.out.printf("%s%15s","Pounds","Kilogram\n");

        int kilogram = 1;
        int pounds = 20;

        while(kilogram < 200){
            double kilogramToPounds = kilogram * 2.2;
            double poundsToKilogram = pounds / 2.2;
            if(pounds < 515){
                pounds += 5;
            }
            System.out.printf("%-9d%13.1f",kilogram,kilogramToPounds);
            System.out.print("\t|\t");
            System.out.printf("%-6d%13.2f\n",pounds,poundsToKilogram);
            kilogram ++;
        }


    }
}
