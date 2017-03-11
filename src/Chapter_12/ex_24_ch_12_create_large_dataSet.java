package Chapter_12;

import java.io.File;
import java.io.PrintWriter;

/**
 * Created by bnamora on 3/11/17.
 */
public class ex_24_ch_12_create_large_dataSet {
    public static void main(String[] args) throws Exception {
        File file  = new File("Salary.txt");
        try(PrintWriter newFile = new PrintWriter(file)){
            String[] rank = {"assistant","associate","Full"};
            for(int i = 0; i < 1000; i++){
                int randomRank = (int) (Math.random() * 3);
                double salary = getSalary(randomRank);
                newFile.println("FirstName"+(i+1)+" LastName"+(i+1)+" "+rank[randomRank]+" "+salary);
            }
        }
    }

    public static double getSalary(int randomRank){
        double salary;
        if(randomRank == 0){
            salary = (50000 + (Math.random() * 30001));
        }else if(randomRank == 1){
            salary = (60000 + (Math.random() * 500001));
        }else
            salary = (75000 + (Math.random()* 55001));

        return salary;
    }
}
