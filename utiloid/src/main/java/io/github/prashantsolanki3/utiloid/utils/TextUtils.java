package io.github.prashantsolanki3.utiloid.utils;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.widget.TextView;

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

    public static synchronized void setTextViewError(@NonNull TextView textView,@NonNull String error, @Nullable Drawable drawable){
        if(drawable!=null)
            textView.setError(error,drawable);
        else
            textView.setError(error);
    }

    /*SO answer by Christopher Perry http://stackoverflow.com/a/11838715/4132408 */
    public static abstract class TextValidator implements TextWatcher {
        private final TextView textView;

        public TextValidator(TextView textView) {
            this.textView = textView;
        }

        public abstract boolean validate(TextView textView, String text);
        public void isValid(TextView textView, String text){}
        public void isInvalid(TextView textView, String text){}

        @Override
        final public void afterTextChanged(Editable s) {
            String text = textView.getText().toString();

            if(validate(textView, text))
                isValid(textView,text);
            else
                isInvalid(textView,text);

        }

        @Override
        final public void beforeTextChanged(CharSequence s, int start, int count, int after) { /* Don't care */ }

        @Override
        final public void onTextChanged(CharSequence s, int start, int before, int count) { /* Don't care */ }
    }
}
