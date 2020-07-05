package com.tingsic.POJO.service;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Service {

    @SerializedName("auth")
    @Expose
    private Auth auth;
    @SerializedName("request")
    @Expose
    private Request request;
    @SerializedName("service")
    @Expose
    private String service;

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

}