package com.test.mapper;

import com.test.pojo.Admin;

import java.util.HashMap;

public interface AdminDao {
    int registerAdmin(Admin admin);
    Admin login(HashMap hashMap);
}
