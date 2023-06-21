package org.example;

public abstract class Employee {
    private String name;
    private String NINumber;
    private int salary;

    public Employee(String name, String NINumber, int salary){
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNINumber(){
        return this.NINumber;
    }

    public int getSalary(){
        return this.salary;
    }

    public void raiseSalary(double amount){
        this.salary += amount;
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
