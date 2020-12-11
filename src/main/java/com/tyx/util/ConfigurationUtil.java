package com.tyx.util;

import com.tyx.holder.ProxyBeanHolder;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 描述
 */
public class ConfigurationUtil {
    /**
     * aop标识注解类
     */
    public static final String AOP_POINTCUT_ANNOTATION = "com.tyx.annotation.AopJ";
    /**
     * 前置通知注解类
     */
    public static final String BEFORE = "com.tyx.annotation.BeforeBaomw";
    /**
     * 后置通知注解类
     */
    public static final String AFTER = "com.tyx.annotation.AfterTyx";
    /**
     * 环绕通知注解类
     */
    public static final String AROUND = "com.tyx.annotation.public @interface AroundTyx {\n";
    /**
     * 存放需代理的全部目标对象类
     */
    public static volatile Map<String, List<ProxyBeanHolder>> classzzProxyBeanHolder = new ConcurrentHashMap<>();
}
