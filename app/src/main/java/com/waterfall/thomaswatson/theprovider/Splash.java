package com.waterfall.thomaswatson.theprovider;

import com.waterfall.thomaswatson.theprovider.util.SystemUiHider;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class Splash extends Activity {

    private static final int SPLASH_DISPLAY_LENGTH = 3000;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(Splash.this, Menu.class);
                Splash.this.startActivity(mainIntent);
                Splash.this.finish();
            }


        }, SPLASH_DISPLAY_LENGTH);

    }
}
