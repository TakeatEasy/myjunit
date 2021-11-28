package com.xinghai.test;

import com.xinghai.annotations.MyAfter;
import com.xinghai.annotations.MyBefore;
import com.xinghai.annotations.MyTest;

public class EmployeeDAOTest {

    // 模拟Before
    @MyBefore
    public void init() {
        System.out.println("初始化...");
    }

    // 模拟After
    @MyAfter
    public void destroy() {
        System.out.println("销毁...");
    }

    // 模拟方法调用
    @MyTest
    public void testSave() {
        System.out.println("save...");
    }

    @MyTest
    public void testDelete() {
        System.out.println("delete...");
    }
}
