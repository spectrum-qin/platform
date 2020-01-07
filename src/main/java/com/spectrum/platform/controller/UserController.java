package com.spectrum.platform.controller;

import com.spectrum.platform.feign.CrmInterface;
import com.spectrum.platform.service.CrmService;
import com.spectrum.platform.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private CrmService crmService;
    @Autowired
    private CrmInterface crmInterface;

    @RequestMapping(value = "api/user/register", method = RequestMethod.GET)
    public CommonResult userRegister() {

        Map requestMap = new HashMap();
        requestMap.put("idNo", "371524199502124021");
        requestMap.put("idType", "20");
        requestMap.put("custName", "王五");
        requestMap.put("mobile", "13526983344");
        requestMap.put("email", "852413687@qq.com");
        requestMap.put("age", "15");
        requestMap.put("sex", "01");
        return crmInterface.userRegister(requestMap);
    }

    @RequestMapping(value = "api/user/selectUserInfoByIdNo", method = RequestMethod.GET)
    public CommonResult selectUserInfoByIdNo(String idNo) {

        return crmInterface.selectUserInfoByIdNo(idNo);
    }
}
