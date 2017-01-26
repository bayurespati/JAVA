package Chapter_8;

/**
 * Created by bnamora on 1/26/17.
 */
public class ex_18_ch_8_shuffle_rows {
    public static void main(String[] args) {
        int[][] number = {
                {1,2},
                {3,4},
                {5,6},
                {7,8},
                {9,10}
        };

        shuffleNumber(number);
        printNumber(number);
    }

    public static void shuffleNumber(int[][] number){

        int temp;
        for(int row = 0; row < number.length; row++){

            int mathRandomRow = (int) (Math.random() * number.length);
            int mathRandomCol = (int) (Math.random() * number[0].length);
            int mathRandomAnotherCol = (int) (Math.random() * number[0].length);

            temp = number[row][mathRandomAnotherCol];
            number[row][mathRandomAnotherCol] = number[mathRandomRow][mathRandomCol];
            number[mathRandomRow][mathRandomCol] = temp;

        }
    }

    public static void printNumber(int[][] number){
        for(int row = 0; row < number.length; row++){
            for(int col = 0; col < number[0].length; col++){
                System.out.print(number[row][col]+" ");
            }
            System.out.println();
        }
    }
}
