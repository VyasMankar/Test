package com.kapileshrajput.loggertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kapileshrajput.testlib.Toast;
import com.rajputkapilesh.loggerutil.LoggerUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast.INSTANCE.showToast(this, "Hello his is a toast");
    }
}