package Chapter_10.library_class_chapter_10;

/**
 * Created by bnamora on 2/21/17.
 */
public class MySplit {
    public static String[] split(String s, String regex){
        String[] tempString = new String[getLength(s,regex)];
        int[] indexOfRegex = getIndex(s,regex);
        sortedRegex(indexOfRegex);

        int limit = (tempString.length % 2 == 0) ? tempString.length : tempString.length - 1;

        tempString[0] = s.substring(0,(indexOfRegex[0]));

        for(int i = 1,index = 0; i < limit ; i++){
            if(i % 2 == 0){
                tempString[i] = s.substring(indexOfRegex[index]+1,(indexOfRegex[index+1]));
                index++;
            }else
                tempString[i] = s.substring(indexOfRegex[index],(indexOfRegex[index] + 1));
        }
        if(tempString.length % 2 != 0) {
            tempString[tempString.length -1] = s.substring((indexOfRegex[indexOfRegex.length - 1] + 1), (s.length()));
        }
        return tempString;
    }

    private static int getLength(String s, String regex){
        int length = 1;

        for(int indexRegex = 0; indexRegex < regex.length(); indexRegex++) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == regex.charAt(indexRegex)) {
                    length = (i == s.length() - 1) ? length + 1 : length + 2;
                }
            }
        }
        return length;
    }

    private static int[] getIndex(String s, String regex){
        int[] index = new int[getLengthForIndex(s,regex)];
        for(int indexRegex = 0,k = 0; indexRegex < regex.length(); indexRegex++) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == regex.charAt(indexRegex)) {
                    index[k] = i;
                    k++;
                }
            }
        }
        return index;
    }

    private static int getLengthForIndex(String s, String regex){
        int length = 0;
        for(int indexRegex = 0; indexRegex < regex.length(); indexRegex++)
            for (int i = 0; i < s.length(); i++)
                if (s.charAt(i) == regex.charAt(indexRegex))
                    length++;

        return length;
    }

    private static void sortedRegex(int[] indexREgex){
        for (int i = 0; i <indexREgex.length ; i++) {

            int currentMin = indexREgex[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < indexREgex.length; j++) {
                if (currentMin > indexREgex[j]) {
                    currentMin = indexREgex[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i){
                indexREgex[currentMinIndex] = indexREgex[i];
                indexREgex[i] = currentMin;
            }
        }
    }
}
