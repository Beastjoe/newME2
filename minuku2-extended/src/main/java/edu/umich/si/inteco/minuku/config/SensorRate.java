package edu.umich.si.inteco.minuku.config;

/**
 * Created by 91017 on 2017/11/20.
 */

public class SensorRate {
    private int SENSOR_RATE_NORMAL = 20000; //50 Hz
    private int SENSOR_RATE_40Hz = 25000;
    private int SENSOR_RATE_30Hz = 33333;
    private int SENSOR_RATE_20Hz = 50000;
    private int SENSOR_RATE_10Hz = 100000;
    private int SENSOR_RATE_1Hz = 1000000;
    private int SENSOR_RATE_FAST = 12500; //80Hz

    public static int SENSOR_RATE_CUSTOM = 20000; //50Hz

    public int get_SENSOR_RATE_NORMAL(){
        return this.SENSOR_RATE_NORMAL;
    }

    public int get_SENSOR_RATE_40Hz(){
        return this.SENSOR_RATE_40Hz;
    }

    public int get_SENSOR_RATE_30Hz(){
        return this.SENSOR_RATE_30Hz;
    }

    public int get_SENSOR_RATE_20Hz(){
        return this.SENSOR_RATE_20Hz;
    }

    public int get_SENSOR_RATE_10Hz(){
        return this.SENSOR_RATE_10Hz;
    }

    public int get_SENSOR_RATE_FAST(){
        return this.SENSOR_RATE_FAST;
    }

    public int get_SENSOR_RATE_1Hz(){
        return this.SENSOR_RATE_1Hz;
    }
}
