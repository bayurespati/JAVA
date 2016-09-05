package Chapter_1;

/**
 * Created by DWP on 9/5/16.
 (Population projection) The U.S. Census Bureau projects population based on the following assumptions:

 .One birth every 7 second
 .One death every 13 second
 .One new immigrant every 45 second

 Write a program to display the population for each of the next five years. Assume the current population is 312,032,486 and one year has 365 days.
 Hint: In Java, if two integers perform division, the result is an integer. The fractional part is truncated.
 For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with the fractional part,
 one of the values involved in the division must be a number with a decimal point.
 For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.

 */
public class ex_11_ch_1_population_projection {
    public static void main(String[] args) {
        double population = 312032486;
        double year = 3600 * 24 * 365 * 5;
        double birth= year/7;
        double death= year/13;
        double immigrant= year/45;
        double total = birth+immigrant-death;
        double population1= population+total;
        double population2= population1+total;
        double population3= population2+total;
        double population4= population3+total;
        double population5= population4+total;


        System.out.println("Population first year = "+(population1));
        System.out.println("Population first year = "+(population2));
        System.out.println("Population first year = "+(population3));
        System.out.println("Population first year = "+(population4));
        System.out.println("Population first year = "+(population5));
    }
}
