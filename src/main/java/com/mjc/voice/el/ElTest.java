package com.mjc.voice.el;

import com.mjc.voice.aop.log.AopConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.Resource;

/**
 * Created by gcb on 2019/2/13.
 */
public class ElTest {
    public  static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ResourceConfig.class);
        ElConfig elConfig = context.getBean(ElConfig.class);
        elConfig.outputResource();
        context.close();
    }
}
