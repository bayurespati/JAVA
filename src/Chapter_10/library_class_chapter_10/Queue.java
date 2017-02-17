package Chapter_10.library_class_chapter_10;

/**
 * Created by bnamora on 2/17/17.
 */
public class Queue {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    public  Queue(){
        this(DEFAULT_CAPACITY);
    }

    public Queue(int capacity){
        elements = new int[capacity];
    }

    public void enqueue(int value){
        if(size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int dequeue(){
        int tempQueue = elements[0];
        removeQueue();
        return tempQueue;
    }

    private void removeQueue(){
        for(int i = 0; i < size - 1; i++){
            elements[i] = elements[i + 1];
        }
        size--;
    }

    public boolean empty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }
}
