package com.example.config;

import lombok.Data;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

//@Configuration
public class ScheduleConfigure {


    @Scheduled(cron = "0 0 0 */1 * ?")
    public void test(){
        System.out.println("我是定时炸弹"+new Date());

    }
}
