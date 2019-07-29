package com.zx.service.Impl;

import com.zx.config.WechatAccountConfig;
import com.zx.dto.OrderDTO;
import com.zx.enums.PayTypeEnum;
import com.zx.service.OrderService;
import com.zx.service.PayService;
import com.zx.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PayServiceImpl implements PayService {

    private static final String ORDER_NAME = "微信点餐订单";

    @Autowired
    private OrderService orderService;
    @Autowired
    private PayService payService;

    @Autowired
    private WechatAccountConfig accountConfig;

    @Override
    public void create(OrderDTO orderDTO) {

    }

//    @Override
//    public PayResponse create(OrderDTO orderDTO) {
//        PayRequest payRequest = new PayRequest();
//        payRequest.setOpenid(orderDTO.getBuyerOpenid());
//        payRequest.setOrderAmount(orderDTO.getOrderAmount().doubleValue());
//        payRequest.setOrderId(orderDTO.getOrderId());
//        payRequest.setOrderName(ORDER_NAME);
//        payRequest.setPayTypeEnum(PayTypeEnum.WXPAY_H5);
//        log.info("【微信支付】 request={}", JsonUtil.toJson(payRequest));
//
//        PayResponse payResponse = payService.pay(payRequest);
//        log.info("【微信支付response】 ={}",JsonUtil.toJson(payResponse));
//        return payResponse;
//    }
//    @Override
//    public PayResponse pay(PayRequest request) {
//        PayResponse payResponse = new PayResponse();
//        payResponse.setAppId(accountConfig.getMpAppId());
//        payResponse.setOrderAmount(request.getOrderAmount());
//        payResponse.setOrderId(request.getOrderId());
//        OrderDTO orderDTO = new OrderDTO();
//        payResponse.setTimeStamp(orderDTO.getCreateTime());
//        return payResponse;
//    }

}
