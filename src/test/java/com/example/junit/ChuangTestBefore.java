package com.example.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChuangTestBefore {
Chuang test;
    @BeforeEach
    void setUp() {
     System.out.println("测试开始");

    }

    @AfterEach
    void tearDown() {
        System.out.println("测试结束");
    }

    @Test
    void setSingle_Max() {
        test=new Chuang(6.0,8.0);
        String expeted="优秀";
        assertSame(expeted, test.getGrade());
    }


    @Test
    void testSetSingle_Max() {
        test=new Chuang(2.0,4.0);
        String expeted="及格";
        assertSame(expeted, test.getGrade());
    }
    @Test
    void testSetSingle_Maxg() {
        test=new Chuang(2.0,3.0);
        String expeted="不及格";
        assertSame(expeted, test.getGrade());
    }
}