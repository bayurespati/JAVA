package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 2/1/17.
 */
public class ex_24_ch_8_check_sudoku_solution {
    public static void main(String[] args) {
        int[][] grid = readSolution();

        System.out.println(isValid(grid) ?"Valid solution" : "Invalid Solution");
    }

    public static int[][] readSolution(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sudoku solution : ");
        int[][] grid = new int[9][9];
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid.length; col++){
                grid[row][col] = input.nextInt();
            }
        }
        return grid;
    }

    public static boolean isValid(int[][] grid){
        return (checkGrid(grid));
    }

    public static boolean checkGrid(int[][] grid){
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){}
                if(!checkNumber(grid,row)){
                    return false;
                }
        }
        return true;
    }

    public static boolean checkNumber(int[][] grid,int index){
        return checkNumberRow(grid,index) && checkNumberCol(grid,index) && checkSmallBox(grid,index);
    }

    public static boolean checkNumberRow(int[][] grid, int index){
        for(int number = 1; number < 10; number++ ) {
            int count = 0;
            for (int col = 0; col < grid[0].length; col++) {
                if(number == grid[index][col]){
                    count++;
                }
            }
            if(count == 0){
                return false;
            }
        }

        return true;
    }

    public static boolean checkNumberCol(int[][] grid,int index){

        for(int number = 1; number < 10; number++ ) {
            int count = 0;
            for (int row = 0; row < grid.length; row++) {
                if(number == grid[row][index]){
                    count++;
                }
            }
            if(count == 0){
                return false;
            }
        }

        return true;
    }

    public static boolean checkSmallBox (int[][] grid,int index){
        int j = 0;
        if(index  == 1 || index == 4 || index == 7){
            j = 3;
        }else if(index == 2 || index == 5 || index == 8){
            j = 6;
        }

        for(int number = 1; number < 10; number++) {
            int count = 0;
            for (int row = (index / 3) * 3; row < (index / 3) * 3 + 3; row++) {
                for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++) {
                    if(number == grid[row][col]){
                        count++;
                    }

                }
            }
            if(count == 0){
                return false;
            }
        }
        return true;
    }
}

/*
9 6 3 1 7 4 2 5 8
1 7 8 3 2 5 6 4 9
2 5 4 6 8 9 7 3 1
8 2 1 4 3 7 5 9 6
4 9 6 8 5 2 3 1 7
7 3 5 9 6 1 8 2 4
5 8 9 7 1 3 4 6 2
3 1 7 2 4 6 9 8 5
6 4 2 5 9 8 1 7 3


1 6 3 1 7 4 2 5 8
1 7 8 3 2 5 6 4 9
2 5 4 6 8 9 7 3 1
8 2 1 4 3 7 5 9 6
4 9 6 8 5 2 3 1 7
7 3 5 9 6 1 8 2 4
5 8 9 7 1 3 4 6 2
3 1 7 2 4 6 9 8 5
6 4 2 5 9 8 1 7 3
 */