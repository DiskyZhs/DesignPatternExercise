package com.pin.patterndemo.behavioral.state;

import android.util.Log;

/**
 * State的具体实现
 */

public class PauseState extends State {
    @Override
    void start() {
        Log.e("State", "Player go to start");
        context.setState(this);
    }

    @Override
    void stop() {
        Log.e("State", "Player go to restart");

    }

    @Override
    void pause() {
        Log.e("State", "Player has paused");
        context.setState(this);
    }

    @Override
    void resume() {
        Log.e("State", "Player go to restart");
    }
}
