package com.hkk.toolsmanage;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
public class Result<T> implements Serializable {



    private boolean success;

    private T result;

    private String errorCode;

    private String errorMsg;


    /**
     * 无参构造方法/无参构造器
     */
   public Result(){
   }


    public Result(T result) {
        this.success = true;
        this.result = result;
    }
}
