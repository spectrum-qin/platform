package com.spectrum.platform.feign;

import com.spectrum.platform.util.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient("CRM")
@Component
public interface CrmInterface {

    @PostMapping(value = "api/crm/userRegister")
    CommonResult userRegister(Map map);

    @RequestMapping(value = "api/crm/selectUserInfoByIdNo", method = RequestMethod.GET)
    CommonResult selectUserInfoByIdNo(@RequestParam("idNo") String idNo);
}
