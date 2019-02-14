package com.mjc.voice.aop.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * Created by gcb on 2019/2/1.
 */
@Aspect     // 将这个类定义为 切面 1
@Component  // 将它纳入 spring容器
public class LogAspect {


    @Pointcut("@annotation(com.mjc.voice.aop.log.Action)") //声明这个方法为切点 2
    public void annotationPointCut() {
    }


    @After("annotationPointCut()") //注解拦截方式的建言3
    public void after(JoinPoint joinPoint){

        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action  = method.getAnnotation(Action.class);
        System.out.println(action.name() +"-- 时间"+ new Date()+"运算 1+1="+(1+1));

    }
    @Before("execution(* com.mjc.voice.aop.log.DemoMethodService.*(..))") //使用规则方式 的建言3
    public  void before(JoinPoint joinPoint){

        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则拦截" +method.getName());

    }



}

