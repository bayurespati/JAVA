package Chapter_10.library_class_chapter_10;

/**
 * Created by bnamora on 2/21/17.
 */
public class MyString2 {
    private String string;

    public MyString2(){

    }

    public MyString2(String string){
        this.string = string;
    }

    public int length(){
        return string.length();
    }

    public char chatAt(int index){
        return string.charAt(index);
    }

    public int compare(String string){
        int numberCompare = 0;
        int limit  = (string.length() < this.string.length()) ? string.length() : this.string.length();
        for(int i = 0; i < limit; i++){
            if(this.string.charAt(i) < string.charAt(i)){
                return numberCompare = -1;
            }else if(this.string.charAt(i) > string.charAt(i)){
                return numberCompare = 1;
            }
        }
        return numberCompare;
    }

    public MyString2 substring(int begin){
        String temp = "";
        for(int i = begin; i < this.string.length(); i++){
            temp += this.string.charAt(i);
        }
        return new MyString2(temp);
    }

    public MyString2 toUpperCase(){
        String temp = "";
        for(int i = 0; i < this.string.length(); i++){
           temp += isLower(i) ?  getAlphabet(i) : string.charAt(i);
        }
        return new MyString2(temp);
    }

    public char[] toChar(){
        char[] temp = new char[string.length()];
        for(int i = 0; i < string.length(); i++){
            temp[i] = string.charAt(i);
        }
        return temp;
    }

    public static MyString2 valueOf(boolean b){
        return new MyString2(String.valueOf(b));
    }

    private boolean isLower(int index){
        char[] lowerCase = getLowerCase();
        for(int i = 0; i < lowerCase.length; i++){
            if(string.charAt(index) == lowerCase[i]){
                return true;
            }
        }
        return false;
    }

    private char getAlphabet(int index){
        char alphabet = 'a';
        char[] upperCase = getUpperCase();
        char[] lowerCase = getLowerCase();
        for(int i = 0; i < lowerCase.length; i++){
            if(string.charAt(index) == lowerCase[i]){
                alphabet = upperCase[i];
            }
        }
        return alphabet;
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
