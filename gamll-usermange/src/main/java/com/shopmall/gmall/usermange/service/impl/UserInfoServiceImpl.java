package com.shopmall.gmall.usermange.service.impl;

import com.shopmall.gmall.bean.UserInfo;
import com.shopmall.gmall.usermange.mapper.UserInfoMapper;
import com.shoppmall.gmall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserInfo的实现类
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }
}
