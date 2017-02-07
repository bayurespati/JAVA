package Chapter_9;

/**
 * Created by bnamora on 2/7/17.
 */
public class eg_4_ch_9_test_tv {
    public static void main(String[] args) {
        eg_3_ch_9_TV tv1 = new eg_3_ch_9_TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        eg_3_ch_9_TV tv2 = new eg_3_ch_9_TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1's channel is "+ tv1.channel+" and volume level is "+tv1.volumeLevel);
        System.out.println("tv2's channel is "+ tv2.channel+" and volume level is "+tv2.volumeLevel);
    }
}
