package com.wykblog.blog.controller;

import com.wykblog.blog.utils.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/login")
    public RespBean login(){
        return RespBean.error("尚未登录，请先登录！");
    }
}