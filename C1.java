package com.test;

import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("你是否要租车？是请输入1否输入0");
        if(input.nextInt()==1){            //判定是否租车
            CarInformation car=new CarInformation();
            car.priceList();
            car.showList();
            car.rentList();
        }
}
}

