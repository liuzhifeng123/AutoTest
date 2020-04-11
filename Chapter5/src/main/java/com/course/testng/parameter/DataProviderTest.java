package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * Created by zhifeng
 * 2020/4/11 15:59
 */
public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name ,int age){
        System.out.println("name="+name+" age="+age);
    }

    @DataProvider(name="data")
    public Object[][] provderData(){
        Object[][] o = new Object[][]{
                {"zhangshan",10},
                {"wangwu",20}
        };
        return o;
    }

    @Test(dataProvider = "menthodData")
    public void test1(String name ,int age){
        System.out.println("Test1方法     name="+name+" age="+age);
    }

    @Test(dataProvider = "menthodData")
    public void test2(String name ,int age){
        System.out.println("Test2方法     name="+name+" age="+age);
    }

    @DataProvider(name="menthodData")
    public Object[][] provderDataTest(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"zhangshan", 10},
                    {"lise", 50}
            };
            return result;
        } else {
            result = new Object[][]{
                    {"wangwu", 25},
                    {"zhangliu", 35}
            };
            return result;
        }
    }
}
