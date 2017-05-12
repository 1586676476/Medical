package com.witnsoft.interhis.medical.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.witnsoft.interhis.medical.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //隐藏掉整个ActionBar，包括下面的Tabs
        getSupportActionBar().hide();
    }
}
