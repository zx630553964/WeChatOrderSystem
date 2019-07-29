package com.zx.service;

import com.zx.dto.OrderDTO;

public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);
    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
