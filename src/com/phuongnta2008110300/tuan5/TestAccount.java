package com.phuongnta2008110300.tuan5;
import java.util.Scanner;
public class TestAccount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Account account = new Account("Nguyễn Trần Anh Phương");
        Account.Stk("43553642");
        Account.Sodu("43000000");
        Account.showData();
    }
}
