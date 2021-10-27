package com.phuongnta2008110300.lab5;
import java.util.Scanner;
public class TestAccount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Account account = new Account("Nguyễn Trần Anh Phương");
        account.Stk("43553642");
        account.Sodu("43000000");
        account.showData();
    }
}
