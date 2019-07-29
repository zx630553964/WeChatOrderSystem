package com.zx.exception;

import com.zx.enums.PayResultEnum;

public class PayException extends RuntimeException {

    private Integer code;

    public PayException(PayResultEnum resultEnum) {
        super(resultEnum.getMsg());
        code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }
}

