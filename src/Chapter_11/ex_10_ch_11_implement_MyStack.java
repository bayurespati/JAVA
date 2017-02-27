package Chapter_11;
import Chapter_11.library_class_chapter_11.MyStack;

import java.util.Scanner;

/**
 * Created by bnamora on 2/27/17.
 */
public class ex_10_ch_11_implement_MyStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack list = new MyStack();

        System.out.println("Enter five string : ");

        for(int i = 0; i < 5 ; i++)
            list.push(input.nextLine());

        for(int i = list.getSize() - 1; i >= 0; i--)
            System.out.print(list.pop()+" ");
    }
}
