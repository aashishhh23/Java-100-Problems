package com.aashish.challenge79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Aashish", 21, 25000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Tuntun");
        System.out.println(emp.getEmployeeDetails());
    }
}
