package com.pin.patterndemo.behavioral.state;

import android.util.Log;

/**
 * State的具体实现
 */

public class StopState extends State {
    @Override
    void start() {
        Log.e("State", "Player go to Stop");
        context.setState(this);
    }

    @Override
    void stop() {
        Log.e("State", "Player has Stopped");

    }

    @Override
    void pause() {
        Log.e("State", "Player go to Stop");
        context.setState(this);
    }

    @Override
    void resume() {
        Log.e("State", "Player go to Stop");
        context.setState(this);
    }
}
