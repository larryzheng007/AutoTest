package com.mt.testng.multiThread;

import org.testng.annotations.Test;

/**
 * Created by yp-tc-m-2574 on 18/5/14.
 * 多线程测试
 */
public class MultiThreadOnAnnotationTest {

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
