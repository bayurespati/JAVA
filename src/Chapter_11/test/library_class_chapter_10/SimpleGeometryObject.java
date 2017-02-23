package Chapter_11.test.library_class_chapter_10;

/**
 * Created by bnamora on 2/23/17.
 */
public class SimpleGeometryObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    public SimpleGeometryObject(){
        dateCreated =  new java.util.Date();
    }

    public SimpleGeometryObject(String color,  boolean filled){
        dateCreated =  new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    public String toString(){
        return "Created on "+ dateCreated + "\nColor "+ color +" and filled "+ filled;
    }
}
