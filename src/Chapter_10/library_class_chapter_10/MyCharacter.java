package Chapter_10.library_class_chapter_10;

/**
 * Created by bnamora on 2/21/17.
 */
public class MyCharacter {
    public static boolean isLetter(char character){
        for(int i = 65; i <= 90; i++){
            if((int) character == i || (int)character == (i + 32)){
                return true;
            }
        }
        return false;
    }

    public static boolean isDigit(char character){
        for(int i = '0'; i <= '9'; i++){
            if(character == i){
                return true;
            }
        }
        return false;
    }

    public static boolean isDigit(int codePoint){
        for(int i = 48; i <= 57; i++) {
            if (codePoint == i)
                return true;
        }
        return false;
    }

    public static boolean isWhiteSpace(char character){
        return character == ' ';
    }

    public static boolean isLowerCase(char character){
        for(int i = 'a'; i <= 'z'; i++)
            if(character == i)
                return true;

        return false;
    }

    public static boolean isUpperCase(char character){
        for(int i = 'A'; i <= 'Z'; i++)
            if(character == i)
                return true;

        return false;
    }

    public static char toUpperCase(char character){
        if((int) character > 92 && (int) character < 122){
            return (char) (character  - 32);
        }
        return character;
    }

    public static char toLowerCase(char character){

        if((int) character > 65 && (int) character < 90){
            return (char) (character + 32);
        }
        return character;
    }

    public String toString(char character){
        String temp = "";
        temp += character;
        return temp;
    }
}

