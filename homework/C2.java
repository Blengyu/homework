package com.test;

import java.util.Scanner;

public class C2 {
    public void disMinNumber(){
        //学长我实在想不到怎么实现输出最小次数。。。。。。
    }
    public void numberGame(){
    int a=(int)(Math.random()*100);//在1~100范围随机生成一个整数
    Scanner num=new Scanner(System.in);
    System.out.println("请输入一个整数（1~100）");
    System.out.println(a);
    int count=0;//设置次数变量
   while (true){                   //当输入shutdown不再进行游戏
       int b=num.nextInt();          //输入值应在循环里面
       if(b>a){
           System.out.println("你输入的数字大了" +
                   "请再次输入数字重新猜测");
           count++;
           continue;                  //结束本次循环(下同)
       }
       else if(b<a){
           System.out.println("你输入的数字小了" +
                   "请再次输入数字重新猜测");
           count++;
           continue;
       }
       else {
           System.out.println("你猜对了！");
           count++;
           System.out.println("你猜的次数为:" +count);
           System.out.println("要结束游戏请输入:shutdown;若要继续游戏请输入任意字符");
           break;                     //结束循环
       }
   }
}
}
