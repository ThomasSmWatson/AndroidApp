package com.waterfall.thomaswatson.theprovider;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.WindowManager;

import com.waterfall.thomaswatson.theprovider.blocks.Block;
import com.waterfall.thomaswatson.theprovider.blocks.GrassBlock;

import java.util.ArrayList;

/**
 * Created by thomaswatson on 13/07/2015.
 */
public class BlockDrawer extends View{
    private Bitmap image;
    private ArrayList<Block> blocks;
    private int totalBlockAmount;
    private int blockAmountDrawn;
    Display display;
    Point size;
    Position<Integer> screenCenter;
    int offsetX, offsetY = 0;
    float mLastTouchX,mLastTouchY = 0;
    Position<Integer> movement = new Position<Integer>();

    private VelocityTracker mVelocityTracker = null;
    public BlockDrawer(Context context, ArrayList<Block> blocks) {
        super(context);
        display = ((WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();



        size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;

        screenCenter = new Position<Integer>();
        screenCenter.setX(width/2);
        screenCenter.setY(height/2);

        this.blocks = blocks;
        totalBlockAmount = blocks.size();
        blockAmountDrawn = 0;
    }

    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        canvas.save();
        for(Block block: blocks) {

            Position<Integer> position = new Position<Integer>();
            int xpos = (block.getPosition().getX() * GrassBlock.getScale() - getCenter().getX() + screenCenter.getX() + offsetX);
            int ypos = block.getPosition().getY() * GrassBlock.getScale() - getCenter().getY() + screenCenter.getY() + offsetY;

            position.setX(xpos);
            position.setY(ypos);

            canvas.drawBitmap(block.getBlockImage(), position.getX(), position.getY() , null);
        }
        canvas.restore();
    }



    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        final int action = ev.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN: {
                final float x = ev.getX();
                final float y = ev.getY();

                // Remember where we started
                mLastTouchX = x;
                mLastTouchY = y;
                break;
            }

            case MotionEvent.ACTION_MOVE: {
                final float x = ev.getX();
                final float y = ev.getY();

                // Calculate the distance moved
                final float dx = x - mLastTouchX;
                final float dy = y - mLastTouchY;

                // Move the object
                offsetX += dx;
                offsetY += dy;

                // Remember this touch position for the next move event
                mLastTouchX = x;
                mLastTouchY = y;

                // Invalidate to request a redraw
                invalidate();
                break;
            }
        }

        return true;
    }






    public Position<Integer> getCenter(){
        Position<Integer> center = new Position<Integer>();
        center.setX( 15 * Block.getScale()+Block.getScale()/2);
        center.setY(15 * Block.getScale() + Block.getScale() / 2);
        return center;
    }





}
