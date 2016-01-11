package io.github.prashantsolanki3.utiloid.utils;

import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import static io.github.prashantsolanki3.utiloid.Utiloid.checkInit;
import static io.github.prashantsolanki3.utiloid.Utiloid.context;

/**
 * Package io.github.prashantsolanki3.utiloid.utils
 * <p>
 * Created by Prashant on 1/11/2016.
 * <p>
 * Email: solankisrp2@gmail.com
 * Github: @prashantsolanki3
 */
public class FileUtils {

    public static synchronized void writeFile(String fileName, String data) {
        checkInit();
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;


        try {
            fileWriter = new FileWriter(context.getFileStreamPath(fileName));
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
        } catch (Exception e) {
            e.printStackTrace();
            Log.d("INTERNAL STORAGE WRITE", "ERROR: " + e.getMessage());
        } finally {
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
                if (fileWriter != null)
                    fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public static synchronized String readFile(String tag) {
        checkInit();
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        String temp;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            fileReader = new FileReader(context.getFileStreamPath(tag));
            bufferedReader = new BufferedReader(fileReader);
            while ((temp = bufferedReader.readLine()) != null)
                stringBuilder.append(temp);
        } catch (Exception e) {
            Log.d("INTERNAL STORAGE READ", "ERROR: " + e.getMessage());
            e.printStackTrace();
            return null;
        } finally {
            try {


                if (bufferedReader != null)
                    bufferedReader.close();
                if (fileReader != null)
                    fileReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return stringBuilder.toString();
    }

}
