package Chapter_4;

/**
 * Created by DWP on 9/14/16.
 */
public class ex_3_ch_4_geography_estimate_area {
    public static void main(String[] args) {



        double coordinateXAtlanta = -84.3879824;
        double coordinateYAtlanta = 33.7489954;

        double coordinateXOrlando = -81.37923649999999 ;
        double coordinateYOrlando = 28.5383355;

        double coordinateXSavannah = -81.09983419999998;
        double coordinateYSavannah = 32.0835407;

        double coordinateXCharlotte = -80.84312669999997;
        double coordinateYCharlotte = 35.2270869;

        double xAtlanta = Math.toRadians(coordinateXAtlanta);
        double yAtlanta = Math.toRadians(coordinateYAtlanta);
        double xOrlando = Math.toRadians(coordinateXOrlando);
        double yOrlando = Math.toRadians(coordinateYOrlando);
        double xSavannah = Math.toRadians(coordinateXSavannah);
        double ySavannah = Math.toRadians(coordinateYSavannah);
        double xCharlotte = Math.toRadians(coordinateXCharlotte);
        double yCharlotte = Math.toRadians(coordinateYCharlotte);

        double radiusOfEarth = 6371.01;

        double distanceBetweenAtalantaAndOrlando =   radiusOfEarth * Math.acos(Math.sin(xAtlanta) * Math.sin(xOrlando) + Math.cos(xAtlanta) * Math.cos(xOrlando) * Math.cos(yAtlanta - yOrlando));
        double distanceBetweenOrlandoAndSavannah =   radiusOfEarth * Math.acos(Math.sin(xOrlando) * Math.sin(xSavannah) + Math.cos(xOrlando) * Math.cos(xSavannah) * Math.cos(yOrlando - ySavannah));
        double distanceBetweenSavannahAndCharlotte = radiusOfEarth * Math.acos(Math.sin(xSavannah) * Math.sin(xCharlotte) + Math.cos(xSavannah) * Math.cos(xCharlotte) * Math.cos(ySavannah - yCharlotte));
        double distanceBetweenCharlotteAndAtlanta =  radiusOfEarth * Math.acos(Math.sin(xCharlotte) * Math.sin(xAtlanta) + Math.cos(xCharlotte) * Math.cos(xAtlanta) * Math.cos(yCharlotte - yAtlanta));
        double distanceBetweenCharlotteAndOrlando =  radiusOfEarth * Math.acos(Math.sin(xCharlotte) * Math.sin(xOrlando) + Math.cos(xCharlotte) * Math.cos(xOrlando) * Math.cos(yCharlotte-yOrlando));

        double side1 = (distanceBetweenCharlotteAndOrlando + distanceBetweenOrlandoAndSavannah + distanceBetweenSavannahAndCharlotte)/2;
        double side2 = (distanceBetweenCharlotteAndOrlando + distanceBetweenCharlotteAndAtlanta + distanceBetweenAtalantaAndOrlando)/2;

        double area1 = Math.pow(side1 * (side1-distanceBetweenCharlotteAndOrlando) * (side1-distanceBetweenOrlandoAndSavannah) * (side1-distanceBetweenSavannahAndCharlotte),0.5);
        double area2 = Math.pow(side2 * (side2-distanceBetweenCharlotteAndOrlando) * (side2-distanceBetweenCharlotteAndAtlanta) * (side2-distanceBetweenAtalantaAndOrlando),0.5);

        double area = area2 + area1;

        System.out.println("Distance Between Atlanta to Orlando : "+distanceBetweenAtalantaAndOrlando);
        System.out.println("Distance Between Orlando to Savannah : "+distanceBetweenOrlandoAndSavannah);
        System.out.println("Distance Between Savannah to Charlotte : "+distanceBetweenSavannahAndCharlotte);
        System.out.println("Distance Between Charlotte to Atlanta : "+distanceBetweenCharlotteAndAtlanta);
        System.out.println("Distance Between Charlotte to Orlando : "+distanceBetweenCharlotteAndOrlando);

        System.out.println("Area : "+area);

    }
}
