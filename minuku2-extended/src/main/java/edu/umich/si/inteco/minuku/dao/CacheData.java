package edu.umich.si.inteco.minuku.dao;


import android.content.Context;
import android.util.Config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.umich.si.inteco.minuku.model.LocationDataRecord;

/**
 * Created by Joe on 2017/10/22.
 */

public class CacheData {
    public static String getFileName() {
        File file = new File("/data/data/minuku/cache");
        if (!file.exists())
            file.mkdirs();
        String fileName = "cachedata_" + new SimpleDateFormat("MMddyyyy").format(new Date()).toString() +".dat";
        return fileName;
    }

    public static void saveRecord(LocationDataRecord entity){
        String fileName = "/data/data/minuku/cache" + File.separator + getFileName();
        File file = new File(fileName);
        try {
            if (!file.exists())
                file.createNewFile();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(entity);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<LocationDataRecord> getRecord() {
        List<LocationDataRecord> resultList = new ArrayList<>();
        String fileName = "/data/data/minuku/cache" + File.separator + getFileName();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
            ArrayList<LocationDataRecord> list_ext = (ArrayList<LocationDataRecord>) ois.readObject();

            for (LocationDataRecord obj : list_ext) {
                LocationDataRecord bean = obj;
                if (bean != null) {
                    resultList.add(bean);
                }
            }
            ois.close();
        } catch (Exception e) {
            return resultList;
        }
        return resultList;
    }
}
