package com.zcf.controller;

import com.zcf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 返回String
     */
    @RequestMapping("/testString")
    public String testString() {
        System.out.println("UserController的testString()方法执行了.....");
        return "success";
    }

    /**
     * 返回void
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testVoid()方法执行了.....");
        // 在controller 方法形参上可以定义 request 和 response，使用 request 或 response 指定响应结果
        // 1.编写请求转发的程序
        // request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);

        // 2.重定向
        // response.sendRedirect(request.getContextPath() + "/index.jsp");
        // response.sendRedirect("testString");

        // 3.1设置中文乱码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        // 3.2直指定响应结果
        // response.getWriter().write("json串");
        response.getWriter().print("你好");

        return;
    }

    /**
     * 返回ModelAndView
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        // 创建ModelAndView对象
        ModelAndView mv = new ModelAndView();
        System.out.println("testModelAndView方法执行了...");
        // 模拟从数据库中查询出User对象
        User user = new User();
        user.setUsername("小凤");
        user.setPassword("456");
        user.setAge(30);

        // 把user对象存储到mv对象中，也会把user对象存入到request对象
        mv.addObject("user", user);
        mv.addObject("uname", "张三");
        // 跳转到哪个页面
        mv.setViewName("success");
        return mv;
    }

    /**
     * 转发
     */
    @RequestMapping("/testForward")
    public String testForward() {
        System.out.println("UserController的testForward()方法执行了....");
        // return "success";
        return "forward:/WEB-INF/pages/success.jsp";
    }

    /**
     * 重定向
     */
    @RequestMapping("/testRedirect")
    public String testRedirect() {
        System.out.println("UserController的testRedirect()方法执行了....");
        // return "success";
        return "redirect:testModelAndView";
    }

    /**
     * 模拟异步请求响应
     */
    @RequestMapping("/testResponseAjax")
    public @ResponseBody User testAjax(@RequestBody User user) {
        System.out.println("testAjax方法执行了...");
        // 客户端发送ajax的请求，传的是json字符串，后端把json字符串封装到user对象中
        System.out.println(user);
        // 做响应,模拟查询数据库
        user.setUsername("haha");
        user.setAge(22);
        // 做响应
        return user;
    }
}
