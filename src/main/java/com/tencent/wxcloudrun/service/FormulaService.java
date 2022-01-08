package com.tencent.wxcloudrun.service;

import java.util.List;

/**
 * 计算公式
 */
public interface FormulaService {

    double compute(List<Double> args, String expression);
}
