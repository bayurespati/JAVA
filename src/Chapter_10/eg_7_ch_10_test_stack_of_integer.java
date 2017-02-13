package Chapter_10;

import Chapter_10.library_class_chapter_10.StackOfInteger;

/**
 * Created by bnamora on 2/13/17.
 */
public class eg_7_ch_10_test_stack_of_integer {
    public static void main(String[] args) {
        StackOfInteger stack = new StackOfInteger();

        for(int i = 0; i < 10; i++){
            stack.push(i);
        }

        while (!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
