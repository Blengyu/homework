package com.test;

import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        String A="begin";
        String B="shutdown";
        C2 game=new C2();
        System.out.println("欢迎来到猜数字游戏！");
        System.out.println("如果要进行游戏请输入:begin");
        Scanner input=new Scanner(System.in);
        String a=input.nextLine();
        for(;;) {
            Scanner input1=new Scanner(System.in);

            if (a.equals(A)) {                 //是否开始游戏
                game.numberGame();
            }
            String b=input1.nextLine();
            if(b.equals(B)){                   //结束游戏
                game.disMinNumber();
                break;
            }
        }
}
}

