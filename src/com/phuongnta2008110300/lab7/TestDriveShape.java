package com.phuongnta2008110300.lab7;

public class TestDriveShape {
    public static void main(String[] args) {
        Circle circle = new Circle("hinhtron.aif");
        Square square = new Square();
        Triangle triangle = new Triangle();
        Amoeba amoeba = new Amoeba("amoeba.hif",5,10);
        amoeba.xoay360();
        amoeba.amThanh();
    }
}
