package com.tencent.wxcloudrun.handler;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.exception.FormulaException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理捕捉器
 * @author liuyueqi
 * @date 2021-1-3
 */
@RestControllerAdvice
public class HomeExceptionHandler {

    @ExceptionHandler(value = FormulaException.class)
    public ApiResponse formulaExceptionHandler(FormulaException formulaException) {
        return ApiResponse.error(formulaException.getMessage());
    }
}
