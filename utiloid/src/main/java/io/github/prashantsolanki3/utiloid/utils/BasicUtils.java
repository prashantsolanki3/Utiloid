package io.github.prashantsolanki3.utiloid.utils;

import static io.github.prashantsolanki3.utiloid.Utiloid.checkInit;

/**
 * Package io.github.prashantsolanki3.utiloid.utils
 * <p>
 * Created by Prashant on 1/11/2016.
 * <p>
 * Email: solankisrp2@gmail.com
 * Github: @prashantsolanki3
 */
public class BasicUtils {
    public static synchronized boolean isNull(Object o) {
        checkInit();
        return o == null;
    }
}
