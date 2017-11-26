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
 * Created by Beastjoe on 11/21/17.
 */
public class SensorOptimizedDataRecord implements DataRecord {

    public float accelerometer;
    public int accelerateAxis; //0 = X-axis, 1 = Y-axis, 2 = Z-axis
    // public float accelerometer[3];
    public long creationTime;

    public SensorOptimizedDataRecord() {
    }
    public SensorOptimizedDataRecord(SensorDataRecord entity){
        if (entity.getAccelerometerX() > entity.getAccelerometerY() && entity.getAccelerometerX() > entity.getAccelerometerZ()) {
            this.accelerateAxis = 0;
            this.accelerometer = entity.getAccelerometerX();
        } else if (entity.getAccelerometerY() > entity.getAccelerometerX() && entity.getAccelerometerY() > entity.getAccelerometerZ()) {
            this.accelerateAxis = 1;
            this.accelerometer = entity.getAccelerometerY();
        } else {
            this.accelerateAxis = 2;
            this.accelerometer = entity.getAccelerometerZ();
        }
        this.creationTime = entity.creationTime;
    }



    public SensorOptimizedDataRecord(float accelerometer
    , int accelerateAxis
    ) {
        this.creationTime = new Date().getTime();
        this.accelerometer  = accelerometer;
        this.accelerateAxis = accelerateAxis;
    }

    public float getAccelerometer() {return accelerometer;}

    public int getAccelerateAxis() {return accelerateAxis;}

    @Override
    public long getCreationTime() {
        return creationTime;
    }

    public void setAccelerometer(float accelerometer) {this.accelerometer = accelerometer;}

    public void setAccelerateAxis(int accelerateAxis) {this.accelerateAxis = accelerateAxis;}

    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public String toString() {
        return "Acc:" + this.accelerometer + "Axis:" + this.accelerateAxis;
    }
}