package com.zhxh.xutilslib;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.widget.TextView;

/**
 * Created by zhxh on 2018/7/10
 */
public class DisplayUtils {


    public static SpannableString getClickSpanStr(String srcStr, String clickStr, ClickableSpan clickableSpan) {

        if (TextUtils.isEmpty(srcStr))
            return new SpannableString("--");

        if (TextUtils.isEmpty(clickStr) || !srcStr.contains(clickStr))
            return new SpannableString(srcStr);

        if (TextUtils.isEmpty(clickStr)) clickStr = "";

        SpannableString resultSpan = new SpannableString(srcStr);

        if (srcStr.contains(clickStr)) {
            resultSpan.setSpan(clickableSpan,
                    srcStr.indexOf(clickStr),
                    srcStr.indexOf(clickStr) + clickStr.length(),
                    Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }

        return resultSpan;
    }

    public static void setClickSpan(TextView textView, String srcStr, String clickStr, ClickableSpan clickableSpan) {

        textView.setMovementMethod(LinkMovementMethod.getInstance());

        if (TextUtils.isEmpty(srcStr))
            return;

        if (TextUtils.isEmpty(clickStr) || !srcStr.contains(clickStr))
            return;

        if (TextUtils.isEmpty(clickStr)) clickStr = "";

        SpannableString resultSpan = new SpannableString(srcStr);

        if (srcStr.contains(clickStr)) {
            resultSpan.setSpan(clickableSpan,
                    srcStr.indexOf(clickStr),
                    srcStr.indexOf(clickStr) + clickStr.length(),
                    Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }

        textView.setText(resultSpan);
    }


}
