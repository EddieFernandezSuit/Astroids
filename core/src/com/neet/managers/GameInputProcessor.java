package com.neet.managers;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;

public class GameInputProcessor extends InputAdapter{
    public boolean keyDown(int k){
        if(k == Input.Keys.UP){
            GameKeys.setKey(GameKeys.UP, true);
        }
        if(k == Input.Keys.LEFT){
            GameKeys.setKey(GameKeys.LEFT, true);
        }
        if(k == Input.Keys.DOWN){
            GameKeys.setKey(GameKeys.DOWN, true);
        }
        if(k == Input.Keys.RIGHT){
            GameKeys.setKey(GameKeys.RIGHT, true);
        }
        if(k == Input.Keys.ENTER){
            GameKeys.setKey(GameKeys.ENTER, true);
        }
        if(k == Input.Keys.ESCAPE){
            GameKeys.setKey(GameKeys.ESCAPE, true);
        }
        if(k == Input.Keys.SPACE){
            GameKeys.setKey(GameKeys.SPACE, true);
        }
        if(k == Input.Keys.SHIFT_LEFT || k == Input.Keys.SHIFT_RIGHT){
            GameKeys.setKey(GameKeys.SHIFT, true);
        }
        if(k == Input.Keys.R){
            GameKeys.setKey(GameKeys.R, true);
        }
        return true;
    }
    public boolean keyUp(int k){
        if(k == Input.Keys.UP){
            GameKeys.setKey(GameKeys.UP, false);
        }
        if(k == Input.Keys.LEFT){
            GameKeys.setKey(GameKeys.LEFT, false);
        }
        if(k == Input.Keys.DOWN){
            GameKeys.setKey(GameKeys.DOWN, false);
        }
        if(k == Input.Keys.RIGHT){
            GameKeys.setKey(GameKeys.RIGHT, false);
        }
        if(k == Input.Keys.ENTER){
            GameKeys.setKey(GameKeys.ENTER, false);
        }
        if(k == Input.Keys.ESCAPE){
            GameKeys.setKey(GameKeys.ESCAPE, false);
        }
        if(k == Input.Keys.SPACE){
            GameKeys.setKey(GameKeys.SPACE, false);
        }
        if(k == Input.Keys.SHIFT_LEFT || k == Input.Keys.SHIFT_RIGHT){
            GameKeys.setKey(GameKeys.SHIFT, false);
        }
        if(k == Input.Keys.R){
            GameKeys.setKey(GameKeys.R, false);
        }
        return true;
    }
}
