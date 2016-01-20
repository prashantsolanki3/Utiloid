package io.github.prashantsolanki3.utiloid;

import android.content.Context;

import io.github.prashantsolanki3.utiloid.utils.BasicUtils;
import io.github.prashantsolanki3.utiloid.utils.ConversionUtils;
import io.github.prashantsolanki3.utiloid.utils.DisplayUtils;
import io.github.prashantsolanki3.utiloid.utils.FileUtils;
import io.github.prashantsolanki3.utiloid.utils.PackageUtils;
import io.github.prashantsolanki3.utiloid.utils.TextUtils;

import static io.github.prashantsolanki3.utiloid.utils.BasicUtils.isNull;

/**
 * Package io.github.prashantsolanki3.utiloid
 * <p>
 * Created by Prashant on 1/10/2016.
 * <p>
 * Email: solankisrp2@gmail.com
 * Github: @prashantsolanki3
 */
public class Utiloid {

    public static Context context = null;

    public static synchronized void init(Context context) {
        Utiloid.context = context;
    }

    public static synchronized void checkInit() {
        if (isNull(context))
            throw new RuntimeException("Utiloid must be initialized before usage.");
    }

    public static class BASIC_UTILS extends BasicUtils {}

    public static class CONVERSION_UTILS extends ConversionUtils {}

    public static class DISPLAY_UTILS extends DisplayUtils {}

    public static class FILE_UTILS extends FileUtils {}

    public static class TEXT_UTILS extends TextUtils {}

    public static class PACKAGE_UTILS extends PackageUtils{}

}