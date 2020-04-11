package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by zhifeng
 * 2020/4/11 15:21
 */
@Test(groups = "stu")
public class GroupasOnClass1 {

    public void Stu1(){
        System.out.println("GrousOnClass1中的stu1运行");
    }

    public void Stu2(){
        System.out.println("GrousOnClass1中的stu2运行");
    }
}
