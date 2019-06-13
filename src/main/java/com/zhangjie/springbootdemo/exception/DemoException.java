package com.zhangjie.springbootdemo.exception;


import com.zhangjie.springbootdemo.enums.ResultEnum;
import lombok.Getter;


/**
 *@author jason
 */
@Getter
public class DemoException extends RuntimeException {

    public Integer code;

    public String data;

    DemoException(Integer code, String message){
        super(message);
        this.code =code;
    }
    DemoException(ResultEnum resultEnum, String data) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
        this.data = data;
    }

}
