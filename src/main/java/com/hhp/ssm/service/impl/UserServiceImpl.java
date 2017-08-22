package com.hhp.ssm.service.impl;

import com.hhp.ssm.service.UserService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {
    @Resource(name = "defaultSQLSessionTemplate")
    protected SqlSessionTemplate session;

    public List<HashMap<String, Object>> qryList(HashMap<String, Object> param) {
        List<HashMap<String,Object>> objects = session.selectList("user.selectUserList");
        return objects;
    }
}
