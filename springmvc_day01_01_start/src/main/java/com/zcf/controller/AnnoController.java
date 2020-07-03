package com.zcf.controller;

import com.zcf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 常用注解
 */
@Controller
@RequestMapping("/anno")
public class AnnoController {

    @RequestMapping(value = "testRequestParam")
    public String testRequestParam(@RequestParam("name") String username) {
        System.out.println("execute..." + username);
        return "success";
    }

    /**
     * 获取到请求体的内容
     */
    @RequestMapping(value = "/testRequestBody")
    public String testRequestBody(@RequestBody String body) {
        System.out.println(body);
        return "success";
    }

    @RequestMapping(value = "/testRequestBody1")
    public String testRequestBody1(User user) {
        System.out.println(user);
        return "success";
    }

    @RequestMapping(value = "/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable("sid") Integer id) {
        System.out.println(id);
        return "success";
    }

    /**
     * 获取请求头的值
     *
     * @param header
     * @return
     */
    @RequestMapping(value = "/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header, HttpServletRequest request, HttpServletResponse response) throws IOException {

        System.out.println(header);
        // return "redirect:/index.jsp";
        response.sendRedirect(request.getContextPath() + "/anno/testCookieValue");
        return "success";
    }

    /**
     * 获取cookie的值
     *
     * @return
     */
    @RequestMapping(value = "/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue) {
        System.out.println(cookieValue);
        return "success";
    }

    @RequestMapping(value = "/testModelAttribute")
    public String testModelAttribute() {
        System.out.println("testModelAttribute.....");
        return "success";
    }

    /**
     * 表示当前方法会在控制器的方法执行之前先执行，它可以修饰没有返回值的方法，也可以修饰有具体返回值的方法
     * 出现在参数上，获取指定的数据给参数赋值
     *
     * @param username
     */
/*    @ModelAttribute
    public void showUser(String username) {
        System.out.println("execute.....");
    }*/

    /**
     * 被ModelAttribute修饰的方法
     **/
   /* @ModelAttribute
    public void showUser(User user) {
        System.out.println("execute shwUser()" + user.getUsername());
    }*/

    /**
     * 接收请求的方法
     */
    @RequestMapping("/testModelAttribute1")
    public String testModelAttribute1(User user) {
        System.out.println("execute controller" + user.getUsername());
        return "success";
    }


    /**
     * 查询数据库中用户信息
     *
     * @return
     */
    @ModelAttribute
    public User showModel(String username) {
        //模拟去数据库查询
        User abc = findUserByName(username);
        System.out.println("execute showModel()" + abc);
        return abc;
    }

    /**
     * 模拟修改用户方法
     *
     * @param user
     * @return
     */
    @RequestMapping("/updateUser")
    public String testModelAttribute(User user) {
        System.out.println("controller:updateuser():" + user);
        return "success";
    }

    /**
     * 模拟去数据库查询
     *
     * @param username
     * @return
     */
    private User findUserByName(String username) {
        User user = new User();
        user.setUsername(username);
        user.setAge(19);
        user.setPassword("123456");
        return user;
    }


}
