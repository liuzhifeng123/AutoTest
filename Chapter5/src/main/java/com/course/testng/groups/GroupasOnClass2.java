package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by zhifeng
 * 2020/4/11 15:21
 */
@Test(groups = "stu")
public class GroupasOnClass2 {
    public void Stu1(){
        System.out.println("GrousOnClass2中的stu1运行");
    }
    public void Stu2(){
        System.out.println("GrousOnClass2中的stu2运行");
    }
}
