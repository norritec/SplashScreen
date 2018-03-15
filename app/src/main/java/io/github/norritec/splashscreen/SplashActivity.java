package io.github.norritec.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by norritec on 3/15/18.
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Start HomeActivity
        startActivity(new Intent(SplashActivity.this, HomeActivity.class));

        // Close Splash Activity
        finish();
    }

}
