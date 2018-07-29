package com.test;

import java.util.Scanner;

public class CarInformation {
    private int num;
    private int id;
    private int day;
    private int[] nums=new int[8];            //用来接对象数组的下标数字
    private Scanner in=new Scanner(System.in);
    private Car[] car=new Car[8];             //注意这里是创建的对象数组
    void priceList(){
        car[0]=new SeatCar(1,"小轿车",40,4);
        car[1]=new SeatCar(2,"面包车",65,7);
        car[2]=new SeatCar(3,"大巴车",180,20);
        car[3]=new LoadCar(4,"低栏车",30,1.5);
        car[4]=new LoadCar(5,"高栏车",47,2.5);
        car[5]=new LoadCar(6,"厢式车",80,4.5);
        car[6]=new Car(7,"日式皮卡",60,5,1);
        car[7]=new Car(8,"美式皮卡",60,2,3);
    }
    void showList(){                 //展示车辆列表
        System.out.println("可租车的价格表");
        System.out.println("序号/汽车名称/租金/载量");
        for(Car b:car)               //foreach语句输出数组
            System.out.println(b);
    }
    void seatCar(){                  //计算总载人数的方法
        int seatCount=0;                     //总载人数
        System.out.println("可载人的车有:");
        for(int i=0;i<num;i++){
            if(car[nums[i]].seat==0)continue;
            System.out.println(car[nums[i]].name+"/");
            seatCount+=car[nums[i]].seat;
        }
        System.out.println("共载:"+seatCount+"人");
    }
    void loadCar(){                 //计算总载货数的方法
        double loadCount=0;
        System.out.println("可载货的车有:");
        for(int i=0;i<num;i++){
            if(car[nums[i]].load==0)continue;
            System.out.println(car[nums[i]].name+"/");
            loadCount+=car[nums[i]].load;
        }
        System.out.println("共载货:"+loadCount+"吨");
    }
    void getMoney(){                //计算总租金的方法
        int money=0;
        for(int i=0;i<num;i++){
            money+=car[nums[i]].price;
        }
        System.out.println("租车总价格:"+(money*day)+"元");
    }
    void getNum(){
        System.out.println("请输入你要租车的数量:");
        try{                       //异常处理，避免输入数字为负数
            num=in.nextInt();
            if(num<0)throw new Exception();
        }
        catch (Exception e){
            System.out.println("请输入一个非负数");
            in=new Scanner(System.in);
            getNum();
        }
    }
    void getId(int i){
        System.out.println("请输入第"+(i+1)+"辆车的序号:");
        try{                       //异常处理
            id=in.nextInt()-1;
            if(id<0||id>7)throw new Exception();
        }
        catch (Exception e){
            System.out.println("请输入1~8之间的数");
            in=new Scanner(System.in);
            getId(i);
        }
    }
    void getDay(){
        System.out.println("请输入租车天数:");
        try{                      //异常处理
            day=in.nextInt();
            if(day<1)throw new Exception();
        }
        catch (Exception e){
            System.out.println("请输入一个大于0的数");
            in=new Scanner(System.in);
            getDay();
        }
    }
    void rentList(){             //一个接口的作用（展示最后的总清单）
        getNum();
        for(int i=0;i<num;i++){
            getId(i);
            nums[i]=id;
        }
        getDay();
        System.out.println("总清单如下: ");
        seatCar();
        loadCar();
        getMoney();
    }
}
