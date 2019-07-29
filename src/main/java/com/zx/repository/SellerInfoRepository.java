package com.zx.repository;

import com.zx.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerInfoRepository extends JpaRepository<SellerInfo,String> {
    SellerInfo findByUsername(String username);
}
