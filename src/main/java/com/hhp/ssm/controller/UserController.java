package com.hhp.ssm.controller;

import com.hhp.ssm.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Resource()
    private UserServiceImpl userServiceImpl;

    @ResponseBody
    @RequestMapping(value = "qryList")
    public List<HashMap<String, Object>> getUserList(HttpServletRequest request){
        List<HashMap<String, Object>> hashMaps = userServiceImpl.qryList(new HashMap<String, Object>());
        return  hashMaps;
    }
}
