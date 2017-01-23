package Chapter_8;

/**
 * Created by bnamora on 1/23/17.
 */
public class ex_3_ch_8_sort_student_on_grades {
    public static void main(String[] args) {
        char[][] answer = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[][] scoreStudent = getScore(answer,keys);
        sortScore(scoreStudent);
        printSortScore(scoreStudent);
    }

    public static int[][] getScore(char[][] answer, char[] keys){
        int[][] scoreStudent = new int [answer.length][2];
        int indexScoreStudent = 0;
        for(int i = 0; i < answer.length; i++){
            int correctCount = 0;
            for (int j = 0 ; j < answer[i].length; j++){
                if(answer[i][j] == keys[j]){
                    correctCount++;
                }
            }
            scoreStudent[indexScoreStudent][0] =  i+1;
            scoreStudent[indexScoreStudent][1] = correctCount;

            indexScoreStudent++;
        }

        return scoreStudent;
    }

    public static void sortScore(int[][] number){

        int maxIteration = number.length - 1;

        for(int i = 0; i < number.length; i++) {

            int index = 0;
            int temp;

            while (index < maxIteration) {
                int maxNumber = number[index][1];

                if (maxNumber < number[index + 1][1]) {
                    number[index][1] = number[index+1][1];
                    number[index+1][1] = maxNumber;

                    temp = number[index][0];
                    number[index][0] = number[index+1] [0];
                    number[index+1] [0] = temp;
                }

                index ++;
            }

            maxIteration--;
        }

    }

    public static void printSortScore(int[][] scoreStudent){

        for(int i = 0 ; i < scoreStudent.length; i++){
            System.out.println("Student : "+scoreStudent[i][0]+" Score :"+scoreStudent[i][1]);
        }
    }
}
