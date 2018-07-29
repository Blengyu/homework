package com.test;

public class LoadCar extends Car{                          //子类（仅可载货）
    LoadCar(int id,String name,int price,double load){
        super(id,name,price,0,load);                  //super关键字,写在第一句，调用Car的构造函数
    }
    public String toString() {                             //对父类String方法的重写 即多态
        return id+"/"+name+"/"+price+"元/天 /载货："+load+"吨";
    }
}
