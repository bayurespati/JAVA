package Chapter_10.library_class_chapter_10;

import sketch.Chapter_10_skecth.String_class;

/**
 * Created by bnamora on 2/22/17.
 public MyStringBuilder1(String s);
 public MyStringBuilder1 append(MyStringBuilder1 s);
 public MyStringBuilder1 append(int i);
 public int length();
 public char charAt(int index);
 public MyStringBuilder1 toLowerCase();
 public MyStringBuilder1 substring(int begin, int end);
 public String toString();
 */
public class MyStringBuilder {
    private char[] string = new char[0];

    public MyStringBuilder(){
    }

    public MyStringBuilder(String s){
        for(int i = 0; i < s.length(); i++){
            if(i >= string.length){
                char[] temp = new char[string.length + 1];
                System.arraycopy(string,0,temp,0,string.length);
                string = temp;
            }
            this.string[i] = s.charAt(i);
        }
    }

    public MyStringBuilder append(MyStringBuilder s){
        int limit = this.string.length + s.length();
        for(int i = this.string.length, index = 0; i < limit; i++, index++){
            if(i >= string.length){
                char[] temp = new char[string.length + 1];
                System.arraycopy(string,0,temp,0,string.length);
                string = temp;
            }
            this.string[i] = s.charAt(index);
        }
        return new MyStringBuilder(getTempString());
    }

    public MyStringBuilder append(int number){
        String stringNumber = String.valueOf(number);
        int limit = stringNumber.length() + string.length;

        for(int i = this.string.length, index = 0; i < limit; i++, index++){
            if(i >= string.length){
                char[] temp = new char[string.length + 1];
                System.arraycopy(string,0,temp,0,string.length);
                string = temp;
            }
            this.string[i] = stringNumber.charAt(index);
        }

        return new MyStringBuilder(getTempString());
    }

    private String getTempString(){
        String string = "";
        for(char index:this.string)
            string +=index;
        return string;
    }

    public int length(){
        return this.string.length;
    }

    public char charAt(int index){
        return this.string[index];
    }

    public MyStringBuilder toLowerCase(){
        String temp = "";
        for(char string:string){
            temp += ((int) string > 65 && (int) string < 90) ? (char) (string + 32) : string;
        }
        return new MyStringBuilder(temp);
    }

    public MyStringBuilder substring(int begin, int end){
        String temp = "";
        for(int i = begin; i <= end; i++){
            temp += this.string[i];
        }
        return new MyStringBuilder(temp);
    }

    public String toString(){
        String temp = "";
        for(char string:string)
            temp+=string;
        return temp;
    }
}