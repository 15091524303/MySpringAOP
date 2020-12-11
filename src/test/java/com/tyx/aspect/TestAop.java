package com.tyx.aspect;

import com.tyx.annotation.AfterTyx;
import com.tyx.annotation.BeforeTyx;
import org.springframework.stereotype.Component;

@Component
public class TestAop {
    @BeforeTyx("com.tyx.dao")
    public void testBefore(){
        System.out.println("before -------------------- 测试成功！");
    }

    @AfterTyx("com.tyx.dao")
    public void testAfter(){
        System.out.println("after -------------------- 测试成功！");
    }

    @AfterTyx("com.tyx.dao")
    public void testAorund(){
        System.out.println("around -------------------- 测试成功！");
    }

}
