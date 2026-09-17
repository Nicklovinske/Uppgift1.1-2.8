package org.Uppgift2P1;

public class Employee {
    private String name;
    private int salary;
    private String department;

    public Employee(String name, int salary, String department){
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName(){
        return this.name;
    }

    public int getSalary(){
        return this.salary;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setName(String name){
        this.name = name;
    }

    public Employee(Employee copy){
        this.name = copy.name;
        this.salary = copy.salary;
        this.department = copy.department;
    }

    public String info(){
        return "Name: " + name + "Salary: " + salary + "Department: " + department;
    }
}
