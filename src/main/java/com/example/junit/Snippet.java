package com.example.junit;

import java.util.Scanner;

public class Snippet {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        double sm=0.0;double s=0.0;
        System.out.println("请输入单项最高分和总分，已等号结束；");
        while (reader.hasNextDouble()){
            sm=reader.nextDouble();
            s=reader.nextDouble();
        }
        Chuang testObj=new Chuang(sm,s);
        String result=testObj.getGrade();
        String output="单项最高分"+sm+",总分"+s+",成绩是"+result;
        System.out.println(output);
    }
}
