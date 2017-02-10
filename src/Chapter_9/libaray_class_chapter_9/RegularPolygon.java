package Chapter_9.libaray_class_chapter_9;

/**
 * Created by bnamora on 2/10/17.
 */
public class RegularPolygon {
    private int numberOfSide;
    private double side;
    private double x;
    private double y;

    public RegularPolygon(){
        numberOfSide = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int numberOfSide,double side){
        this.numberOfSide = numberOfSide;
        this.side = side;
    }

    public RegularPolygon(int numberOfSide, double side, double x, double y){
        this.numberOfSide = numberOfSide;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getnumberOfside(){
        return numberOfSide;
    }

    public double getSide(){
        return side;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setnumberOfside(int n){
        this.numberOfSide = n;
    }

    public void setSide(double side){
        this.side = side;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getPerimeter(){
        return numberOfSide * side;
    }

    public double getArea(){
        return (numberOfSide * Math.pow(side,2)) / (4 * Math.tan((Math.PI / numberOfSide)));
    }
}
