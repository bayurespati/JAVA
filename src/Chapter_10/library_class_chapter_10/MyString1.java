package Chapter_10.library_class_chapter_10;

/**
 * Created by bnamora on 2/20/17.
 */
public class MyString1 {
    private char[] string = new char[1];
    public MyString1(){
    }
    public MyString1(char[] chars){
        int limit = getLimit(chars);
        for(int i = 0; i < limit; i++){
            if(i >= string.length){
                char[] temp = new char[this.string.length + 1];
                System.arraycopy(this.string,0,temp,0,this.string.length);
                this.string = temp;
            }
            string[i] = chars[i];
        }
    }

    public char charAt(int index){
        return this.string[index];
    }

    public int length(){
        return string.length;
    }

    public MyString1 substring(int begin, int end){
        char[] temp = new char[(end - begin)+1];
        for(int i = begin,index = 0; i <= end; i++,index++){
            temp[index] = string[i];
        }
        return new MyString1(temp);
    }

    public MyString1 toLowerCase(){
        char[] temp = new char[string.length];
        for(int i = 0; i < string.length; i++){
            isUpper(i);
        }
        return new MyString1(temp);
    }

    public boolean equal(MyString1 s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != this.string[i] || s.length() != this.string.length){
                return false;
            }
        }
        return true;
    }

    public static MyString1 valueOf(int number){
        char[] chars = {(char) number};
        return new MyString1(chars);
    }

    private int getLimit(char[] chars){
        int limit = 0;
        for (char ch :chars) {
            limit++;
        }
        return limit;
    }

    private void isUpper(int index){
        char[] lowerCase = getLowerCase();
        char[] upperCase = getUpperCase();
        for(int i = 0; i < upperCase.length ; i++){
            if(string[index] == upperCase[i]){
                string[index] = lowerCase[i];
            }
        }
    }

    private char[] getLowerCase(){
        char[] lowerCase = new char[26];
        for(char i = 0, alphabet = 'a'; i < lowerCase.length; i++,alphabet++){
            lowerCase[i] = alphabet;
        }
        return lowerCase;
    }

    private char[] getUpperCase(){
        char[] upperCase = new char[26];
        for(char i = 0, alphabet = 'A'; i < upperCase.length; i++,alphabet++){
            upperCase[i] = alphabet;
        }
        return upperCase;
    }
}
