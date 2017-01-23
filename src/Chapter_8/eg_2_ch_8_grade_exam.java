package Chapter_8;

/**
 * Created by bnamora on 1/23/17.
 */
public class eg_2_ch_8_grade_exam {
    public static void main(String[] args) {

        //Student answer to the questions
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

        //Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        //Grade all answer
        for(int i = 0; i < answer.length; i++){
            //Grade one student
            int correctCount = 0;
            for (int j = 0 ; j < answer[i].length; j++){
                if(answer[i][j] == keys[j]){
                    correctCount++;
                }
            }
            System.out.println("Student "+i+"'s correctCount is "+correctCount);
        }
    }
}
