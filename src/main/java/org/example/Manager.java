package org.example;

public class Manager extends Employee {

    private String deptName;

    public Manager(String NINumber, int salary, String deptName){
        super(NINumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }
}
