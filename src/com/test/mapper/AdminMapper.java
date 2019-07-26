package com.test.mapper;

import com.test.pojo.Admin;

import java.util.HashMap;

public interface AdminMapper {
    //管理员首页登录
    Admin login(HashMap hashMap);
}
