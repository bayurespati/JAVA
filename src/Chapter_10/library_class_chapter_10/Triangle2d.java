package Chapter_10.library_class_chapter_10;

/**
 * Created by bnamora on 2/17/17.
 */
public class Triangle2d {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2d(){
        this.p1 = new MyPoint(0,0);
        this.p2 = new MyPoint(1,1);
        this.p3 = new MyPoint(2,5);
    }

    public Triangle2d(MyPoint p1,MyPoint p2, MyPoint p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getArea(){
        double[] side = getSide();
        double totalSide = (side[0] + side[1] + side[2]) / 2;
        return Math.pow(totalSide * (totalSide - side[0]) * (totalSide - side[1]) * (totalSide - side[2]),0.5);
    }

    public double getPerimeter(){
        double[] side = getSide();
        return side[0] + side[1] + side[2];
    }

    private double[] getSide(){
        double[] side = new double[3];
         side[0] = Math.pow( Math.pow((p2.getX() - p1.getX()), 2)+ Math.pow( (p2.getY() - p1.getY()), 2), 0.5 );
         side[1] = Math.pow( Math.pow((p3.getX() - p1.getX()), 2)+ Math.pow( (p3.getY() - p1.getY()), 2), 0.5 );
         side[2] = Math.pow( Math.pow((p2.getX() - p3.getX()), 2)+ Math.pow( (p2.getY() - p3.getY()), 2), 0.5 );
         return side;
    }

    public boolean contains(Triangle2d t){
        return contains(t.p1) && contains(t.p2) && contains(t.p3);
    }

    public  boolean contains(MyPoint p){
        double[] intersectPoint1 = getIntersectPoint(p,p1,p2,p3);
        double[] intersectPoint2 = getIntersectPoint(p,p2,p1,p3);
        double[] intersectPoint3 = getIntersectPoint(p,p3,p2,p1);
        return  p1.distance(intersectPoint1[0],intersectPoint1[1]) >= p1.distance(p) &&
                p2.distance(intersectPoint2[0],intersectPoint2[1]) >= p2.distance(p) &&
                p3.distance(intersectPoint3[0],intersectPoint3[1]) >= p3.distance(p);
    }

    public boolean overlaps(Triangle2d t){
        return checkIntersecting(t.p1,t.p2) || checkIntersecting(t.p2,t.p3) || checkIntersecting(t.p3,t.p1);
    }

    private boolean checkIntersecting(MyPoint p1,MyPoint p2){
        double[] intersect1 = getIntersectPoint(p1,p2,this.p1,this.p2);
        double[] intersect2 = getIntersectPoint(p1,p2,this.p2,this.p3);
        double[] intersect3 = getIntersectPoint(p1,p2,this.p3,this.p1);

        return  (p1.distance(p2) > p1.distance(intersect1[0],intersect1[1]) && p2.distance(p1) > p2.distance(intersect1[0],intersect1[1]))||
                (p1.distance(p2) > p1.distance(intersect2[0],intersect2[1]) && p2.distance(p1) > p2.distance(intersect1[0],intersect1[1]))||
                (p1.distance(p2) > p1.distance(intersect3[0],intersect3[1]) && p2.distance(p1) > p2.distance(intersect1[0],intersect1[1]));
    }

    private double[] getIntersectPoint(MyPoint p1, MyPoint p2, MyPoint p3, MyPoint p4){
        double[] intersectPoint = new double[2];
        double a =  (p1.getY() - p2.getY());
        double b = -(p1.getX() - p2.getX());
        double c =  (p3.getY() - p4.getY());
        double d = -(p3.getX() - p4.getX());

        double e = ((p1.getY() - p2.getY()) * p1.getX()) - ((p1.getX() - p2.getX()) * p1.getY());
        double f = ((p3.getY() - p4.getY()) * p3.getX()) - ((p3.getX() - p4.getX()) * p3.getY());

        intersectPoint[0] = ((e * d)-(b * f)) / ((a * d) -(b * c));
        intersectPoint[1] = ((a * f)-(e * c)) / ((a * d) -(b * c));

        return intersectPoint;
    }
}
