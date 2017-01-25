package Chapter_8;

/**
 * Created by bnamora on 1/25/17.
 */
public class ex_11_ch_8_largest_row_and_column {
    public static void main(String[] args) {
        int[][] numberMatrix = setRandomNumberInMatrix();
        int[] theLargestColAndRow = getTheLargestColAndRow(numberMatrix);
        print(numberMatrix, theLargestColAndRow);
    }

    public static int[][] setRandomNumberInMatrix(){
        int[][] numberMatrix = new int[4][4];
        for(int row = 0; row < numberMatrix.length; row++){
            for(int col = 0; col < numberMatrix.length; col++){
                numberMatrix[row][col] = (int) (Math.random() * 2);
            }
        }
        return numberMatrix;
    }

    public static int[] getTheLargestColAndRow(int [][] numberMatrix){
        int[] theLargestColAndRow = new int [2];
        theLargestColAndRow[0] = getLargestRow(numberMatrix);
        theLargestColAndRow[1] = getLargestCol(numberMatrix);
        return theLargestColAndRow;
    }

    public static int getLargestRow(int[][] numberMatrix ){
        int largestRow = 0;

        int tempLargestRow = 0;
        for(int row = 0; row < numberMatrix.length; row++){
            int sumOf1 = 0;
            for(int col = 0; col < numberMatrix.length; col++){
                if(numberMatrix[row][col] == 1){
                    sumOf1++;
                }
            }
            if(sumOf1 > tempLargestRow ){
                tempLargestRow = sumOf1;
                largestRow = row;
            }
        }
        return largestRow;
    }

    public static int getLargestCol(int[][] numberMatrix){
        int largestCol = 0;

        int tempLargestCol = 0;
        for(int col = 0; col < numberMatrix.length; col++){
            int sumOf1 = 0;
            for(int row = 0; row < numberMatrix.length; row++){
                if(numberMatrix[row][col] == 1){
                    sumOf1++;
                }
            }
            if(sumOf1 > tempLargestCol ){
                tempLargestCol = sumOf1;
                largestCol = col;
            }
        }
        return largestCol;
    }

    public static void print(int[][] numberMatrix, int[] theLargestColAndRow){
        for(int i = 0; i < numberMatrix.length; i++){
            for(int k = 0; k < numberMatrix.length; k++){
                System.out.print(numberMatrix[i][k]+" ");
            }
            System.out.println();
        }
        System.out.println("The Largest row index : "+theLargestColAndRow[0]);
        System.out.println("The Largest col index : "+theLargestColAndRow[1]);
    }
}
