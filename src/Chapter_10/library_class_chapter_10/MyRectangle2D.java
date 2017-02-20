package Chapter_10.library_class_chapter_10;

/**
 * Created by bnamora on 2/18/17.
 */
public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;


    public MyRectangle2D(){
        x = 0;
        y = 0;
        width = 1;
        height = 1;
    }

    public MyRectangle2D(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public MyRectangle2D(double[][] point){
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return (width * 2) + (height * 2);
    }

    public boolean contain (double x, double y){
        return  (x < (width / 2 + this.x) && x > (this.x - (width / 2))) &&
                (y < (height / 2 + this.y) && y > (this.y - (height / 2)));
    }

    public boolean contain (MyRectangle2D r){
        double distance = getDistance(r);
        return (distance < width / 2 || distance < height / 2) && (width > r.getWidth() && height > r.getHeight());
    }

    public boolean overlap (MyRectangle2D r){
        double distance = getDistance(r);
        return (width / 2 + r.getWidth() / 2 >= distance) || height / 2 + r.getHeight() >= distance;
    }

    private double getDistance(MyRectangle2D r){
        return Math.pow(Math.pow((r.getX() - x), 2) + Math.pow((r.getY() - y), 2), 0.5);
    }

    public static MyRectangle2D getRectangle(double[][] point){
        double rightMostX = getRightMostX(point);
        double leftMostX = getLeftMostX(point);
        double highestY = getHighestY(point);
        double lowestY = getLowestY(point);
        double centerX = (rightMostX + leftMostX) / 2;
        double centerY = (highestY + lowestY) / 2;
        double width = rightMostX - leftMostX;
        double height = highestY - lowestY;

        MyRectangle2D rectangle2D = new MyRectangle2D(centerX,centerY,width,height);
        return rectangle2D;
    }

    private static double getRightMostX(double[][] point){
        double rightMostX = point[0][0];
        for(int i = 1; i < point.length; i++){
            if(point[i][0] > rightMostX){
                rightMostX = point[i][0];
            }
        }
        return rightMostX;
    }

    private static double getLeftMostX(double[][] point){
        double leftMostX = point[0][0];
        for(int i = 1; i < point.length; i++){
            if(point[i][0] < leftMostX){
                leftMostX = point[i][0];
            }
        }
        return leftMostX;
    }

    private static double getHighestY(double[][] point){
        double highestY = point[0][1];
        for(int i = 1; i < point.length; i++){
            if(point[i][1] > highestY){
                highestY = point[i][1];
            }
        }
        return highestY;
    }

    private static double getLowestY(double[][] point){
        double lowestY = point[0][1];
        for(int i = 1; i < point.length; i++){
            if(point[i][1] < lowestY){
                lowestY = point[i][1];
            }
        }
        return lowestY;
    }
}
