package com.example.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChuangTest {
Chuang tset;
    @Test
    void getGrade() {
     tset=new Chuang(1,2.0);
     String expeted="优秀";
     assertSame(expeted, tset.getGrade());
    }

    @Test
    void getSingle_Max() {
    }
}