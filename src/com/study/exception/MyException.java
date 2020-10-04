package com.study.exception;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-04 20:23
 */
public class MyException extends Exception{
    public MyException(){
        super();
    }
    public MyException(String msg){
        super(msg);
    }
    public MyException(Throwable cause){
        super(cause);
    }
    public MyException(String msg,Throwable cause){
        super(msg,cause);
    }
}
