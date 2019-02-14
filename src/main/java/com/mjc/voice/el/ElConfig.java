package com.mjc.voice.el;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.apache.commons.io.IOUtils;

/**
 * Created by gcb on 2019/2/13.
 */

@Configuration
@ComponentScan("com.mjc.voice.el")
@PropertySource("classpath:test.properties")
public class ElConfig {
    //注入普通字符串
    @Value(" i  hate u")
    private String normal;
    //  注入系统字符串
    @Value("#{systemProperties['os.name']}")
    private String osName;
    // 注入表达式 结果
    @Value("#{T(java.lang.Math).random()*100}")
    private double randomNumber;
    // 注入其他bean的属性
    @Value("#{demoElService.another}")
    private String fromAnother;
    // 注入文件资源
    @Value("classpath:test.properties")
    private Resource resource;
    //注入 网址资源
    @Value("http://www.gegle.com")
    private Resource url;
    //注入配置文件 7
    @Value("${book.name}")
    private String bookname;

     //7
     @Autowired
    private Environment environment;

     //7
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {

        return  new PropertySourcesPlaceholderConfigurer();
    }

    public  void outputResource(){

        try{

            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println( IOUtils.toString(resource.getInputStream()));
            System.out.println(IOUtils.toString(url.getInputStream()));
            System.out.println(bookname);
            System.out.println(environment.getProperty("book.author"));
        } catch (Exception e){

            e.printStackTrace();
        }
    }
}
