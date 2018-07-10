package com.zhxh.xutilslib;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;

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


}
