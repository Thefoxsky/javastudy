package com.example.service;


import org.springframework.beans.factory.BeanNameAware;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TestService implements BeanNameAware {


    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }
}
