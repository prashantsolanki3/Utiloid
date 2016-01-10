package io.github.prashantsolanki3.utiloid;

import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Patterns;
import android.util.TypedValue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.regex.Matcher;

/**
 * Package io.github.prashantsolanki3.utiloid.lib
 * <p>
 * Created by Prashant on 1/10/2016.
 * <p>
 * Email: solankisrp2@gmail.com
 * Github: @prashantsolanki3
 */
public class U extends Utiloid {

    public static boolean isNull(Object o) {
        return o == null;
    }

    public static float dpiToPixels(float dpi) {
        checkInit();
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpi, context.getResources().getDisplayMetrics());
    }

    public static float pixelstoDpi(float pixel) {
        checkInit();
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_PX, pixel, context.getResources().getDisplayMetrics());
    }

    public static float screenWidthPixels() {
        checkInit();
        DisplayMetrics metrics = new DisplayMetrics();
        return metrics.widthPixels;
    }

    public static float screenHeightPixels() {
        checkInit();
        DisplayMetrics metrics = new DisplayMetrics();
        return metrics.heightPixels;
    }

    public static float screenWidthDpi() {
        checkInit();
        DisplayMetrics metrics = new DisplayMetrics();
        return pixelstoDpi(metrics.widthPixels);
    }

    public static float screenHeightDpi() {
        checkInit();
        DisplayMetrics metrics = new DisplayMetrics();
        return dpiToPixels(metrics.heightPixels);
    }

    public static ArrayList<String> extractUrlsFromText(String text) {
        checkInit();
        ArrayList<String> links = new ArrayList<>();
        Matcher m = Patterns.WEB_URL.matcher(text);
        while (m.find()) {
            String url = m.group();
            links.add(url);
        }
        return links;
    }

    public static void setDataToFile(String data, String fileName) {
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

    public static String getDataFromFile(String tag) {
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
