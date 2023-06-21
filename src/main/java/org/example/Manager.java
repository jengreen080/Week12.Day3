package org.example;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String NINumber, int salary, String deptName){
        super(name, NINumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }
}
