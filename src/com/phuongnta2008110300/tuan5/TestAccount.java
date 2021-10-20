package com.phuongnta2008110300.tuan5;
import java.util.Scanner;
public class TestAccount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Account account = new Account("Nguyễn Trần Anh Phương");
        Account.ImportAddress("tinh lo ");
        Account.ImportBirthday("01/03/2002");
        Account.ImportPosition("IT");
        Account.ImportSalary(2000);
        Account.showData();
    }
}
