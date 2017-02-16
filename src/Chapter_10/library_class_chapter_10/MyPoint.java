package Chapter_10.library_class_chapter_10;

/**
 * Created by bnamora on 2/16/17.
 */
public class MyPoint {
    private double x;
    private double y;

    public  MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double distance(MyPoint anotherPoint){
        return  Math.pow( Math.pow((anotherPoint.x - this.x), 2)+ Math.pow((anotherPoint.y - this.y), 2), 0.5 );
    }

    public double distance(double x, double y){
        return Math.pow( Math.pow((x - this.x), 2)+ Math.pow((y - this.y), 2), 0.5 );
    }
}
