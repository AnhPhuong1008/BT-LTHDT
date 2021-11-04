package com.phuongnta2008110300.lab7;

public class Dog {
    private String color;
    private int age;
    private int size;

    public Dog(){
    }
    Dog(String a,String b){
        age=a;
        color b;
    }
    void sua(){
        System.out.println("Gâu Gâu !!!");
    }
    void ngoi(){
        System.out.println("Bẹch...");
    }
    public void setSize(int s, int p){
        if(s<=0&&p<=0)
        {
            System.out.println("không hợp lệ !");
        }
        else
        {
            size = s;
            System.out.println("dung vay:!" + size);
        }
    }
    public int getSize(){
        return size;
    }
}

