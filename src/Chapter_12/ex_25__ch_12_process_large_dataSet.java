package Chapter_12;

import java.net.URL;
import java.util.Scanner;

/**
 * Created by bnamora on 3/12/17.
 */
public class ex_25__ch_12_process_large_dataSet {
    public static void main(String[] args) {

        try{
            URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
            Scanner input  = new Scanner(url.openStream());
            getData(input);
        }
        catch (java.io.IOException ex){
            System.out.println("I/O Errors : no such file");
        }
    }

    public static void getData(Scanner input){
        int numberAssistant = 0;
        int numberAssociate = 0;
        int numberFull = 0;

        long salaryAssistant = 0;
        long salaryAssociate = 0;
        long salaryFull = 0;

        while (input.hasNext()){

            String temp = input.next();

            if(temp.equals("assistant")){
                numberAssistant++;
                salaryAssistant += input.nextDouble();
            }else if(temp.equals("associate")){
                numberAssociate++;
                salaryAssociate += input.nextDouble();
            }else if(temp.equals("full")){
                numberFull++;
                salaryFull += input.nextDouble();
            }
        }

        printData(numberAssistant,numberAssociate,numberFull,salaryAssistant,salaryAssociate,salaryFull);
    }

    public static void printData(int numberAssistant, int numberAssociate, int numberFull, long salaryAssistant, long salaryAssociate, long salaryFull){

        long totalSalary = salaryAssistant + salaryAssociate + salaryFull;
        int totalFaculty = numberAssistant + numberAssociate + numberFull;

        System.out.println("Total salary Assistant : "+salaryAssistant);
        System.out.println("Total salary Associate : "+salaryAssociate);
        System.out.println("Total salary Full      : "+salaryFull);
        System.out.println("Total salary for all   : "+totalSalary);

        System.out.println("Average salary assistant : "+(salaryAssistant / numberAssistant));
        System.out.println("Average salary associate : "+(salaryAssociate / numberAssociate));
        System.out.println("Average salary Full      : "+(salaryFull / numberFull));
        System.out.println("Average salary ForAll    : "+(totalSalary / totalFaculty));

    }
}

//http://cs.armstrong.edu/liang/data/Salary.txt