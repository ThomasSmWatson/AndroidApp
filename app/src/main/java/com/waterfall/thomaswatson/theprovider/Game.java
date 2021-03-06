package com.waterfall.thomaswatson.theprovider;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;

import com.waterfall.thomaswatson.theprovider.util.SystemUiHider;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class Game extends Activity {

    PlayerArea area;
    BlockDrawer drawer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        area = new PlayerArea(this);
        drawer = new BlockDrawer(this, area.getBlocks());

        setContentView(drawer);



    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int action = event.getActionMasked();
        Position<Integer> touchPosition = new Position<Integer>();



        return super.onTouchEvent(event);
    }

    @Override
    protected void onStart() {
        super.onStart();

    }


}
