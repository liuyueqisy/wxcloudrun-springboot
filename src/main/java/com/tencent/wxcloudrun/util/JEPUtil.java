package com.tencent.wxcloudrun.util;

import com.tencent.wxcloudrun.exception.FormulaException;
import org.nfunk.jep.JEP;

import java.util.List;

/**
 * Java计算表达式工具类
 * @author liuyueqi
 * @date 2022-1-3
 */
public class JEPUtil {

    public static double evaluate(String expression, List<Double> args) {
        JEP jep = new JEP();
        for (int i=0; i<args.size(); i++) {
            double arg = args.get(i);
            jep.addVariable("arg" + i, arg);
        }

        Object result = null;
        try {
            // 执行
            jep.parseExpression(expression);
            result = jep.getValue();
        } catch (Exception e) {
            throw new FormulaException("公式表达式解析失败");
        }

        return (double)result;
    }
}
