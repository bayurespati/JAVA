package Chapter_7;

/**
 * Created by DWP on 11/24/16.
 */
public class ex_10_ch_7_find_index_of_smallest_element {
    public static void main(String[] args) {
        double[] arrayNumber = ex_8_ch_7_average_an_array.getNumber();
        double smallNumber = smallNumber(arrayNumber);

        int indexNumber = indexOfSmallestElement(arrayNumber,smallNumber);

        System.out.println("The small number in index : "+indexNumber);
    }

    public static double smallNumber(double[] number){
        double smallNumber = number[0];
        for(int i = 1; i < number.length; i++){
            if(smallNumber < number[i]){
                smallNumber = smallNumber;
            }
            else
                smallNumber = number[i];
        }
        return smallNumber;
    }

    public static int indexOfSmallestElement(double[] array, double number){
        int indexNumber = 0;

        for(int i = 0; i < array.length; i++){
            indexNumber = i;
            if(array[i] == number){
                break;
            }

        }
        return indexNumber;
    }
}