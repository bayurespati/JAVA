package Chapter_12;

/**
 * Created by bnamora on 3/6/17.
 */
public class eg_12_ch_12_test_file_class {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("src/Chapter_1/ex_8_ch_1_Area_and_perimeter_of_a_circle.java");

        System.out.println("Does it exist "+file.exists());
        System.out.println("The file has "+file.length()+" bytes");
        System.out.println("Can it be read? "+file.canRead());
        System.out.println("Can it be written> "+file.canWrite());
        System.out.println("It is directory "+file.isDirectory());
        System.out.println("It is a file "+file.isFile());
        System.out.println("It is absolute "+file.isAbsolute());
        System.out.println("It is hidden "+ file.isHidden());
        System.out.println("Absolute path is "+file.getAbsolutePath());
        System.out.println("Last modified on "+new java.util.Date(file.lastModified()));
    }
}
