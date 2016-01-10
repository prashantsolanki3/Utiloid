package io.github.prashantsolanki3.utiloidsample;

import android.app.Application;

import io.github.prashantsolanki3.utiloid.U;
import io.github.prashantsolanki3.utiloid.Utiloid;

/**
 * Package io.github.prashantsolanki3.utiloidsample
 * <p>
 * Created by Prashant on 1/10/2016.
 * <p>
 * Email: solankisrp2@gmail.com
 * Github: @prashantsolanki3
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Simple Initialization
        Utiloid.init(getApplicationContext());
        //or
        // U.init(getApplicationContext());
        // Whichever you like.

        //You can use utiloid now.
        U.screenHeightDpi();
        U.screenWidthDpi();
        //...

    }
}
