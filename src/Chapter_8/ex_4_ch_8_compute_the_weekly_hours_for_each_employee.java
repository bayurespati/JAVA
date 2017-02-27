package Chapter_8;

/**
 * Created by bnamora on 1/23/17.
 */
public class ex_4_ch_8_compute_the_weekly_hours_for_each_employee {
    public static void main(String[] args) {
        int[][] employeeData = {
                {2,4,3,4,5,8,8},
                {7,3,4,3,3,4,4},
                {3,3,4,3,3,2,2},
                {9,3,4,7,3,4,1},
                {3,5,4,3,6,3,8},
                {3,4,4,6,3,4,4},
                {3,7,4,8,3,8,4},
                {6,3,5,9,2,7,9}
        };

        int[][] totalHourEachEmployee = getTotalHourForEachEmployee(employeeData);

        sortHours(totalHourEachEmployee);

        printEmployeeHour(totalHourEachEmployee);
    }

    public static int[][] getTotalHourForEachEmployee(int[][] dataEmployee){
        int[][] totalHourEachEmployee = new int[dataEmployee.length][2];

        for(int employee = 0; employee < dataEmployee.length; employee++){
            int totalHour = 0;
            for(int day = 0; day < dataEmployee[0].length; day++){
                totalHour += dataEmployee[employee][day];
            }

            totalHourEachEmployee[employee][0] = employee;
            totalHourEachEmployee[employee][1] = totalHour;
        }

        return totalHourEachEmployee;
    }

    public static void sortHours(int[][] totalHourEachEmployee){

        int maxIteration = totalHourEachEmployee.length - 1;

        for(int i = 0; i < totalHourEachEmployee.length; i++) {

            int index = 0;
            int temp;

            while (index < maxIteration) {
                int maxNumber = totalHourEachEmployee[index][1];

                if (maxNumber < totalHourEachEmployee[index + 1][1]) {
                    totalHourEachEmployee[index][1] = totalHourEachEmployee[index+1][1];
                    totalHourEachEmployee[index+1][1] = maxNumber;

                    temp = totalHourEachEmployee[index][0];
                    totalHourEachEmployee[index][0] = totalHourEachEmployee[index+1][0];
                    totalHourEachEmployee[index+1][0] = temp;
                }

                index ++;
            }

            maxIteration--;
        }

    }

    public static void printEmployeeHour(int[][] totalHourEachEmployee){
        for(int i = 0 ; i < totalHourEachEmployee.length; i++){
            System.out.println("Employee_exercise2 : "+totalHourEachEmployee[i][0]+" Total Hour :"+totalHourEachEmployee[i][1]);
        }
    }
}
