package com.test.service;

import com.test.mapper.AdminDao;
import com.test.pojo.Admin;
import com.test.utils.MapperUtil;

import java.util.HashMap;

public class LoginService {

    public Admin login(HashMap hashMap) {
        Admin ad = MapperUtil.getSession().getMapper(AdminDao.class).login(hashMap);
        return ad;
    }
}
