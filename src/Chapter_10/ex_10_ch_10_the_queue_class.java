package Chapter_10;

import Chapter_10.library_class_chapter_10.Queue;

/**
 * Created by bnamora on 2/17/17.
 */
public class ex_10_ch_10_the_queue_class {
    public static void main(String[] args) {
        Queue queue = new Queue();

        for(int i = 1; i <= 20; i++){
            queue.enqueue(i);
        }

        while (!queue.empty()){
            System.out.print(queue.dequeue()+ " ");
        }

        System.out.println();
        System.out.println("cek size queue "+queue.getSize());
    }
}
