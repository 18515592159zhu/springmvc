package com.zcf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"username", "password"}, types = {Integer.class})
public class SessionAttributeController {
    /**
     * 吧数据存入SessionAttribute
     */
    @RequestMapping("/testPut")
    public String testPut(Model model) {
        model.addAttribute("username", "zhangsan");
        model.addAttribute("password", "123456");
        model.addAttribute("age", 21);
        return "success";
    }

    @RequestMapping("/testGet")
    public String testGet(ModelMap model) {
        System.out.println(model.get("username") + ";" + model.get("password") + ";" + model.get("age"));
        return "success";
    }

    @RequestMapping("/testClean")
    public String testClean(SessionStatus sessionStatus) {

        sessionStatus.setComplete();
        return "success";
    }
}