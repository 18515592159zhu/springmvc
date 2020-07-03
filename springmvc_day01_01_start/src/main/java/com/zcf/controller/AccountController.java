package com.zcf.controller;

import com.zcf.entity.Account;
import com.zcf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping(value = "/account")
public class AccountController {

    @RequestMapping(value = "/findAccount")
    public String findAccount() {
        System.out.println("findAccount！！！");
        return "success";
    }

    /**
     * 保存账户
     */
    @RequestMapping(value = "saveAccount", method = RequestMethod.POST)
    public String saveAccount() {
        System.out.println("save.....");
        return "success";
    }

    /**
     * 删除账户
     */
    @RequestMapping(value = "/deleteAccount", params = {"accountName", "money>100"})
    public String deleteAccount() {
        System.out.println("deeteAccount......");
        return "success";
    }

    @RequestMapping(value = "/findAccount1")
    public String findAccount1(Integer accountId) {

        System.out.println("findAccount！！！" + accountId);
        return "success";
    }

    /**
     * 基本类型和String类型作为参数
     *
     * @param accountId
     * @param accountName
     * @return
     */
    @RequestMapping(value = "/findAccount2")
    public String findAccount2(Integer accountId, String accountName) {
        System.out.println("findAccount！！！" + accountId + accountName);
        return "success";
    }

    @RequestMapping(value = "/findAccount3")
    public String findAccount3(Account account) {
        System.out.println("findAccount！！！" + account);
        return "success";
    }

    @RequestMapping(value = "/findAccount4")
    public String findAccount4(User user) {
        System.out.println("findAccount!!!" + user);
        return "success";
    }

    /**
     * 根据日期删除账户
     */
    @RequestMapping(value = "/deleteByDate")
    public String deleteByDate(Date date) {
        System.out.println("deleteByDate" + date);
        return "success";
    }

    /**
     * 原始API
     */
    @RequestMapping(value = "/testServletAPI")
    public String testServletAPI(HttpServletRequest request, HttpServletResponse response, HttpSession session) {

        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
        return "success";
    }

    @RequestMapping(value = "/testRequestParam")
    public String testRequestParam(@RequestParam("name") String username, @RequestParam(value = "age", required = false) String age) {
        System.out.println("testRequestParam" + username + age);
        return "success";
    }

    @RequestMapping(value = "/useRequestBody", method = RequestMethod.POST)
    public String useRequestBody(@RequestBody String body) {
        System.out.println("useRequestBody" + body);
        return "success";
    }

    @RequestMapping(value = "/usePathVariable/{id}")
    public String usePathVariable(@PathVariable("id") Integer id) {
        System.out.println("useRequestBody" + id);
        return "success";
    }

    @RequestMapping(value = "/testRestPOST", method = RequestMethod.POST)
    public String testRestPOST(User user) {
        System.out.println("testRestPOST" + user);
        return "success";
    }

    @RequestMapping(value = "/testRestPUT/{id}", method = RequestMethod.POST)
    public String testRestPUT(@PathVariable("id") Integer id, User user) {
        System.out.println("testRestPUT" + id + user);
        return "success";
    }

    @RequestMapping(value = "/testRestDELETE/{id}", method = RequestMethod.DELETE)
    public String testRestDELETE(@PathVariable("id") Integer id) {
        System.out.println("testRestDELETE" + id);
        return "success";
    }

    @RequestMapping(value = "/testRestGET/{id}", method = RequestMethod.GET)
    public String testRestGET(@PathVariable("id") Integer id) {
        System.out.println("testRestGET" + id);
        return "success";
    }


}
