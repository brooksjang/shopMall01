package com.shoppmall.gmall.service;

import com.shopmall.gmall.bean.UserInfo;

import java.util.List;

public interface UserInfoService {

    /*查询所有用户信息*/
    public List<UserInfo> findAll();
}
