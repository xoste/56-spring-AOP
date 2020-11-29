package com.xoste.leon.advice;

import org.springframework.aop.ThrowsAdvice;

/**
 * @author Xoste
 */
public class MyThrowsAdvice implements ThrowsAdvice {
    public void myException(Exception e) {
        System.out.println("出现异常通知的信息：" + e.getMessage());
    }
}
