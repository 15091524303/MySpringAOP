package com.tyx.annotation;

import com.tyx.selector.CustomizedAopImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 描述：
 * aop开关注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(CustomizedAopImportSelector.class)
public @interface EnableAop {
}
