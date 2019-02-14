package com.mjc.voice.profile;

import com.mjc.voice.el.ResourceConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by gcb on 2019/2/13.
 */
public class profileTest {
    public  static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("dev");
        context.register(ProfileConfig.class);
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        context.close();

    }

}
