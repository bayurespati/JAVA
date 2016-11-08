package Chapter_7;

/**
 * Created by Sletszarr on 11/8/16.
 */
public class eg_6_ch_7_linear_search {
    public  static int linearSearch(int[] list, int key){
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return  -1;
    }
}
