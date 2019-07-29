package com.zx.enums;

import com.zx.exception.PayException;

public enum PayTypeEnum {

    ALIPAY_APP("alipay_app", "支付宝app"),

    ALIPAY_PC("alipay_pc", "支付宝pc"),

    ALIPAY_WAP("alipay_wap", "支付宝wap"),

    WXPAY_H5("wxpay_h5", "微信公众账号支付"),

    WXPAY_MWEB("MWEB", "微信公众账号支付"),
    ;

    private String code;

    private String name;

    PayTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static PayTypeEnum getByCode(String code) {
        for (PayTypeEnum bestPayTypeEnum : PayTypeEnum.values()) {
            if (bestPayTypeEnum.getCode().equals(code)) {
                return bestPayTypeEnum;
            }
        }
        throw new PayException(PayResultEnum.PAY_TYPE_ERROR);
    }
}