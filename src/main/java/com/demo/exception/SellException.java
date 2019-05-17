package com.demo.exception;

import com.demo.enums.ResultEnum;
import lombok.Getter;

@Getter
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum){

        super(resultEnum.getMessage());

        this.code=resultEnum.getCode();
    }

}
