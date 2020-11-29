package com.xoste.leon;

import com.xoste.leon.test.Demo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Xoste
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Demo demo = applicationContext.getBean("demo", Demo.class);
        demo.demo1();
        demo.demo2();
        demo.demo3("有参数的");
    }
}
