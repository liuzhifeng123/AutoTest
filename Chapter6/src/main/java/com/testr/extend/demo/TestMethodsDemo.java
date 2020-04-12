package com.testr.extend.deme;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by zhifeng
 * 2020/4/11 17:29
 */
public class TestMethodsDemo {

    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }


    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }


    @Test
    public void test3(){
        Assert.assertEquals("aaaa","aaaa");
    }

    @Test
    public void logDemo(){
        Reporter.log("这是我们自己写log日志");
        throw new RuntimeException("这是我们自己的运行时的异常");
    }
}
