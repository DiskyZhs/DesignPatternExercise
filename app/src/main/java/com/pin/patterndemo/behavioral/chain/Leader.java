package com.pin.patterndemo.behavioral.chain;

/**
 * Created by HH on 2018/8/2.
 */

public interface Leader {
    Response dealRequest(Chain chain);

    /**
     * 接口描述：对request和Result封装，用来转发
     */
    interface Chain {
        // 获取当前request
        Request request();

        // 转发request
        Response proceed(Request request);
    }
}
