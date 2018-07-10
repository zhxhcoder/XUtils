package com.zhxh.xutils;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.zhxh.xutilslib.DisplayUtils;

public class MainActivity extends AppCompatActivity {
    TextView tv_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_show = findViewById(R.id.tv_show);

        String test = "";

        //for (Application application : AppInfoUtils.getAllNonSystemApplication(this)) {
        //    test = "\n" + application.getPackageName() + test;
        //}

        tv_show.setText(DisplayUtils.getClickSpanStr("hello world", "world", new Clickable(Color.RED, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("hhhh","hhhh");

                Toast.makeText(MainActivity.this, "world", Toast.LENGTH_LONG).show();

            }
        })));


    }

    class Clickable extends ClickableSpan {
        private int color;
        private View.OnClickListener mListener;

        public Clickable(int color, View.OnClickListener l) {
            this.color = color;
            mListener = l;
        }

        @Override
        public void onClick(View v) {
            mListener.onClick(v);
        }

        @Override
        public void updateDrawState(TextPaint ds) {
            ds.setColor(color);
        }
    }
}
