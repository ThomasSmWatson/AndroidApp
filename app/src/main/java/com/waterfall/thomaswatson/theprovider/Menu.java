package com.waterfall.thomaswatson.theprovider;

import com.waterfall.thomaswatson.theprovider.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */

public class Menu extends Activity implements View.OnClickListener{

    private Button launchGameButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu);

        launchGameButton = (Button) findViewById(R.id.btnGame);
        launchGameButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent mainIntent = new Intent(this, Game.class);
        this.startActivity(mainIntent);
        this.finish();
    }
}
