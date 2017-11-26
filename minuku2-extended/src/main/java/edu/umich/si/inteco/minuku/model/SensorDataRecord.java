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

   public float accelerometerX;
   public float accelerometerY;
   public float accelerometerZ;
   // public float accelerometer[3];
    public long creationTime;

    public SensorDataRecord() {
    }

    public SensorDataRecord(SensorOptimizedDataRecord sensorOptimizedDataRecord){
        if (sensorOptimizedDataRecord.accelerateAxis == 0) {
            this.accelerometerX=sensorOptimizedDataRecord.accelerometer;
            this.accelerometerY=0;
            this.accelerometerZ=0;
        } else if (sensorOptimizedDataRecord.accelerateAxis == 1) {
            this.accelerometerY=sensorOptimizedDataRecord.accelerometer;
            this.accelerometerX=0;
            this.accelerometerZ=0;
        } else {
            this.accelerometerZ=sensorOptimizedDataRecord.accelerometer;
            this.accelerometerX=0;
            this.accelerometerY=0;
        }
        this.creationTime=sensorOptimizedDataRecord.creationTime;
    }

    public SensorDataRecord(float accelerometerX
    , float accelerometerY,float accelerometerZ
    ) {
        this.creationTime = new Date().getTime();
        this.accelerometerX = accelerometerX;
        this.accelerometerY = accelerometerY;
        this.accelerometerZ = accelerometerZ;
    }

    public float getAccelerometerX() {
        return accelerometerX;
    }

    public float getAccelerometerY(){
        return accelerometerY;
    }
    
    public float getAccelerometerZ() {
        return accelerometerZ;
    }

    @Override
    public long getCreationTime() {
        return creationTime;
    }

    public void setAccelerometerX(float accelerometerX) {
        this.accelerometerX = accelerometerX;
    }

    public void setAccelerometerY(float accelerometerY) {
        this.accelerometerY = accelerometerY;
    }
    
    public void setAccelerometerZ(float accelerometerZ) {
        this.accelerometerZ = accelerometerZ;
    }

    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public String toString() {
        return "Acc:" + this.accelerometerX + this.accelerometerY + this.accelerometerZ;
    }
}