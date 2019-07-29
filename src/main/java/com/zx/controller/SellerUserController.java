package com.zx.controller;

import com.zx.dataobject.SellerInfo;
import com.zx.enums.ResultEnum;
import com.zx.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
@RequestMapping("/seller")
public class SellerUserController {
    @Autowired
    private SellerService sellerService;
    @GetMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("user/index");
    }
    @PostMapping("/verify")
    public ModelAndView verify(@RequestParam("username")String username,
                               @RequestParam("password")String password,
                               Map<String,Object> map) {
        SellerInfo sellerInfo = sellerService.findSellerInfoByUsername(username);
        if (!password.equals(sellerInfo.getPassword())) {
            map.put("msg", ResultEnum.LOGIN_FAIL.getMessage());
            map.put("url", "/sell/seller/login");
            return new ModelAndView("common/error");
        }
        map.put("msg", ResultEnum.LOGIN_SUCCESS.getMessage());
        map.put("url", "/sell/seller/login/order/list");
        return new ModelAndView("user/login", map);
    }
    @GetMapping("/logout")
    public ModelAndView logout( Map<String, Object> map) {
        map.put("msg", ResultEnum.LOGOUT_SUCCESS.getMessage());
        map.put("url", "/sell/seller/login");
        return new ModelAndView("common/success", map);
    }
}
