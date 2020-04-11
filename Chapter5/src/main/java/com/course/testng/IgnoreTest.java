package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by zhifeng
 * 2020/4/11 15:08
 */
public class IgnoreTest {
    @Test
    public void Ignore1(){
        System.out.println("ignore1 执行！");
    }
    @Test(enabled = false)
    public void Ignore2(){
        System.out.println("ignore2 执行！");
    }
    @Test(enabled = true)
    public void Ignore3(){
        System.out.println("ignore3 执行！");
    }

}
