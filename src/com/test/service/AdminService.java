package com.test.service;

import com.test.mapper.AdminDao;
import com.test.pojo.Admin;
import com.test.utils.MapperUtil;

import java.util.Map;

public class AdminService {
    public static int registerAdmin(Admin admin){
        int i = MapperUtil.getSession().getMapper(AdminDao.class).registerAdmin(admin);
        return i;
    }
}
