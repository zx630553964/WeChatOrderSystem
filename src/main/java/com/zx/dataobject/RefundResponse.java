package com.zx.dataobject;

import lombok.Data;

@Data
public class RefundResponse {

    /**
     * 订单号.
     */
    private String orderId;

    /**
     * 订单金额.
     */
    private Double orderAmount;

    /**
     * 第三方支付流水号.
     */
    private String outTradeNo;

    /**
     * 退款号.
     */
    private String refundId;

    /**
     * 第三方退款流水号.
     */
    private String outRefundNo;


}
