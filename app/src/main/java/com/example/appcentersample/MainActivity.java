package com.example.appcentersample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    Button btn;


    @Override
    protected void onResume() {
        super.onResume();
       // Crashes.generateTestCrash();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCenter.start(getApplication(), "da13410d-be8a-4b3e-bf2a-8cae42ed0031",
                Analytics.class, Crashes.class);

btn = (Button)findViewById(R.id.button);


        Crashes.isEnabled();

        Crashes.setEnabled(true);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button has been clicked", Toast.LENGTH_LONG).show();
              Analytics.trackEvent("button clicked");
            }
        });


    }
}
