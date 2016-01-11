package io.github.prashantsolanki3.utiloid.utils;

import android.util.TypedValue;

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
public class ConversionUtils {

    public static synchronized float dpiToPixels(float dpi) {
        checkInit();
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpi, context.getResources().getDisplayMetrics());
    }

    public static synchronized float pixelsToDpi(float pixel) {
        checkInit();
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_PX, pixel, context.getResources().getDisplayMetrics());
    }

}
