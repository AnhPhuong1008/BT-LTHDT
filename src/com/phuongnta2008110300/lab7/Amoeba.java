package com.phuongnta2008110300.lab7;

public class Amoeba {
    String amThanh;
    int x;
    int y;

    Amoeba(){

    }

    public Amoeba(String s)
    {
        amThanh = s;
    }
    public Amoeba(String s, int xx,int yy)
    {
        amThanh = s;
        x= xx;
        y= yy;
    }
    void xoay360(){
        System.out.println("Xoay theo tọa độ x = " + x + " và y = "+ y);
    }
    void amThanh(){
        System.out.println("Phát ra file có âm thanh tên "+ amThanh);
    }
}
