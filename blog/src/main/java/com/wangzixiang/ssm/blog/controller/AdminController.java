package com.wangzixiang.ssm.blog.controller;

import com.wangzixiang.ssm.blog.bean.User;
import com.wangzixiang.ssm.blog.constants.BlogEnum;
import com.wangzixiang.ssm.blog.exception.BlogException;
import com.wangzixiang.ssm.blog.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;
    //跳转到登录页面
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/wangzi")
    public String login(User user, String authCode, Model model, HttpSession session) {
        try{
            //从session获取正确的验证码
            String correctCode = (String) session.getAttribute("autoCode");
            if(!authCode.equalsIgnoreCase(correctCode)){
                throw new BlogException(BlogEnum.AUTH_ERROR);
            }
            adminService.login(user);
        }catch (BlogException e){
            model.addAttribute("message",e.getMessage());
            return "login";
        }
        return "";
    }
    }



