package Chapter_7;

/**
 * Created by Sletszarr on 11/8/16.
 */
public class eg_8_ch_7_selection_sort {
    /** the method for sorting the numbers */
    public static void selectionSort(double[] list){
        for (int i = 0; i <list.length - 1; i++) {
            //find the minimum in the list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
