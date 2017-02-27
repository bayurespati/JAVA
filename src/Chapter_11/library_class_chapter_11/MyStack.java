package Chapter_11.library_class_chapter_11;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by bnamora on 2/27/17.
 */
public class MyStack extends ArrayList<String> {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int getSize(){
        return list.size();
    }

    public Object peek(){
        return list.get(getSize() - 1);
    }

    public Object pop(){
        Object o =  list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o){
        list.add(o);
    }

    @Override
    public String toString(){
        return "Stack : " + list.toString();
    }
}
