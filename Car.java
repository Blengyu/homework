package com.test;

public class Car {                                                //父类（即可载人也可载货）
    public int id;
    public String name;
    public int seat;
    public int price;
    public double load;
    Car(int id,String name,int price,int seat,double load){       //初始化各个属性
        this.id=id;
        this.name=name;
        this.price=price;
        this.seat=seat;
        this.load=load;
    }
    public String toString() {                                    //覆盖Obj.String()    (学长我不太确定这个是不是也算一种重写）
        return id+"/"+name+"/"+price+"元/天 /载人："+seat+"人 载货："+load+"吨";
    }
}
