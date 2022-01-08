package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.dto.FormulaRequest;
import com.tencent.wxcloudrun.service.FormulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 计算公式控制器
 * @author liuyueqi
 * @date 2021-1-3
 */
@RestController
public class FormulaController {

    @Autowired
    FormulaService formulaService;

    @PostMapping("/api/compute")
    public ApiResponse compute(@RequestBody FormulaRequest request) {
        if (CollectionUtils.isEmpty(request.getArgs())) {
            return ApiResponse.ok();
        }

        return ApiResponse.ok(formulaService.compute(request.getArgs(), request.getExpression()));
    }
}
