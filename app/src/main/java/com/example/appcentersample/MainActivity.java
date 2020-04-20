package com.example.appcentersample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCenter.start(getApplication(), "da13410d-be8a-4b3e-bf2a-8cae42ed0031",
                Analytics.class, Crashes.class);
    }
}
