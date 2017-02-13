package Chapter_10;

import Chapter_10.library_class_chapter_10.BMI;

/**
 * Created by bnamora on 2/13/17.
 */
public class eg_3_ch_10_use_BMI_class {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
        System.out.println("The BMI for "+bmi1.getName()+" is "+bmi1.getBMI()+" "+bmi1.getStatus());

        BMI bmi2 = new BMI("Susan King", 215, 70);
        System.out.println("The BMI for "+bmi2.getName()+" is "+bmi2.getBMI()+" "+bmi2.getStatus());
    }
}
