package com.zx.controller;

import com.zx.dto.OrderDTO;
import com.zx.enums.ResultEnum;
import com.zx.exception.SellException;
import com.zx.service.OrderService;
import com.zx.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/pay")
@Slf4j
public class PayController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private PayService payService;

    @GetMapping("/create")
    public ModelAndView create(@RequestParam("orderId") String orderId
            , @RequestParam("returnUrl") String returnUrl , Map<String , Object> map) {
        //1查找订单
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO == null) {
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }
        map.put("returnUrl", returnUrl);
        return new ModelAndView("pay/create", map);
    }
}
