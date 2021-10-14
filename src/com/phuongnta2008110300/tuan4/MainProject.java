package com.phuongnta2008110300.tuan4;

public class MainProject {
    public static void main(String[] args) {
        Account account;
        Customer customer;
        Employee employee;

        account = new Account(1234, 1000000);
        account.showData();
        customer = new Customer();
        customer.getName();
        customer.getAddress();
        customer.ShowCustomer();
        employee = new Employee();
        employee.getName();
        employee.getSalary();
        employee.ShowEmployee();
    }
}
