package Chapter_9;

import Chapter_9.libaray_class_chapter_9.LinerEquations;


/**
 * Created by bnamora on 2/10/17.
 */
public class ex_12_ch_9_geometry_intersecting_point {
    public static void main(String[] args) {
        LinerEquations linerEquations = new LinerEquations(LinerEquations.getPoint());
        System.out.println((linerEquations.isSolvable() == 0)
                ? "The two line are parallel"
                : "The intersecting point is at ("+linerEquations.getX()+","+linerEquations.getY()+")");
    }
}
