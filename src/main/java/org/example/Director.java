package org.example;

public class Director extends Manager{

    private double budget;

    public Director(String NINumber, int salary, String deptName, double budget){
        super(NINumber, salary, deptName);
        this.budget = budget;
    }
     public double getBudget(){
        return this.budget;
     }
}
