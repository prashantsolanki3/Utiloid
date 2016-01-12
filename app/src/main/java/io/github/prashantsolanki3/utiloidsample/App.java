package io.github.prashantsolanki3.utiloidsample;

import android.app.Application;

import static io.github.prashantsolanki3.utiloid.Utiloid.BASIC_UTILS.isNull;
import static io.github.prashantsolanki3.utiloid.Utiloid.init;
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
        init(getApplicationContext());
        //or
        // U.init(getApplicationContext());
        // Whichever you like.

        //You can use utiloid now.
        isNull(getApplicationContext());
        //...

    }
}
