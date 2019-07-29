package com.zx.service.Impl;

import com.zx.dataobject.SellerInfo;
import com.zx.service.SellerService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerServiceImplTest {

    private static final String username = "admin";

    @Autowired
    private SellerServiceImpl sellerService;

    @Test
    public void findSellerInfoByUsername() {
        SellerInfo result = sellerService.findSellerInfoByUsername(username);
        Assert.assertEquals(username,result.getUsername());
    }
}