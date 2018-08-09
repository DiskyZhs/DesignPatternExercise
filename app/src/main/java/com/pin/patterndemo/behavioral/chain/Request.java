package com.pin.patterndemo.behavioral.chain;

/**
 * 请假类，src被处理的类（建造者模式）
 * <p>
 * Created by HH on 2018/8/2.
 */

public class Request {
    private String name;

    private String reason;

    private int days;

    private String groupLeaderInfo;

    private String managerInfo;

    private String departmentHeaderInfo;

    private String customInfo;

    private Request(String name, String reason, int days, String groupLeaderInfo, String managerInfo, String departmentHeaderInfo, String customInfo) {
        this.name = name;
        this.reason = reason;
        this.days = days;
        this.groupLeaderInfo = groupLeaderInfo;
        this.managerInfo = managerInfo;
        this.departmentHeaderInfo = departmentHeaderInfo;
        this.customInfo = customInfo;
    }

    public String getName() {
        return name;
    }

    public String getReason() {
        return reason;
    }

    public int getDays() {
        return days;
    }

    public String getGroupLeaderInfo() {
        return groupLeaderInfo;
    }

    public String getManagerInfo() {
        return managerInfo;
    }

    public String getDepartmentHeaderInfo() {
        return departmentHeaderInfo;
    }

    public String getCustomInfo() {
        return customInfo;
    }

    public class Builder {
        private String name = "";

        private String reason = "";

        private int days = 0;

        private String groupLeaderInfo = "";

        private String managerInfo = "";

        private String departmentHeaderInfo = "";

        private String customInfo = "";

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = reason;
            return this;
        }

        public Builder setDays(int days) {
            this.days = days;
            return this;
        }

        public Builder setGroupLeaderInfo(String groupLeaderInfo) {
            this.groupLeaderInfo = groupLeaderInfo;
            return this;
        }

        public Builder setManagerInfo(String managerInfo) {
            this.managerInfo = managerInfo;
            return this;
        }

        public Builder setDepartmentHeaderInfo(String departmentHeaderInfo) {
            this.departmentHeaderInfo = departmentHeaderInfo;
            return this;
        }

        public Builder setCustomInfo(String customInfo) {
            this.customInfo = customInfo;
            return this;
        }

        public Request builder() {
            return new Request(name, reason, days, groupLeaderInfo, managerInfo, departmentHeaderInfo, customInfo);
        }
    }
}
