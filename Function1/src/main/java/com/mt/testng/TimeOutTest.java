package com.mt.testng;

import org.testng.annotations.Test;

/**
 * Created by yp-tc-m-2574 on 18/5/14.
 */
public class TimeOutTest {
    @Test(timeOut = 3000)//单位为毫秒值
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
