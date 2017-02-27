package Chapter_11;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by bnamora on 2/25/17.
 */
public class eg_10_ch_11_MyStack {
    private ArrayList<Objects> list = new ArrayList<>();

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
        Objects o =  list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return 0;
    }

    public void push(Objects o){
        list.add(o);
    }

    @Override
    public String toString(){
        return "Stack : " + list.toString();
    }
}
