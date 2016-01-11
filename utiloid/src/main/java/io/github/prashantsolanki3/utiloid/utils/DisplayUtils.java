package io.github.prashantsolanki3.utiloid.utils;

import android.util.DisplayMetrics;

import static io.github.prashantsolanki3.utiloid.Utiloid.checkInit;
import static io.github.prashantsolanki3.utiloid.Utiloid.context;
import static io.github.prashantsolanki3.utiloid.utils.ConversionUtils.pixelsToDpi;

/**
 * Package io.github.prashantsolanki3.utiloid.utils
 * <p>
 * Created by Prashant on 1/11/2016.
 * <p>
 * Email: solankisrp2@gmail.com
 * Github: @prashantsolanki3
 */
public class DisplayUtils {

    public static synchronized float getScreenWidthPixels() {
        checkInit();
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return metrics.widthPixels;
    }


    public static synchronized float getScreenHeightPixels() {
        checkInit();
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return metrics.heightPixels;
    }


    public static synchronized float getScreenWidthDpi() {
        checkInit();
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return pixelsToDpi(metrics.widthPixels);
    }

    public static synchronized float getScreenHeightDpi() {
        checkInit();
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return pixelsToDpi(metrics.heightPixels);
    }

}
