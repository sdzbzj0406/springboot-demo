package com.zhangjie.springbootdemo.exception;

import com.zhangjie.springbootdemo.VO.ResultVO;
import com.zhangjie.springbootdemo.utils.ResultVOUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jason
 */
@ControllerAdvice
public class DemoExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = DemoException.class)
    public ResultVO<?> handleSdcException(DemoException demo){
        return ResultVOUtil.error(demo.getCode(),demo.getMessage(),demo.getData());
    }
}
