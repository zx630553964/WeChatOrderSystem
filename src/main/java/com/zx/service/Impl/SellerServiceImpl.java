package com.zx.service.Impl;

import com.zx.dataobject.SellerInfo;
import com.zx.repository.SellerInfoRepository;
import com.zx.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService {
    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByUsername(String username) {
        return repository.findByUsername(username);
    }
}
