package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by zhifeng
 * 2020/4/11 15:21
 */
@Test(groups = "teacher")
public class GroupasOnClass3 {
    public void teacher1(){
        System.out.println("GrousOnClass3中的teacher1运行");
    }

    public void teacher2(){
        System.out.println("GrousOnClass3中的teacher2运行");
    }
}
