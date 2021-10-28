package com.phuongnta2008110300.lab7;

public class TestDriveShape {
    public static void main(String[] args) {
        Circle circle = new Circle("hinhtron.aif");
        circle.xoay360();
        circle.amThanh();
        Square square = new Square("hinhvuong.aif");
        square.xoay360();
        square.amThanh();
        Triangle triangle = new Triangle("hinhtamgiac.aif");
        triangle.xoay360();
        triangle.amThanh();
        Amoeba amoeba = new Amoeba("amoeba.hif",5,10);
        amoeba.xoay360();
        amoeba.amThanh();
    }
}
