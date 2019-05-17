package com.demo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10,"商品不存在");

    private Integer code;

    private String message;
}
