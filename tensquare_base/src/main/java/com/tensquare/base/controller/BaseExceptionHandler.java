package com.tensquare.base.controller;

import entity.Result;
import entity.StatusCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*  统一异常处理类
 * */
@RestControllerAdvice  //增强控制层
public class BaseExceptionHandler {
    //  只处理这个异常方法浏览器解析
    @ExceptionHandler(value = Exception.class)
    public Result exception(Exception e){
        e.printStackTrace();
        return new Result(false, StatusCode.ERROR, e.getMessage());
    }
}
