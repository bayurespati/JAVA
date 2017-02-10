package Chapter_9.libaray_class_chapter_9;

import java.util.Scanner;

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

    public LinerEquations() {
        this.a = 1;
        this.b = 1;
        this.c = 1;
        this.d = 1;
        this.e = 1;
        this.f = 1;
    }

    public LinerEquations(double[] point){
        double x1 = point[0];
        double y1 = point[1];
        double x2 = point[2];
        double y2 = point[3];
        double x3 = point[4];
        double y3 = point[5];
        double x4 = point[6];
        double y4 = point[7];

        this.a = (y1 - y2);
        this.b = -(x1 - x2);
        this.c = (y3 - y4);
        this.d = -(x3 - x4);
        this.e = ((y1 - y2) * x1 ) - ((x1 - x2) * y1);
        this.f = ((y3 - y4) * x3 ) - ((x3 - x4) * y3);
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

    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public void setC(double c){
        this.c = c;
    }
    public void setD(double d){
        this.d = d;
    }
    public void setE(double e){
        this.e = e;
    }
    public void setF(double f){
        this.f = f;
    }

    public double isSolvable(){
        return (a * d)-(b * c);
    }

    public double getX(){
        return ((e * d) - (b * f)) / ((a * d) - (b * c));
    }

    public double getY(){
        return ((a * f) - (e * c)) / ((a * d) - (b * c));
    }

    public static double[] getPoint(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double[] point = new double[8];
        for(int i = 0; i < point.length; i++ ){
            point[i] = input.nextDouble();
        }
        return point;
    }
}
