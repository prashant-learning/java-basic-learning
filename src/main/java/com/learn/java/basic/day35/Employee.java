package com.learn.java.basic.day35;



import java.util.List;

public class Employee {

    private int empId;
    private String empName;
    private int empManagerId;
    private double empSalary;
    private int empAge;
    private boolean isManager;

    private List<Address> addressList;


    public Employee(int empId, String empName, int empManagerId, double empSalary, int empAge, boolean isManager, List<Address> addressList) {
        this.empId = empId;
        this.empName = empName;
        this.empManagerId = empManagerId;
        this.empSalary = empSalary;
        this.empAge = empAge;
        this.isManager = isManager;
        this.addressList = addressList;
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

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
}
