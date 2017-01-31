package Chapter_8;

/**
 * Created by bnamora on 1/31/17.
 */
public class ex_22_ch_8_even_number_of_1s {
    public static void main(String[] args) {
        int[][] matrix = setMatrix();
        printMatrix(matrix);

        getEven1sInRow(matrix);
        getEven1sInCol(matrix);
    }

    public static int[][] setMatrix(){
        int[][] matrix = new int[6][6];
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                matrix[row][col] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix.length; col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }

    public static void getEven1sInRow(int[][] matrix){

        for(int row = 0; row < matrix.length; row++){
            int count = 0;
            for(int col = 0; col < matrix.length; col++){
                if(matrix[row][col] == 1){
                    count++;
                }
            }

            if(count % 2 == 0){
                System.out.println("Have even 1s at Row "+row);
            }
        }

    }

    public static void getEven1sInCol(int[][] matrix){

        for(int col = 0; col < matrix.length; col++){
            int count = 0;
            for(int row = 0; row < matrix.length; row++){
                if(matrix[row][col] == 1){
                    count++;
                }
            }

            if(count % 2 == 0){
                System.out.println("Have even 1s at Col "+col);
            }
        }
    }
}
