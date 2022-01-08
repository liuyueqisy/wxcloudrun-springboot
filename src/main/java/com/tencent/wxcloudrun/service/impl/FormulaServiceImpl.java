package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.service.FormulaService;
import com.tencent.wxcloudrun.util.JEPUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class FormulaServiceImpl implements FormulaService {

    @Value("${formula.expression:arg0*arg1+1}")
    private String formulaExpression;

    @Override
    public double compute(List<Double> args, String expression) {
        if (!StringUtils.hasLength(expression)) {
            expression = formulaExpression;
        }

        return JEPUtil.evaluate(expression, args);
    }
}
