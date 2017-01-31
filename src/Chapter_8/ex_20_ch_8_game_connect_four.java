package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 1/31/17.
 */
public class ex_20_ch_8_game_connect_four {
    public static void main(String[] args) {
        char[][] boardGame = new char [6][7];

        boolean player1;
        boolean player2  = false;

        while(!player2){
            player1 = playGame(boardGame,'R');
            if(player1){
                break;
            }
            player2 = playGame(boardGame,'Y');
        }
    }

    public static boolean playGame(char[][] boardGame,char player){
        Scanner input = new Scanner(System.in);

        while(true) {
            printBoardGame(boardGame);
            System.out.print((player == 'R')
                    ? "Drop A red disk at column (0-6): "
                    : "Drop A yellow disk at column (0-6): ");

            int inputPlayer = input.nextInt();

            if(inputPlayer < 7) {
                setInputPlayerOnBoardGame(boardGame, player, inputPlayer);
                break;
            }
        }

        if(isWining(boardGame)) {
            printBoardGame(boardGame);
            System.out.println((player == 'R')
                    ? "The red Win "
                    : "The yellow Win ");
            return true;
        }

        return false;
    }

    public static void printBoardGame(char[][] boardGame){
        for (int row = 0; row < boardGame.length; row++) {
            System.out.print("|");
            for (int col = 0; col < boardGame[0].length; col++) {
                System.out.print((boardGame[row][col] == 0)
                        ? " |"
                        : boardGame[row][col] + "|");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    public static void setInputPlayerOnBoardGame(char[][] boardGame,char player,int inputPlayer){
        for(int row = boardGame.length - 1; row >=0; row--){
            if(boardGame[row][inputPlayer] == 0){
                boardGame[row][inputPlayer] = player;
                break;
            }
        }
    }

    public static boolean isWining(char[][] boardGame){
        return (cekHorizontal(boardGame) || cekVertical(boardGame) || cekDiagonalToDownRight(boardGame) || cekDiagonalToDownLeft(boardGame));
    }

    public static boolean cekHorizontal(char[][] boardGame){
        for(int row = boardGame.length - 1; row >= 0; row--){
            int countFour = 1;
            for(int col = 0; col < boardGame[0].length - 1; col++){
                if(boardGame[row][col] == boardGame[row][col + 1] && boardGame[row][col] != 0){
                    countFour++;
                    if(countFour == 4){
                        return true;
                    }
                }else
                    countFour = 1;
            }
        }
        return false;
    }

    public static boolean cekVertical(char[][] boardGame){
        for(int col = 0; col < boardGame[0].length; col++){
            int countFour = 1;
            for(int row = 0; row < boardGame.length - 1; row++){
                if(boardGame[row][col] == boardGame[row + 1][col] && boardGame[row][col] !=0){
                    countFour++;
                    if(countFour == 4){
                        return true;
                    }
                }else
                    countFour = 1;
            }
        }

        return false;
    }

    public static boolean cekDiagonalToDownRight(char[][] boardGame){
        int startRow = boardGame.length - 4;
        int startIteration;
        int limit;

        for( int col = 0; col < boardGame[0].length - 4;){
            int countFour = 1;

            if(startRow < 0){
                col++ ;startRow = 0;
            }

            if(col < 1) {
                startIteration = startRow;
                limit = boardGame.length - 1;
            }else {
                startIteration = col;
                limit = boardGame[0].length - 1;
            }

            for (int secondRow = startRow, secondCol = col, iteration = startIteration; iteration < limit ; secondRow++, secondCol++, iteration++) {
                if(boardGame[secondRow][secondCol] == boardGame[secondRow + 1][secondCol + 1] && boardGame[secondRow][secondCol] != 0){
                    countFour++;
                    if(countFour == 4){
                        return true;
                    }
                }else
                    countFour = 1;
            }
            startRow--;
        }

        return false;
    }

    public static boolean cekDiagonalToDownLeft(char[][] boardGame){

        int row = boardGame.length - 4;

        for(int col = boardGame[0].length - 1; col > boardGame[0].length - 4;){

            int countFour = 1;

            if(row < 0){
                col--;
                row = 0;
            }
            if(col > 5){
                for (int secondRow = row, secondCol = col; secondRow < boardGame.length - 1 ; secondRow++, secondCol--) {
                    if(boardGame[secondRow][secondCol] == boardGame[secondRow + 1][secondCol - 1] && boardGame[secondRow][secondCol] != 0){
                        countFour++;
                        if(countFour == 4){
                            return true;
                        }
                    }
                }
            }else{
                for (int secondRow = row, secondCol = col; secondCol > 0 ; secondRow++, secondCol--) {
                    if(boardGame[secondRow][secondCol] == boardGame[secondRow + 1][secondCol - 1] && boardGame[secondCol][secondRow] != 0){
                        countFour++;
                        if(countFour == 4){
                            return true;
                        }
                    }
                }
            }
            row--;
        }

        return false;
    }
}
