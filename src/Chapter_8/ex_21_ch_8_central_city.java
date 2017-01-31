package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 1/31/17.
 */
public class ex_21_ch_8_central_city {
    public static void main(String[] args) {
        double[][] coordinatesCity = getCoordinatesCity();
        double[] totalDistanceEachCity = getTotalDistance(coordinatesCity);
        int centralCity = getCentralCity(totalDistanceEachCity);

        System.out.println("The central City is at : "+coordinatesCity[centralCity][0]+", "+coordinatesCity[centralCity][1]);
        System.out.println("The total Distance is : "+totalDistanceEachCity[centralCity]);

    }

    public static double[][] getCoordinatesCity(){
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter the number of cities : ");
        int numberOfCity = input.nextInt();

        double[][] coordinatesCity = new double[numberOfCity][2];
        System.out.print("Enter The Coordinates OF city : ");
        for(int row = 0; row < coordinatesCity.length; row++){
            for(int col = 0; col < coordinatesCity[0].length; col++){
                coordinatesCity[row][col] = input.nextDouble();
            }
        }

        return coordinatesCity;
    }

    public static double[] getTotalDistance(double[][] coordinatesCity){
        double[] totalDistanceEachCity = new double[coordinatesCity.length];

        for(int city = 0; city < totalDistanceEachCity.length; city++){
            totalDistanceEachCity[city] = getTotalDistanceEachCity(coordinatesCity,city);
        }

        return totalDistanceEachCity;
    }

    public static double getTotalDistanceEachCity(double[][] coordinatesCity,int city ){
        double distance = 0;
        for(int row = 0; row < coordinatesCity.length; row++){
            distance += Math.pow((Math.pow((coordinatesCity[row][0] - coordinatesCity[city][0]), 2) + Math.pow((coordinatesCity[row][1]-coordinatesCity[city][1]), 2)), 0.5 );
        }
        return distance;
    }

    public static int getCentralCity(double[] totalDistanceEachCity){
        int centralCity = 0;

        for(int city = 1; city < totalDistanceEachCity.length; city++){
            if(totalDistanceEachCity[centralCity] > totalDistanceEachCity[city]){
                centralCity = city;
            }
        }

        return centralCity;
    }
}
