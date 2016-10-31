package Chapter_6;

/**
 * Created by DWP on 10/31/16.
 */
public class ex_32_ch_6_chance_of_winning__at_craps {
    public static void main(String[] args) {
        printWinCraps(10000);
    }

    public static void printWinCraps(int roll) {

        int countWin = 0;
        int countLose = 0;

        for(int i = 1; i <= roll; i++) {
            int dice1 = randomDice();
            int dice2 = randomDice();

            int firstSumRoll = dice1 + dice2;

            if (isFirstRollWin(firstSumRoll)) {
                countWin++;
            }
            else {
                int nextDice1 = dice1;
                int nextDice2 = dice2;

                int point = firstSumRoll;
                int nextSumRoll = 0;

                while (nextSumRoll != point) {
                    int temp = point;
                    if (point == 7) {
                        countLose++;
                        break;
                    }

                    nextDice1 = randomDice();
                    nextDice2 = randomDice();

                    nextSumRoll = nextDice1 + nextDice2;

                    point = nextSumRoll;
                    nextSumRoll = temp;
                }

                if (point != 7) {
                    countWin++;
                }
            }
        }

        System.out.println("Win : "+countWin+" Lose : "+countLose);

    }


    public static int randomDice() {
        return (int) (1 + Math.random() * 6);
    }

    public static boolean isFirstRollWin(int sum) {
        return sum == 7 || sum == 11;
    }
}
