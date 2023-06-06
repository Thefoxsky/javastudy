package com.example.Controller;

import com.example.entity.UserDate;
import com.example.listener.TestEvent;
import com.example.service.TestService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class mainController {

    @Resource
    TestService service;
    @Resource
    ApplicationContext context;

    @RequestMapping("login")
    public String login(HttpServletRequest request){


        return "login";
    }


    @RequestMapping("/index")
    public String index(HttpServletRequest request){
        context.publishEvent(new TestEvent("有人访问了index页面"));
        return "index";

    }



}
