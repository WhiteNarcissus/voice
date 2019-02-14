package com.mjc.voice.aop.log;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by gcb on 2019/2/12.
 */
@Configuration
@ComponentScan("com.mjc.voice.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
