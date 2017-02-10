package Chapter_9;

import Chapter_9.libaray_class_chapter_9.RegularPolygon;

/**
 * Created by bnamora on 2/10/17.
 */
public class ex_9_ch_9_geometry_n_sided_regular_polygon {
    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6,4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("regularPolygon1 Perimeter : "+regularPolygon1.getPerimeter()+", Area : "+regularPolygon1.getArea());
        System.out.println("regularPolygon2 Perimeter : "+regularPolygon2.getPerimeter()+", Area : "+regularPolygon2.getArea());
        System.out.println("regularPolygon3 Perimeter : "+regularPolygon3.getPerimeter()+", Area : "+regularPolygon3.getArea());
    }
}
