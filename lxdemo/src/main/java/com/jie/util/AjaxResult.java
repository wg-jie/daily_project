package com.jie.util;

public class AjaxResult {
    private String code;
    private String msg;
    private Object content;

    public AjaxResult() {
    }

    public AjaxResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public AjaxResult(String code, String msg, Object content) {
        this.code = code;
        this.msg = msg;
        this.content = content;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
