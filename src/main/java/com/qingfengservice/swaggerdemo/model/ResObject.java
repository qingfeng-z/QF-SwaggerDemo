package com.qingfengservice.swaggerdemo.model;


import lombok.Data;

@Data
public class ResObject {
    public ResObject(Object content){
        this.content = content;
        this.isOk = true;
        this.code = 200;
    }
    private boolean isOk;
    private int code;
    private String message;
    private Object content;
}
