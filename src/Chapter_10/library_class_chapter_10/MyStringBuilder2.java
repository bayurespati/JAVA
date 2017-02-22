package Chapter_10.library_class_chapter_10;

/**
 * Created by bnamora on 2/22/17.
 public MyStringBuilder2();
 public MyStringBuilder2(char[] chars);
 public MyStringBuilder2(String s);
 public MyStringBuilder2 insert(int offset, MyStringBuilder2 s);
 public MyStringBuilder2 reverse();
 public MyStringBuilder2 substring(int begin);
 public MyStringBuilder2 toUpperCase();
 */
public class MyStringBuilder2 {
    private char[] string = new char[0];

    public MyStringBuilder2(){
    }

    public MyStringBuilder2(char[] chars){
        for (int i = 0; i < chars.length; i++) {
            if (i >= string.length) {
                char[] temp = new char[string.length + 1];
                System.arraycopy(string, 0, temp, 0, string.length);
                string = temp;
            }
            this.string[i] = chars[i];
        }
    }

    public MyStringBuilder2(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (i >= string.length) {
                char[] temp = new char[string.length + 1];
                System.arraycopy(string, 0, temp, 0, string.length);
                string = temp;
            }
            this.string[i] = s.charAt(i);
        }
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s){
        getTemp(offset,s.length());
        String tempString = s.toString();
        for(int i = 0, index = offset; i < s.length(); i++,index++ ){
            string[index] = tempString.charAt(i);
        }
        return new MyStringBuilder2(string);
    }

    public MyStringBuilder2 reverse(){
        for(int i = 0,index = string.length - 1; i < string.length / 2 ; i++, index--){
            char temp = string[i];
            string[i] = string[index];
            string[index] = temp;
        }
        return new MyStringBuilder2(string);
    }

    public MyStringBuilder2 substring(int begin){
        char[] temp = new char[(string.length - begin)];
        for(int i = begin, index = 0; i < string.length; i++,index++ ){
            temp[index] = string[i];
        }
        string = temp;
        return new MyStringBuilder2(string);
    }

    public MyStringBuilder2 toUpperCase(){
        for(int i = 0; i < string.length; i++){
            if((int)string[i] > 92 && (int)string[i] < 122){
                string[i] = (char)((int) string[i] - 32);
            }
        }
        return new MyStringBuilder2(string);
    }

    private void getTemp(int offset,int length){
        int start = string.length - 1;
        char[] temp = new char[string.length + length];
        System.arraycopy(string, 0, temp, 0, string.length);
        string = temp;
        for(int i = start, index = (string.length - 1) ; i >= offset; i--, index--){
            string[index] = string[i];
        }
    }

    private int length(){
        return string.length;
    }

    public String toString(){
        String temp = "";
        for(char string:string)
            temp += string;
        return temp;
    }
}
