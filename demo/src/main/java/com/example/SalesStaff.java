package com.example;

import java.time.LocalDate;
import java.util.Objects;

public class SalesStaff extends Employee {
    public enum WorkingShift {
        DAY, NIGHT, INCLUDING_PUBLIC_HOLIDAYS_DAY, INCLUDING_PUBLIC_HOLIDAYS_NIGHT, OTHERS
    }
    private String salesStaffName="";

  public String getSalesStaffName() {
    return this.salesStaffName;
  }

  public void setSalesStaffName(String salesStaffName) {
    this.salesStaffName = salesStaffName;
  }

    private WorkingShift workingShift = WorkingShift.DAY;

    public SalesStaff(String name, String id, Nationality nationality, LocalDate dateOfBirth, String employeeNumber,
                      String contact, JobDescription position, double salary, LocalDate joinedDate, TypeOfContract contract,
                      WorkingShift workingShift) {
        super(name, id, nationality, dateOfBirth, employeeNumber, contact, position, salary, joinedDate, contract);
        this.workingShift = workingShift;
    }

    public SalesStaff() {
    }

    public SalesStaff(WorkingShift workingShift) {
        this.workingShift = workingShift;
    }

    public SalesStaff(String salesStaffName) {
      this.salesStaffName=salesStaffName;
    }

    public WorkingShift getWorkingShift() {
        return this.workingShift;
    }

    public void setWorkingShift(WorkingShift workingShift) {
        this.workingShift = workingShift;
    }

    public SalesStaff workingShift(WorkingShift workingShift) {
        setWorkingShift(workingShift);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SalesStaff)) {
            return false;
        }
        SalesStaff salesStaff = (SalesStaff) o;
        return Objects.equals(workingShift, salesStaff.workingShift);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), workingShift);
    }

    @Override
    public String toString() {
        return "{" + super.toString() +
                " workingShift='" + getWorkingShift() + "'" +
                "}";
    }
}
