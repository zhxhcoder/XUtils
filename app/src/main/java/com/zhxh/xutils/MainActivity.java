package com.zhxh.xutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

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

        tv_show.setText(test);
    }
}
