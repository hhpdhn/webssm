package com.hhp.ssm.service;

import java.util.HashMap;
import java.util.List;

public interface UserService {
    public List<HashMap<String, Object>> qryList(HashMap<String, Object> param);
}
