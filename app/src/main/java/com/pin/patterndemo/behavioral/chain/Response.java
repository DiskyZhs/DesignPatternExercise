package com.pin.patterndemo.behavioral.chain;

/**
 * 请假回复类
 * Created by HH on 2018/8/2.
 */

public class Response {
    private boolean isRatify;
    private String extraInfo;

    public Response(boolean isRatify, String extraInfo) {
        this.isRatify = isRatify;
        this.extraInfo = extraInfo;
    }

    public boolean isRatify() {
        return isRatify;
    }

    public void setRatify(boolean ratify) {
        isRatify = ratify;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }
}
