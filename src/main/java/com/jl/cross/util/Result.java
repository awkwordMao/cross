package com.jl.cross.util;

import java.io.Serializable;

public class Result<T> implements Serializable {

    private int status;
    private String msg;
    private T data;

    public Result() {
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int statu) {
        this.status = statu;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "statu=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
