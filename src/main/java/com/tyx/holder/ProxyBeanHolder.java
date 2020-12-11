package com.tyx.holder;

/**
 * 自定义数据结构
 * @author tyx
 * @create 2020-12-10 晚上 21:41
 */
public class ProxyBeanHolder {
    //通知类名称
    private volatile String className;
    //通知方法名称
    private volatile String methodName;
    //注解类名称
    private volatile String annotationName;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getAnnotationName() {
        return annotationName;
    }

    public void setAnnotationName(String annotationName) {
        this.annotationName = annotationName;
    }
}
