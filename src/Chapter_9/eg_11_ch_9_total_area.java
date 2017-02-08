package Chapter_9;

/**
 * Created by bnamora on 2/8/17.
 */
public class eg_11_ch_9_total_area {
    public static void main(String[] args) {
        eg_8_ch_9_circle_with_private_data_fields[] circleArray = createCircleArray();
        printCircleArray(circleArray);
    }

    public static eg_8_ch_9_circle_with_private_data_fields[] createCircleArray(){
        eg_8_ch_9_circle_with_private_data_fields[] circleArray = new eg_8_ch_9_circle_with_private_data_fields[5];
        for(int i = 0; i < circleArray.length; i++){
            circleArray[i] = new eg_8_ch_9_circle_with_private_data_fields(Math.random() * 100);
        }
        return circleArray;
    }

    public static void printCircleArray(eg_8_ch_9_circle_with_private_data_fields[] circleArray){
        System.out.printf("%-30s%-15s\n","Radius","Area");
        for(int i = 0; i < circleArray.length; i++){
           System.out.printf("%-30f%-15f\n",circleArray[i].getRadius(),circleArray[i].getArea());
        }
        System.out.println("----------------------------------------");
        System.out.printf("%-30s%-15f\n","the total area of circle is ",sum(circleArray));
    }

    public static double sum(eg_8_ch_9_circle_with_private_data_fields[] circleArray){
        double sum = 0;
        for(int i = 0; i < circleArray.length; i++){
            sum += circleArray[i].getArea();
        }
        return sum;
    }
}
