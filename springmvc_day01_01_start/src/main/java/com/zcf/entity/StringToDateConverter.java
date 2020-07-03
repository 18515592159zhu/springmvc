package com.zcf.entity;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {
    @Nullable
    @Override
    public Date convert(String s) {
        DateFormat dateFormat = null;
        try {
            if (StringUtils.isEmpty(s)) {
                throw new NullPointerException("请输入要转换的日期");
            }
            dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dateFormat.parse(s);
            return date;
        } catch (Exception e) {
            throw new RuntimeException("输入日期有误");
        }
    }
}
