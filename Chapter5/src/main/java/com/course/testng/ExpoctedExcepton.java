package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by zhifeng
 * 2020/4/11 15:37
 */
public class ExpoctedExcepton {
    /**
     * 什么时候用到异常测试
     * 在我们期望结果为某个异常的时候
     * 比如：我们传入了某些不合法的参数，程序异常
     * 也就是说我们预期结果就是这个异常
     */
    //这是我们测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    //这是一个成功的测试
    @Test(expectedExceptions = RuntimeException.class)
    public void renTemeExceptionSuccess(){
        System.out.println("这是我们异常测试");
        throw new RuntimeException();

    }
}
