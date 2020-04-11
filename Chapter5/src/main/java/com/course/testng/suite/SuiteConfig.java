package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * Created by zhifeng
 * 2020/4/11 14:48
 */
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("before suite运行啦");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("after suite运行啦");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }
}
