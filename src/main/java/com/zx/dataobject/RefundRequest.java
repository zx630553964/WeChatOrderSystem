package com.zx.dataobject;

import com.zx.enums.PayTypeEnum;
import lombok.Data;

@Data
public class RefundRequest {

    /**
     * 支付方式.
     */
    private PayTypeEnum payTypeEnum;

    /**
     * 订单号.
     */
    private String orderId;

    /**
     * 订单金额.
     */
    private Double orderAmount;

}
