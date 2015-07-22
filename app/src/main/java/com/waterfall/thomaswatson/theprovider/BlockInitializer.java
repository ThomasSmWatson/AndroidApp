package com.waterfall.thomaswatson.theprovider;

import android.content.Context;

import com.waterfall.thomaswatson.theprovider.blocks.Block;
import com.waterfall.thomaswatson.theprovider.blocks.BlockFactory;
import com.waterfall.thomaswatson.theprovider.blocks.GrassBlock;

import java.util.Random;

/**
 * Created by thomaswatson on 20/07/2015.
 */
public class BlockInitializer {

        private Context context;
        BlockFactory factory;


        public BlockInitializer(Context context){
            prepareVariablesForGeneration();
            this.context = context;
        }

        //return an ArrayList of positions which have available Blocks
        public static  Block[][] getAvailableBlocks(Block[][] blocks){

           return null;
        }

        private void prepareVariablesForGeneration(){
            factory = new BlockFactory();
        }

        //generates a square patch of grass blocks at pos x,y. with the radius given
        public Block[][] generateSquare(Block[][] blocks, int xPos, int yPos, int radius){
            Block[][] generatedBlocks = blocks;
            for(int x = 0; x<PlayerArea.blockXAmount; x++){
                for(int y = 0; y<PlayerArea.blockYAmount; y++){
                    if(x > xPos && x<xPos+radius  && y>yPos && y <yPos+radius){
                        Block block =new BlockFactory().makeBlock(BlockType.GRASS_BLOCK,context);
                        block.setPosition(x,y);
                        generatedBlocks[x][y] = block;
                    }
                }

            }
            return null;
        }


        //TODO: Generate a random area with the amount of blocks passed through
        public Block[][] generateRandomArea(Block[][] blocks, Position<Integer> center, int amount) {
            Block[][] newBlocks = blocks;
            int direction = new Random().nextInt(4);

            int newX,newY;
            newX = center.getX();
            newY = center.getY();

            switch(direction){
                case Block.NORTH:
                    newY--;
                    break;
                case Block.SOUTH:
                    newY++;
                    break;
                case Block.EAST:
                    newX++;
                    break;
                case Block.WEST:
                    newX--;
                    break;
            }


            if(newX <0 || newX > PlayerArea.blockYAmount || newY<0 || newY >PlayerArea.blockYAmount || newBlocks[newX][newY] instanceof GrassBlock){

                generateRandomArea(newBlocks,center,amount);
            }

            if(amount != 0 ){
                Block block =new BlockFactory().makeBlock(BlockType.GRASS_BLOCK,context);
                Position<Integer> pos = new Position<Integer>();
                pos.setX(newX);
                pos.setY(newY);
                block.setPosition(pos);
                newBlocks[newX][newY] =block;
                generateRandomArea(newBlocks, newBlocks[newX][newY].getPosition(),amount-1);
            }


                return newBlocks;


        }

    }
