package Chapter_5;

/**
 * Created by DWP on 10/3/16.
 */
public class ex_25_ch_5_compute_p {
    public static void main(String[] args) {
      for(double z = 10000; z <= 100000; z +=10000) {
          double p1 = 0;
          for (double i = z; i >= 2; i--) {
              p1 += Math.pow(-1, (i + 1)) / ((2 * i) - 1);
          }
          double p = (p1 + 1)*4;
          System.out.println("i " + z + " p = " + p);
      }

    }
}
