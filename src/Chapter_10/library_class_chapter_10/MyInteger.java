package Chapter_10.library_class_chapter_10;

/**
 * Created by bnamora on 2/16/17.
 */
public class MyInteger {
    private int value;

    public MyInteger(){
        value = 17;
    }

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public boolean isTrue(){
        return (isEven() || isOdd()) && isPrime();
    }

    public boolean isEven(){
        return this.value % 2 == 0;
    }

    public boolean isOdd(){
        return this.value % 2 != 0;
    }

    public boolean isPrime(){
        for (int divisor = 2; divisor <= this.value/2; divisor++){
            if (this.value % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTrue(int value){
        return (isOdd(value) || isEven(value)) && isPrime(value);
    }

    public static boolean isEven(int value){
        return value % 2 == 0;
    }

    public static boolean isOdd(int value){
        return value % 2 !=0;
    }

    public static boolean isPrime(int value){
        for (int divisor = 2; divisor <= value/2; divisor++){
            if (value % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTrue(MyInteger value){
        return (isEven(value) || isOdd(value)) && isPrime(value);
    }

    public static boolean isEven(MyInteger value){
        return value.value % 2 == 0;
    }

    public static boolean isOdd(MyInteger value){
        return value.value % 2 != 0;
    }

    public static boolean isPrime(MyInteger value){
        for (int divisor = 2; divisor <= value.value/2; divisor++){
            if (value.value % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(int value){
        return this.value == value;
    }

    public boolean equals(MyInteger value){
        return value.value == this.value;
    }

    public int parseInt(char[] value){
        for(int i = 0; i < value.length; i++){
            this.value +=  value[i];
        }
        return this.value;
    }

    public int parseInt(String value){
        return  this.value = Integer.parseInt(value);
    }
}
