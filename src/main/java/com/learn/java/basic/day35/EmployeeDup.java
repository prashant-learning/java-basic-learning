package com.learn.java.basic.day35;

public class EmployeeDup {

    private int empId;
    private String empName;
    private int empManagerId;
    private double empSalary;
    private int empAge;
    private boolean isManager;

    public EmployeeDup() {
    }

    public EmployeeDup(int empId, String empName, int empManagerId, double empSalary, int empAge, boolean isManager) {
        this.empId = empId;
        this.empName = empName;
        this.empManagerId = empManagerId;
        this.empSalary = empSalary;
        this.empAge = empAge;
        this.isManager = isManager;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpManagerId() {
        return empManagerId;
    }

    public void setEmpManagerId(int empManagerId) {
        this.empManagerId = empManagerId;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }
}
