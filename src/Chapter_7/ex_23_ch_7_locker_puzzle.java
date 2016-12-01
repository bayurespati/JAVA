package Chapter_7;

/**
 * Created by DWP on 12/1/16.
 */
public class ex_23_ch_7_locker_puzzle {
    public static void main(String[] args) {
        int[] locker = new int [100];
        printLocker(locker);
        printOpenLocker(locker);
    }

    public static void printLocker(int[] locker){

        for(int student = 0; student < 100; student++){
            //System.out.println("Student "+(student+1));
            for(int k = student; k < locker.length; k++){
               k = changeLocker(locker,student,k);
            }
           //printStatusLocker(locker);
        }

    }

    public static void printStatusLocker(int[] locker){

        int count = 0;

        for(int i = 0; i < locker.length; i++){

            if(locker[i] == 1){
                System.out.print(" Open ");
            }
            else
                System.out.print(" Close ");
            count++;
            if(count % 10 == 0){
                System.out.println();
            }
        }
    }

    public static int changeLocker(int[] locker, int i, int k){

        if( i == 0){
            locker[k] = 1;
        }
        else if(i == 1){
            locker[k] = 0;
        }
        else if( i > 1){
            if(locker[k] == 1){
                locker[k] = 0;
            }
            else
                locker[k] = 1;
            k  += i;
        }

        return k;
    }

    public static void printOpenLocker(int[] locker){

        System.out.println("Locker open : ");
        int count = 0;
        for(int i = 0; i < locker.length; i++){
            if(locker[i] == 1){
                System.out.print((i+1)+" ");
                count++;
            }

            if(count % 12 == 0)
                System.out.println();
        }
    }

}
