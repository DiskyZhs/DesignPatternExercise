package com.pin.patterndemo.behavioral.state;

/**
 * 管理State的Context类,(对外的接口)
 */

public class Context {
    private State state;

    Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
        this.state.setContext(this);
    }

    public State getState() {
        return state;
    }

    public void start() {
        if (state != null) {
            state.start();
        }
    }

    public void stop() {
        if (state != null) {
            state.stop();
        }
    }

    public void pause() {
        if (state != null) {
            state.pause();
        }
    }

    public void resume() {
        if (state != null) {
            state.resume();
        }
    }

}