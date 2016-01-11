package io.github.prashantsolanki3.utiloid.utils;

import android.util.Patterns;

import java.util.ArrayList;
import java.util.regex.Matcher;

import static io.github.prashantsolanki3.utiloid.Utiloid.checkInit;

/**
 * Package io.github.prashantsolanki3.utiloid.utils
 * <p>
 * Created by Prashant on 1/11/2016.
 * <p>
 * Email: solankisrp2@gmail.com
 * Github: @prashantsolanki3
 */
public class TextUtils {

    public static synchronized ArrayList<String> extractUrlsFromText(String text) {
        checkInit();
        ArrayList<String> links = new ArrayList<>();
        Matcher m = Patterns.WEB_URL.matcher(text);
        while (m.find()) {
            String url = m.group();
            links.add(url);
        }
        return links;
    }

}
