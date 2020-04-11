package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

/**
 * Created by zhifeng
 * 2020/4/11 15:11
 */
public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端的测试方法11111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端的测试方法22222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端的测试方法33333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端的测试方法44444");
    }
    @BeforeGroups("server")
    public void befreGroupsOnserver(){
        System.out.println("这是服务器端组运行之前运行的方法");
    }
    @AfterGroups("server")
    public void afterGroupsOnserver(){
        System.out.println("这是服务器端组运行之后运行的方法！！！！！！！！！！！！");
    }
    @BeforeGroups("client")
    public void befreGroupsOnClient(){
        System.out.println("这是客户端组运行之前运行的方法");
    }
    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是客户端组运行之后运行的方法！！！！！！！！！！！！");
    }

}
