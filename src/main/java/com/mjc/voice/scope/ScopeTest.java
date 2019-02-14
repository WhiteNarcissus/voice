package com.mjc.voice.scope;

import com.mjc.voice.aop.log.AopConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by gcb on 2019/2/13.
 */
public class ScopeTest {
    public  static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoScope   s1 = context.getBean(DemoScope.class);
        DemoScope   s2 = context.getBean(DemoScope.class);


        DemoPrototypeScope p1 = context.getBean(DemoPrototypeScope.class);
        DemoPrototypeScope p2 = context.getBean(DemoPrototypeScope.class);


        System.out.println("S1 与 S2 "+s1.equals(s2));
        System.out.println("P1 与 P2 "+p1.equals(p2));

        context.close();

    }
}
