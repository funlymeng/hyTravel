package com.hy.hyTravel.common;

public class ResultMessage {


    public String message;

    public int    code;//1:成功    0：失败

    public Object data;

    public ResultMessage(int code, String message, Object data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 1:成功    0：失败
     * @return
     */
    public int getCode() {
        return code;
    }

    /**
     * 1:成功    0：失败
     * @param code
     */
    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
