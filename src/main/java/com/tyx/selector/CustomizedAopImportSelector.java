package com.tyx.selector;

import com.tyx.processor.RealizedAopBeanPostProcessor;
import com.tyx.processor.RegisterBeanFactoryPostProcessor;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 描述：
 * 自定义AOP实现，提交给spring处理的类
 */
public class CustomizedAopImportSelector implements ImportSelector {
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{RealizedAopBeanPostProcessor.class.getName(), RegisterBeanFactoryPostProcessor.class.getName()};
    }
}
