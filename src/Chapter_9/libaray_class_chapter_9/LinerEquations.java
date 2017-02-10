package Chapter_9.libaray_class_chapter_9;

/**
 * Created by bnamora on 2/10/17.
 */
public class LinerEquations {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinerEquations(){
        a = 1;
        b = 1;
        c = 1;
        d = 1;
        e = 1;
        f = 1;
    }

    public LinerEquations(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA(){return a;}
    public double getB(){return b;}
    public double getC(){return c;}
    public double getD(){return d;}
    public double getE(){return e;}
    public double getF(){return f;}

    public void setA(double y1,double y2){
        this.a = (y1 - y2);
    }
    public void setB(double x1,double x2){this.b = -(x1 - x2);}
    public void setC(double y3,double y4){this.c = (y3 - y4);}
    public void setD(double x3,double x4){this.d = -(x3 - x4);}
    public void setE(double x1,double x2, double y1, double y2){this.e = ((y1 - y2) * x1 ) - ((x1 - x2) * y1);}
    public void setF(double x3,double x4, double y3, double y4){this.f = ((y3 - y4) * x3 ) - ((x3 - x4) * y3);}

    public double isSolvable(){
        return (a * d)-(b * c);
    }

    public double getX(){
        return ((e * d) - (b * f)) / ((a * d) - (b * c));
    }

    public double getY(){
        return ((a * f) - (e * c)) / ((a * d) - (b * c));
    }
}
