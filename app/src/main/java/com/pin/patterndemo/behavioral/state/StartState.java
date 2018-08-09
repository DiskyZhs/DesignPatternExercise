package com.pin.patterndemo.behavioral.state;

import android.util.Log;

/**
 * State的具体实现
 */

public class StartState extends State {
    @Override
    void start() {
        Log.e("State", "Player go to start");
    }

    @Override
    void stop() {
        Log.e("State", "Player go to restart");
        context.setState(this);
    }

    @Override
    void pause() {
        Log.e("State", "Player go to restart");
    }

    @Override
    void resume() {
        Log.e("State", "Player go to restart");
    }
}
