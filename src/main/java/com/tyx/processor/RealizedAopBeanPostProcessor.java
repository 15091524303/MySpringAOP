package com.tyx.processor;

import com.tyx.util.ConfigurationUtil;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;

/**
 * aop实现核心处理类
 */

public class RealizedAopBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        String targetClass = bean.getClass().getName();
        Object object = bean;
        if (ConfigurationUtil.classzzProxyBeanHolder.containsKey(targetClass)){
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(object.getClass());
            enhancer.setCallback((Callback) new CustomizedProxyInterceptor(ConfigurationUtil.classzzProxyBeanHolder.get(targetClass)));
            object =  enhancer.create();
        }
        return object;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
