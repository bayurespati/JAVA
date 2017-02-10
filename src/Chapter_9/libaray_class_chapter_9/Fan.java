package Chapter_9.libaray_class_chapter_9;

/**
 * Created by bnamora on 2/10/17.
 */
public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    private String[] speedName= {"","Slow","MEDIUM","FAST"};

    public Fan(){
        speed = 1;
        on = false;
        radius = 5.0;
        color = "Blue";
    }

    public int getSpeed(){
        return speed;
    }

    public boolean getOn(){
        return on;
    }

    public double getRadius(){
        return radius;
    }

    public String color(){
        return color;
    }

    public void setSpeed(int speed){
        if(speed >= 1 && speed <= 3 ) {
            this.speed = speed;
        }
    }

    public void turnOn(){
        this.on = true;
    }

    public void turnOFF(){
        this.on = false;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        return (on) ? "Speed : "+speedName[speed]+", Color : "+color+", Radius : "+radius : "Color : "+color+", Radius : "+radius;
    }
}
