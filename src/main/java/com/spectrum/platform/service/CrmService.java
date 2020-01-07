package com.spectrum.platform.service;

import com.spectrum.platform.util.CommonResult;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Service
public interface CrmService {

    @PostMapping(value = "api/crm/userRegister")
    CommonResult userRegister(@RequestParam Map map);
}
