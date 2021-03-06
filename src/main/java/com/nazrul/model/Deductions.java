package com.nazrul.model;
// Generated Apr 24, 2017 8:24:38 PM by Hibernate Tools 4.3.1

/**
 * Deductions generated by hbm2java
 */
public class Deductions implements java.io.Serializable {

    private Integer id;
    private String firstname;
    private String lastname;
    private double salary;
    private double deductionAmount;
    private int empId;
    private String madeBy;
    private String deductionReason;

    public Deductions() {
    }

    public Deductions(Integer id, String firstname, String lastname, double salary, double deductionAmount, int empId, String madeBy, String deductionReason) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.deductionAmount = deductionAmount;
        this.empId = empId;
        this.madeBy = madeBy;
        this.deductionReason = deductionReason;
    }

    

    public Deductions(String firstname, String lastname, double salary, double deductionAmount, int empId, String madeBy, String deductionReason) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.deductionAmount = deductionAmount;
        this.empId = empId;
        this.madeBy = madeBy;
        this.deductionReason = deductionReason;
    }

    

    

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getDeductionAmount() {
        return this.deductionAmount;
    }

    public void setDeductionAmount(double deductionAmount) {
        this.deductionAmount = deductionAmount;
    }

    public int getEmpId() {
        return this.empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getMadeBy() {
        return this.madeBy;
    }

    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }

    public String getDeductionReason() {
        return deductionReason;
    }

    public void setDeductionReason(String deductionReason) {
        this.deductionReason = deductionReason;
    }

}
