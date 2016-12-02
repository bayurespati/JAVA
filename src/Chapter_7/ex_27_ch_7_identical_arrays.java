package Chapter_7;

/**
 * Created by DWP on 12/2/16.
 */
public class ex_27_ch_7_identical_arrays {
    public static void main(String[] args) {
        int lengthNumber = ex_26_ch_7_strictly_identical_arrays.getLengthNumber();
        int[] list1 = ex_26_ch_7_strictly_identical_arrays.getList(lengthNumber,1);
        int[] list2 = ex_26_ch_7_strictly_identical_arrays.getList(lengthNumber,2);

        printStatus(list1,list2);
    }

    public static void printStatus(int[] list1,int[] list2){
        System.out.print("Two lists are ");
        System.out.print((equals(list1,list2)) ? "identical" : "not identical");
    }

    public static boolean equals(int[] list1, int[] list2){
        arranging(list1);
        arranging(list2);

        for(int i = 0; i < list1.length; i++){
            if(list1[i] != list2[i]){
                return false;
            }
        }

        return true;
    }

    public static void arranging(int[] list){
        for (int i = 0; i <list.length ; i++) {

            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
