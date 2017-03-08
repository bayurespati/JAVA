package Chapter_12.library_class_chapter_12;

/**
 * Created by bnamora on 3/8/17.
 */
public class HexFormatException extends Exception {
    private String string;

    public HexFormatException(){
        super("This is not hex number, please input hex number!!");
    }
}
