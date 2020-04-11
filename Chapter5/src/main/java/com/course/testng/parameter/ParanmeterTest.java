package com.course.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by zhifeng
 * 2020/4/11 15:51
 */
public class ParanmeterTest {
    @Test
    @Parameters({"name","age"})
    public void ParanmterTest1(String name ,int age){
        System.out.println("name="+name+" age="+age);
    }
}
