package com.tyx.test;

import com.tyx.config.Appconfig;
import com.tyx.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
        annotationConfigApplicationContext.getBean(IndexDao.class).query2();
        annotationConfigApplicationContext.getBean(IndexDao.class).query();
    }
}
