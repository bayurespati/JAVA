package Chapter_12.library_class_chapter_12;

/**
 * Created by bnamora on 3/7/17.
 */
public class TriangleWithException {
    private double side1;
    private double side2;
    private double side3;

    public TriangleWithException(){
    }

    public TriangleWithException(double side1, double side2, double side3) throws IllegalTriangleException {
        if((side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalTriangleException(side1,side2,side3);
        }
    }

    public double getSide1(){
        return side1;
    }

    public double getSide2(){
        return side2;
    }

    public double getSide3(){
        return side3;
    }

    public void setSide1(double side1){
        this.side1 = side1;
    }

    public void setSide2(double side2){
        this.side2 = side2;
    }

    public void setSide3(double side3){
        this.side3 = side3;
    }

    public double getArea(){
        double totalSide = (side1 + side2 + side3) / 2;
        return Math.pow(totalSide * (totalSide - side1) * (totalSide - side2) * (totalSide - side3),0.5);
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public String toString(){
        return  "Triangle: side1 = "+side1+" side2 = "+side2+"+ side3 = "+side3;
    }
}
/*
if((side1 + side2) > side3 || (side1 + side3) > side2 || (side2 + side3) > side1){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else
            throw new IllegalTriangleException();
 */