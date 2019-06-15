package com.zhangjie.springbootdemo.exception;


import com.zhangjie.springbootdemo.enums.ResultEnum;
import lombok.Getter;


/**
 * 异常类
 *@author jason
 */
@Getter
public class DemoException extends RuntimeException {

    public Integer code;

    DemoException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    DemoException(Integer code, String message){
        super(message);
        this.code =code;
    }
}
