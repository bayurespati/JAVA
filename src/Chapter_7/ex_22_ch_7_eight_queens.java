package Chapter_7;

/**
 * Created by DWP on 11/29/16.
 */
public class ex_22_ch_7_eight_queens {
    public static void main(String[] args) {
        int[] exceptList = setExceptList();
        int[] chessBord = setChessBord(exceptList.length);
        int[] queen= new int[8];

        printChessBord(chessBord,queen,exceptList);
    }

    public static int[] setExceptList(){
        int[] exceptionList = new int [64];
        for(int i = 0; i < exceptionList.length; i++){
            exceptionList[i] = -1;
        }

        return exceptionList;
    }

    public static int[] setChessBord(int length){
        int[] setChessBord = new int [length];
        for(int i = 0; i < setChessBord.length; i++){
            setChessBord[i] = -2;
        }
        return setChessBord;
    }

    public static void printChessBord(int[] chessBord,int[] queen,int[] exceptionList){
        int max = queen.length;
        int min = max - queen.length;
        int countIndex;

        for(int i = 0; i < 8; i++){

            int randomQueen = (int) (min + Math.random() * queen.length);
            countIndex = getIndex(exceptionList);

            while (!checkQueen(exceptionList,randomQueen)){
                randomQueen = (int) (min + Math.random() * queen.length);
            }

            chessBord[randomQueen] = randomQueen;
            queen[i] = randomQueen;

            exceptionList[countIndex] = randomQueen;
            countIndex++;
            getExceptionList(exceptionList,randomQueen,max,min,countIndex,chessBord);

            while (!checkRow(chessBord)){
                refineQueen(chessBord,exceptionList,queen,i);
                i--;
                max -=8;
                min -=8;
            }

            min = max;
            max = min + 8;

            System.out.println(randomQueen);
            printChessBord(chessBord);
        }
    }

    public static int getIndex(int[] exceptionList){
        int index = 0;
        for(int i = 0; i < exceptionList.length; i++){
            if(exceptionList[i] != -1){
                index++;
            }
        }
        return index;
    }

    public static boolean checkQueen(int[] exceptionList,int randomQueen){
        for(int i = 0 ; i < exceptionList.length; i++){
            if(exceptionList[i] == randomQueen){
                return false;
            }
        }
        return true;
    }

    public static void getExceptionList(int[] exceptionList, int queen, int max, int min, int countIndex,int[] chessBord){

        int countLeft = 1;
        int countRight = 1;

        for(int i = queen+1; i < max; i++){
            if(checkQueen(exceptionList,i)) {
                exceptionList[countIndex] = i;
                countIndex++;
                chessBord[i] = -1;
            }
            countRight++;
        }

        for(int i = queen-1; i >= min; i--){
            if(checkQueen(exceptionList,i)) {
                exceptionList[countIndex] = i;
                countIndex++;
                chessBord[i] = -1;
            }
            countLeft++;
        }

        for(int i = 1, k = queen + 7; i < countLeft; i++ ,k +=7){
            if(k > 63){
                break;
            }

            if(checkQueen(exceptionList,k)) {
                exceptionList[countIndex] = k;
                countIndex++;
                chessBord[k] = -1;
            }
        }

        for(int i = queen+8; i < chessBord.length; i +=8){
            if (checkQueen(exceptionList,i)) {
                exceptionList[countIndex] = i;
                countIndex++;
                chessBord[i] = -1;
            }
        }

        for(int i = 1, k = queen + 9; i < countRight; i++ ,k +=9){
            if(k > 63){
                break;
            }
            if(checkQueen(exceptionList,k)) {
                exceptionList[countIndex] = k;
                countIndex++;
                chessBord[k] = -1;
            }
        }


    }

    public static void refineQueen(int[] chessBord,int[] exceptionList,int[] queen, int i){
        for(int k = exceptionList.length-1; k > 0; k--){
            if(exceptionList[k] == queen[i]){
                break;
            }
            if(exceptionList[k] != -1){
                chessBord[exceptionList[k]] = -2;
            }
            exceptionList[k] = -1;
        }
        chessBord[queen[i]] = -1;
        queen[i] = 0;
    }

    public static boolean checkRow(int[] chessBord){

        int max = chessBord.length;
        int min = max - 8;
        int count = 0;
        while (max > 0){
            for(int i = min; i < max; i++){
                if(chessBord[i] == -1){
                    count++;
                }
            }
            if(count == 8){
                break;
            }
            count = 0;
            max = min;
            min = max - 8;
        }
        return (count < 8);
    }

    public static void printChessBord(int[] chessBord){
        int count = 0;

        for(int k = 0; k < chessBord.length; k++){
            System.out.print("|");
            if(chessBord[k] >= 0){
                System.out.print("Q");
            }
            else if(chessBord[k] == -1){
                System.out.print("*");
            }
            else
                System.out.print(" ");

            count++;

            if (count % 8 == 0) {
                System.out.println("|");
            }
        }
        System.out.println();
    }



}
