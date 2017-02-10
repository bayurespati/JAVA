package Chapter_9;

import Chapter_9.libaray_class_chapter_9.Location;

/**
 * Created by bnamora on 2/10/17.
 */
public class ex_13_ch_9_the_location_class {
    public static void main(String[] args) {
        Location location = Location.locateLargest(Location.getMatrix());
        System.out.println("The location of the largest element is "+location.getMaxValue()+" at ("+location.getRow()+", "+location.getCol()+")");
    }
}
