package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 1/24/17.
 */
public class ex_9_ch_8_game_tic_tac_toe_game {
    public static void main(String[] args) {
        char[][] boardGame = new char[3][3];
        int player1;
        int player2 = 0;

        while(player2 !=1) {
            player1 = play(boardGame,'X');
            if(player1 == 1){
                break;
            }
            player2 = play(boardGame,'O');
        }
    }

    public static int play(char[][] boardGame, char player) {
        Scanner input = new Scanner(System.in);
        while (true) {
            printBordGame(boardGame);
            System.out.print("Enter a row (0, 1, or 2) for player " + player + " :");
            int row = input.nextInt();
            System.out.print("Enter a column (0, 1, or 2) for player " + player + " :");
            int col = input.nextInt();
            boolean isValidInput = !isOutOfBound(row, col) && isAvailable(boardGame, row, col);

            if (isValidInput) {
                 boardGame[row][col] = player;
                 break;
            }
        }

        if(isWining(boardGame)){
            printBordGame(boardGame);
            System.out.println(player+" player Win");
            return 1;
        }
        return 0;
    }

    public static void printBordGame(char[][] boardGame){
        for (int row = 0; row < boardGame.length; row++) {
            System.out.println("-------");
            System.out.print("|");
            for (int col = 0; col < boardGame.length; col++) {
                System.out.print((boardGame[row][col] == 0)
                        ? " |"
                        : boardGame[row][col] + "|");
            }
            System.out.println();
        }
        System.out.println("-------");
    }

    public static boolean isWining(char[][] boardGame){
        return  (checkBordGameHorizontal(boardGame) || checkBordGameVertical(boardGame) || checkBordGameDiagonalLeft(boardGame) || checkBordGameDiagonalRight(boardGame));
    }

    public static boolean checkBordGameHorizontal(char[][] boardGame){
        int countX = 0,countO = 0;
        for(int row = 0; row < boardGame.length; row++){
            for(int col = 0; col < boardGame.length; col++){
                if(boardGame[row][col] == 'X'){
                    countX++;
                }else if(boardGame[row][col] == 'O'){
                    countO++;
                }
            }
        }
        return countO == 3 || countX == 3;
    }

    public static boolean checkBordGameVertical(char[][] boardGame){
        int countX = 0,countO = 0;
        for(int row = 0; row < boardGame.length; row++){
            for(int col = 0; col < boardGame.length; col++){
                if(boardGame[col][row] == 'X'){
                    countX++;
                }else if(boardGame[col][row] == 'O'){
                    countO++;
                }
            }
        }
        return countX == 3 || countO ==3;
    }

    public static boolean checkBordGameDiagonalLeft(char[][] boardGame){
        int countX = 0,countO = 0;
        for(int row = 0; row < boardGame.length; row++){
            if(boardGame[row][row] == 'X'){
                countX++;
            }else if(boardGame[row][row] == 'O'){
                countO++;
            }
        }
        return countO == 3 || countX == 3;
    }

    public static boolean checkBordGameDiagonalRight(char[][] boardGame){
        int countX = 0, countO = 0;
        for(int row = 0, col = 2; row < boardGame.length; row++,col--){
            if(boardGame[row][col] == 'X'){
                countX++;
            }else if(boardGame[row][col] == 'O'){
                countO++;
            }
        }
        return countO == 3 || countX == 3;
    }

    public static boolean isOutOfBound(int row, int col) {
        return row > 2 || col > 2;
    }

    public static boolean isAvailable(char[][] boardGame, int row, int col) {
        return boardGame[row][col] == 0;
    }

}

