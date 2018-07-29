package com.test;

public class SeatCar extends Car{                        //子类（仅可载人）
    SeatCar(int id,String name,int price,int seat){
        super(id,name,price,seat,0);                //super关键字,写在第一句，调用Car的构造函数
    }
    public String toString() {                           //对父类String方法的重写 即多态
        return id+"/"+name+"/"+price+"元/天 /载人："+seat;
    }
}
