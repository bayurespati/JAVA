package Chapter_8;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by bnamora on 1/26/17.
 */
public class ex_19_ch_8_pattern_recognition_four_consecutive_equal_number {
    public static void main(String[] args) {
        int[] rowAndCol = getLengthMatrix();
        int[][] matrix = getMatrix(rowAndCol);

        int minimumLength;

        if(rowAndCol[0] <= rowAndCol[1]){
            minimumLength = rowAndCol[0];
        }else
            minimumLength = rowAndCol[1];

        System.out.println(isConsecutiveFour(matrix,minimumLength)
                ? "This matrix Have Consecutive Four"
                : "This matrix No Have Consecutive Four");

    }

    public static int[] getLengthMatrix(){
        Scanner input = new Scanner(System.in);

        int[] rowAndCol = new int[2];
        System.out.println("Input row and col : ");
        for(int i = 0; i < rowAndCol.length; i++){
            rowAndCol[i] = input.nextInt();
        }
        return rowAndCol;
    }

    public static int[][] getMatrix(int[] rowAndCol){
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[rowAndCol[0]][rowAndCol[1]];

        System.out.println("Enter number : ");
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                matrix[row][col] = input.nextInt();
            }
        }

        return matrix;
    }

    public static boolean isConsecutiveFour(int[][] matrix,int minimumLength){
        return (cekHorizontal(matrix) || cekVertical(matrix)||cekDiagonalToDownRight(matrix,minimumLength) || cekDiagonalToDownLeft(matrix,minimumLength));
    }

    public static boolean cekHorizontal(int[][] matrix){
        for(int row = 0; row < matrix.length; row++){
            int countSameValue = 1;
            for(int col = 0; col < matrix[0].length - 1; col++){
                if(matrix[row][col] == matrix[row][col + 1]){
                    countSameValue++;
                    if (countSameValue == 4) {
                        return true;
                    }
                }
                else {
                    countSameValue = 1;
                }
            }
        }
        return false;
    }

    public static boolean cekVertical(int[][] matrix){
        for(int col = 0; col < matrix[0].length; col++){
            int countSameValue = 1;
            for(int row = 0; row < matrix.length - 1; row++){
                if(matrix[row][col] == matrix[row + 1][col]){
                    countSameValue++;
                    if(countSameValue == 4){
                        return true;
                    }
                }else {
                    countSameValue = 1;
                }
            }
        }
        return false;
    }

    public static boolean cekDiagonalToDownRight(int[][] matrix,int minimumLength){
       return isValidDownToRightCol(matrix,minimumLength) || isValidDownToRightRow(matrix,minimumLength);
    }

    public static boolean isValidDownToRightCol(int[][] matrix, int minimumLength){
        int startForCol = matrix[0].length - 4;
        for(int col = startForCol,maxIteration = 4; col >= 0; col--,maxIteration++){

            if(maxIteration > minimumLength){
                maxIteration = minimumLength;
            }
            int countSameValue = 1;

            for(int row = 0,secondCol = col; row < maxIteration -1;row++,secondCol++){
                if(matrix[row][secondCol] == matrix[row + 1][secondCol + 1]){
                    countSameValue++;
                    if(countSameValue == 4){
                        return true;
                    }
                }else{
                    countSameValue = 1;
                }
            }
        }
        return false;
    }

    public static boolean isValidDownToRightRow(int[][] matrix, int minimumLength){
        int startForRow = matrix.length-4;
        for(int row = startForRow, maxIteration = 4; row > 0; row--,maxIteration++){
            if(maxIteration > minimumLength){
                maxIteration = minimumLength;
            }
            int countSameValue = 1;
            for(int col = 0,secondRow = row; col < maxIteration - 1; col++,secondRow++){

                if(matrix[secondRow][col] == matrix[secondRow + 1][col + 1]){
                    countSameValue ++;
                    if(countSameValue == 4){
                        return true;
                    }
                }else{
                    countSameValue = 1;
                }
            }
        }

        return false;
    }

    public static boolean cekDiagonalToDownLeft(int[][] matrix,int minimumLength){
        return isValidDownToLeftCol(matrix,minimumLength) || isValidDownToLeftRow(matrix,minimumLength);
    }

    public static boolean isValidDownToLeftCol(int[][] matrix, int minimumLength){

        for(int col = 3,maxIteration = 4; col < matrix[0].length; col++, maxIteration++){

            if(maxIteration > minimumLength){
                maxIteration = minimumLength;
            }
            int countSameValue = 1;

            for(int row = 0,secondCol = col; row < maxIteration-1; row++,secondCol--){
                if(matrix[row][secondCol] == matrix[row + 1][secondCol - 1]){
                    countSameValue++;
                    if(countSameValue == 4){
                        return true;
                    }
                }else{
                    countSameValue = 1;
                }
            }
        }
        return false;
    }

    public static boolean isValidDownToLeftRow(int[][] matrix, int minimumLength){
        int startForRow = matrix.length - 4;
        for(int row = startForRow,maxIteration = 4; row > 0; row--,maxIteration++){
            if(maxIteration > minimumLength){
                maxIteration = minimumLength;
            }
            int countSameValue = 1;
            for(int col = matrix[0].length - 1,secondRow = row, iteration = 0; iteration < maxIteration - 1; col--,secondRow++,iteration++ ){

                if(matrix[secondRow][col] == matrix[secondRow + 1][col - 1]){
                    countSameValue++;
                    if(countSameValue == 4){
                        return true;
                    }
                }else{
                    countSameValue = 1;
                }
            }
        }
        return false;
    }

}
/*
0 1 0 3 1 6 1
0 1 6 8 6 0 1
5 6 2 1 8 2 9
6 5 6 1 1 9 1
1 3 6 1 4 0 7
3 3 3 3 4 0 7

1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50
51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75
76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100

1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
17 18 19 20
21 22 23 24
25 26 27 28
29 30 31 32
33 34 35 36
37 38 39 40
41 42 43 44
45 46 47 48
49 50 51 52
53 54 55 56
57 58 59 60
61 62 63 64
65 66 67 68
69 70 71 72
73 74 75 76
77 78 79 80
81 82 83 84
85 86 87 88
89 90 91 92
93 94 95 96
97 98 99 100
*/