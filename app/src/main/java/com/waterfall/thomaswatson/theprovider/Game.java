package com.waterfall.thomaswatson.theprovider;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;

import com.waterfall.thomaswatson.theprovider.util.SystemUiHider;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class Game extends Activity {

    PlayerArea area;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game);
        myView view = new myView(this);
        setContentView(view);


    }

    @Override
    protected void onStart() {
        super.onStart();




//        area = PlayerArea.getInstance();
//
//        area.drawPlayerArea(this.getApplicationContext());
    }


    public class myView extends View {

        public myView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            Bitmap blockImage = BitmapFactory.decodeResource(getResources(), R.drawable.tiling_grass_block);
            canvas.drawBitmap(blockImage, 100, 100, null);
        }
    }
}
