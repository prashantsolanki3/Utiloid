package io.github.prashantsolanki3.utiloid.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import static io.github.prashantsolanki3.utiloid.Utiloid.checkInit;
import static io.github.prashantsolanki3.utiloid.Utiloid.context;

/**
 *
 * Created by Prashant on 1/14/2016.
 */
@SuppressWarnings("unused")
public class PackageUtils {

    public static PackageInfo getPackageInfo() throws PackageManager.NameNotFoundException {
        return getPackageInfo(context.getPackageName());
    }

    public static PackageInfo getPackageInfo(String packageName) throws PackageManager.NameNotFoundException {
        return getPackageInfo(context,packageName);
    }

    public static PackageInfo getPackageInfo(Context context, String packageName) throws PackageManager.NameNotFoundException {
        checkInit();
        return context.getPackageManager().getPackageInfo(packageName, 0);
    }

    public static String getVersionName () throws PackageManager.NameNotFoundException {
       return getVersionName(context.getPackageName());
    }

    public static String getVersionName (String packageName) throws PackageManager.NameNotFoundException {
        return getVersionName(context,packageName);
    }

    public static String getVersionName(Context context,String packageName) throws PackageManager.NameNotFoundException {
        return getPackageInfo(context,packageName).versionName;
    }

    public static int getVersionCode () throws PackageManager.NameNotFoundException {
        return getVersionCode(context.getPackageName());
    }

    public static int getVersionCode (String packageName) throws PackageManager.NameNotFoundException {
        return getVersionCode(context,packageName);
    }

    public static int getVersionCode (Context context,String packageName) throws PackageManager.NameNotFoundException {
        return getPackageInfo(context,packageName).versionCode;
    }
}
