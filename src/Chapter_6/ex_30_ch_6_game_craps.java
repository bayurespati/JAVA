package Chapter_6;

/**
 * Created by DWP on 10/29/16.
 */
public class ex_30_ch_6_game_craps {
    public static void main(String[] args) {
        printSum();
    }

    public static void printSum() {

        int dice1 = randomDice();
        int dice2 = randomDice();

        int firstSumRoll = dice1 + dice2;

        if (isFirstRollLose(firstSumRoll)) {
            printLose(dice1, dice2, firstSumRoll);
        } else if (isFirstRollWin(firstSumRoll)) {
            printWin(dice1, dice2, firstSumRoll);
        } else {

            int nextDice1 = dice1;
            int nextDice2 = dice2;


            int point = firstSumRoll;
            int nextSumRoll = 0;

            while (nextSumRoll != point) {
                int temp = point;
                if (point == 7) {
                    printLose(nextDice1, nextDice2, point);
                    break;
                }

                System.out.println("You rolled " + nextDice1 + " + " + nextDice2 + " = " + point);
                System.out.println("point is " + point);

                nextDice1 = randomDice();
                nextDice2 = randomDice();

                nextSumRoll = nextDice1 + nextDice2;

                point = nextSumRoll;
                nextSumRoll = temp;
            }

            if (point != 7) {
                printWin(nextDice1, nextDice2, point);
            }
        }

    }

    public static void printLose(int dice1, int dice2, int firstSumRoll) {
        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + firstSumRoll);
        System.out.println("You lose");
    }

    public static void printWin(int dice1, int dice2, int firstSumRoll) {
        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + firstSumRoll);
        System.out.println("You win");
    }

    public static int randomDice() {
        return (int) (1 + Math.random() * 6);
    }

    public static boolean isFirstRollLose(int sum) {
        return sum == 2 ||
                sum == 3 ||
                sum == 12;
    }

    public static boolean isFirstRollWin(int sum) {
        return sum == 7 || sum == 11;
    }
}
