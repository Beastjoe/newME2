/*
 * Copyright (c) 2016.
 *
 * DReflect and Minuku Libraries by Shriti Raj (shritir@umich.edu) and Neeraj Kumar(neerajk@uci.edu) is licensed under a Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License.
 * Based on a work at https://github.com/Shriti-UCI/Minuku-2.
 *
 *
 * You are free to (only if you meet the terms mentioned below) :
 *
 * Share — copy and redistribute the material in any medium or format
 * Adapt — remix, transform, and build upon the material
 *
 * The licensor cannot revoke these freedoms as long as you follow the license terms.
 *
 * Under the following terms:
 *
 * Attribution — You must give appropriate credit, provide a link to the license, and indicate if changes were made. You may do so in any reasonable manner, but not in any way that suggests the licensor endorses you or your use.
 * NonCommercial — You may not use the material for commercial purposes.
 * ShareAlike — If you remix, transform, or build upon the material, you must distribute your contributions under the same license as the original.
 * No additional restrictions — You may not apply legal terms or technological measures that legally restrict others from doing anything the license permits.
 */

package edu.umich.si.inteco.minuku.model;

import java.util.Date;

import edu.umich.si.inteco.minukucore.model.DataRecord;
/**
 * Created by shriti on 7/15/16.
 */
public class SensorDataRecord implements DataRecord {

    //public float accelerometerX;
    //public float accelerometerY;
    //public float accelerometerZ;
    public float accelerometer[3];
    public long creationTime;

    public SensorDataRecord() {

    }

    public SensorDataRecord(float accelerometer
    //, float accelerometerY,float accelerometerZ
    ) {
        this.creationTime = new Date().getTime();
        this.accelerometer = accelerometer;
        //this.accelerometerY = accelerometerY;
        //this.accelerometerZ = accelerometerZ;
    }

    public float getAccelerometer() {
        return accelerometer;
    }

    /*public float getAccelerometerY() {
        return accelerometer[1];
    }
    
    public float getAccelerometerZ() {
        return accelerometer[2];
    }*/

    @Override
    public long getCreationTime() {
        return creationTime;
    }

    public void setAccelerometer(float accelerometer) {
        this.accelerometer = accelerometer;
    }

    /*public void setAccelerometerY(float accelerometer) {
        this.accelerometerY = accelerometer[1];
    }
    
    public void setAccelerometerZ(float accelerometer) {
        this.accelerometerZ = accelerometer[2];
    }*/

    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public String toString() {
        return "Acc:" + this.accelerometer;
    }
}