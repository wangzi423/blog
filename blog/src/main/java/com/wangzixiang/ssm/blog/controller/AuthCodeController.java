package com.wangzixiang.ssm.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Random;

public class AuthCodeController {


@RequestMapping("/code")
public void getCode(HttpServletResponse response, HttpSession session){
    int width = 63;
    int height = 34;
    Random random = new Random();
    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-Control", "no-cache");

}

}
