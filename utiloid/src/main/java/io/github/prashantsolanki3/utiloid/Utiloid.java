package io.github.prashantsolanki3.utiloid;

import android.content.Context;

/**
 * Package io.github.prashantsolanki3.utiloid
 * <p>
 * Created by Prashant on 1/10/2016.
 * <p>
 * Email: solankisrp2@gmail.com
 * Github: @prashantsolanki3
 */
public class Utiloid {
    protected static Context context = null;

    public static void init(Context context) {
        Utiloid.context = context;
    }

    protected static void checkInit() {
        if (U.isNull(context))
            throw new RuntimeException("Utiloid must be initialized before usage.");
    }
}
