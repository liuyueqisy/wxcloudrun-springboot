package com.tencent.wxcloudrun.dto;

import lombok.Data;

import java.util.List;

@Data
public class FormulaRequest {

    private List<Double> args;
    private String expression;
}
