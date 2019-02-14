package com.mjc.voice.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by gcb on 2019/2/13.
 */
@Configuration
public class ProfileConfig {
    @Bean
    @Profile("dev")
    public DemoBean devDemoBean(){
        return  new DemoBean("dev profile");
    }

    @Bean
    @Profile("pro")
    public DemoBean proDemoBean(){
        return  new DemoBean("pro profile");
    }

}
