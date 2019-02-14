package com.mjc.voice.aop.log;

import org.springframework.stereotype.Service;

/**
 * Created by gcb on 2019/2/1.
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式 add方法")
    public void add(){}


    @Action(name = "注解式 add2方法")
    public void add2(){}

    @Action
    public void add3(){}
}
