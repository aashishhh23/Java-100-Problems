//Define a class Employee with private attributes (like name, age, salary),
// public methods to get and set these attributes, and a package-private ,method to displayEmployeeDetails.
// Create another class in the same package to test access to the displayEmployeeDetails method.

package com.aashish.challenge79;

public class Employee {

    private String name;

    private int age;

    private double salary;


 Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    String getEmployeeDetails(){
     return "EmployeeDetails: Name: " + name
             +", Age:" + age
             +" , Salary: " + salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
