package com.mjc.voice.aop.other;

import com.mjc.voice.aop.log.AopConfig;
import com.mjc.voice.aop.log.DemoAnnotationService;
import com.mjc.voice.aop.log.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Created by gcb on 2019/2/1.
 */
public class AnnotationAopTest {
    public  static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        demoAnnotationService.add();
        demoAnnotationService.add2();
        demoAnnotationService.add3();

        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoMethodService.adddd();

        context.close();

    }


}
