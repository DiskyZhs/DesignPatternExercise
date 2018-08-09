package com.pin.patterndemo.behavioral.state;

/**
 * State 抽象
 */

public abstract class State {
    protected Context context;

    void setContext(Context context) {
        this.context = context;
    }

    abstract void start();

    abstract void stop();

    abstract void pause();

    abstract void resume();
}