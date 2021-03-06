package com.zcf.exception;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 异常处理器
 */
public class SysExceptionResolver implements HandlerExceptionResolver {

    /**
     * 处理异常业务逻辑
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @return
     */
    @Nullable
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, @Nullable Object handler, Exception ex) {
        // 获取到异常对象
        SysException e = null;
        // 如果抛出的是系统自定义异常则直接转换
        if (ex instanceof SysException) {
            e = (SysException) ex;
        } else {
            // 如果抛出的不是系统自定义异常则重新构造一个系统错误异常。
            e = new SysException("系统正在维护.....");
        }
        // 创建ModelAndView对象
        ModelAndView mv = new ModelAndView();
        mv.addObject("errorMsg", e.getMessage());
        mv.setViewName("error");
        return mv;
    }
}