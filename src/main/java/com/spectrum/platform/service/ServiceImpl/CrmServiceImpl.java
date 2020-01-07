package com.spectrum.platform.service.ServiceImpl;

import com.spectrum.platform.service.CrmService;
import com.spectrum.platform.util.CommonResult;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class CrmServiceImpl implements CrmService {

    @Override
    public CommonResult userRegister(Map map) {
        return new CommonResult<>(map);
    }
}
