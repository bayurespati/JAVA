package Chapter_4;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by DWP on 9/19/16.
 */
public class ex_18_ch_4_student_major_and_status {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters : ");
        String character = input.next();

        int freshman = '1';
        int sophomore = '2';
        int junior = '3';
        int senior = '4';

        int charAt1 = character.charAt(1);
        int charAt0 = character.charAt(0);

        int mathematics = 'M';
        int computerScience = 'C';
        int informationTechnology = 'I';

        boolean condition = (charAt0 == mathematics || charAt0 == computerScience || charAt0 == informationTechnology);
        boolean conditionForStatus = (charAt1 == freshman || charAt1 == sophomore || charAt1 == junior || charAt1 == senior);

        if(condition && conditionForStatus) {
            if (mathematics == charAt0)
                System.out.print("Mathematics ");
            if (computerScience == charAt0)
                System.out.print("Computer ");
            if (informationTechnology == charAt0)
                System.out.print("Information ");

            if (freshman == charAt1)
                System.out.print("freshman");
            else if (sophomore == charAt1)
                System.out.print("Sophomore");
            else if (junior == charAt1)
                System.out.print("Junior");
            else
                System.out.print("Senior");

        }
        else
            System.out.println("Invalid Input");

    }
}
