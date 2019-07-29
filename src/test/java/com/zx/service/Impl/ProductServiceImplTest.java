package com.zx.service.Impl;

import com.zx.dataobject.ProductInfo;
import com.zx.enums.ProductStatusEnum;
import com.zx.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() throws Exception{

        ProductInfo productInfo = productService.findOne("003");
        Assert.assertEquals("003",productInfo.getProductId());

    }

    @Test
    public void findUpAll() throws Exception{

        List<ProductInfo> productInfoList = productService.findUpAll();
        Assert.assertNotEquals(0,productInfoList.size());

    }

    @Test
    public void findAll() throws Exception{

        PageRequest request = new PageRequest(0,2);
        Page<ProductInfo> productInfoPage = productService.findAll(request);
        System.out.println(productInfoPage.getTotalElements());

    }

    @Test
    public void save() throws Exception{
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("006");
        productInfo.setProductName("黄金烧卖");
        productInfo.setProductPrice(new BigDecimal(2.8));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("皮薄馅多");
        productInfo.setProductIcon("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=731006344,3872566561&fm=26&gp=0.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(3);
        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);
    }
    @Test
    public void onSale(){
        ProductInfo result = productService.onSale("005");
        Assert.assertEquals(ProductStatusEnum.UP,result.getProductStatusEnum());
    }
    @Test
    public void offSale(){
        ProductInfo result = productService.offSale("005");
        Assert.assertEquals(ProductStatusEnum.DOWN,result.getProductStatusEnum());
    }
}