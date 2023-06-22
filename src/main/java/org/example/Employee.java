package org.example;

public abstract class Employee {
    private String name;
    private String NINumber;
    private int salary;

    public Employee(String NINumber, int salary){
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName(String name){
        if (name != null) {
            return name;
        };
    }

    public String getNINumber(){
        return this.NINumber;
    }

    public int getSalary(){
        return this.salary;
    }

    public void raiseSalary(double amount){
        if (amount > 0){
            this.salary += amount;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
