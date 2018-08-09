package com.pin.patterndemo.behavioral.chain;

import java.util.ArrayList;

/**
 * Created by HH on 2018/8/2.
 */

public class LeaderChains implements Leader.Chain {
    private ArrayList<Leader> leaders = new ArrayList<>();
    private int index = 0;
    private Request request;

    public LeaderChains(ArrayList<Leader> leaders, int index, Request request) {
        this.leaders = leaders;
        this.index = index;
        this.request = request;
    }

    public void addLeader(Leader leader) {
        leaders.add(leader);
    }

    @Override
    public Request request() {
        return request;
    }


    /**
     * 这里要用到递归来处理chains了 （正常情况下这里其实是可以使用Rxjava中的observable或者JS中的Promise进行包装的而导致不用使用递归和调用,或者当没有返回值的时候也可以直接使用，不用Index标注以及递归调用）
     */
    @Override
    public Response proceed(Request request) { //正常情况下这里的可以
        Response response = null;
        if (leaders.size() > index) {
            LeaderChains chains = new LeaderChains(leaders, index + 1, request);
            Leader leader = leaders.get(index);
            response = leader.dealRequest(chains);
        }

        return response;
    }
}
