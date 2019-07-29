package com.zx.service;

import com.zx.dataobject.SellerInfo;

public interface SellerService {

    SellerInfo findSellerInfoByUsername(String username);

}
