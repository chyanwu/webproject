package com.chenyanwu;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: chenyanwu
 * @Date: 2019/9/30 16:38
 * @Description:
 * @Version 1.0
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/say")
    @ResponseBody
    public String sayHello(String name, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("=================sessionId: " + request.getSession().getId());
        return "Hello, " + name;
    }

    @RequestMapping("/say1")
    @ResponseBody
    public String say1(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("=================sessionId: " + request.getSession().getId());
        return "Hello, ";
    }

}
