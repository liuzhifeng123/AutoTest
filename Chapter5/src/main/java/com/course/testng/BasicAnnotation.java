package com.course.testng;

import org.testng.annotations.*;

/**
 * Created by zhifeng
 * 2020/4/11 13:53
 */
public class BasicAnnotation {
    //最基本注解，用来把方法标记未测试的一部分
    @Test
    public void testCase1(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("这是测试用例1");
    }

    @Test
    public void tetstCase2(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void baforMenthod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }

    @AfterMethod
    public void aferMethod(){
        System.out.println("BeforeMethod这是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是在类运行之前运行方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这是在类运行之后运行方法");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");

    }
}
