package com.example;

import java.time.LocalDate;


import java.util.Objects;

public class Employee {
public enum JobDescription{BRANCH_MANAGER,SALESPERSON,SHOPKEEPER,ADMIN,SECURITY,OTHER}
public enum TypeOfContract{ONE_YEAR,PART_TIME,FULL_TIME,PERMINANET,SUBCONTRACTOR,TRAINING}
public enum Nationality{OMANI,INDIAN,ARABIC_NATION,OTHERS}
private String name="";
private String id="";
private Nationality nationality=Nationality.OMANI;
private LocalDate dateOfBirth=LocalDate.now();
private String employeeNumber="";
private String contact="";
private JobDescription position=JobDescription.OTHER;
private double salary=0.0;
private LocalDate joinedDate=LocalDate.now();
private TypeOfContract contract=TypeOfContract.PERMINANET;


  public Employee() {
  }

  public Employee(String name, String id, Nationality nationality, LocalDate dateOfBirth, String employeeNumber, String contact, JobDescription position, double salary, LocalDate joinedDate, TypeOfContract contract) {
    this.name = name;
    this.id = id;
    this.nationality = nationality;
    this.dateOfBirth = dateOfBirth;
    this.employeeNumber = employeeNumber;
    this.contact = contact;
    this.position = position;
    this.salary = salary;
    this.joinedDate = joinedDate;
    this.contract = contract;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Nationality getNationality() {
    return this.nationality;
  }

  public void setNationality(Nationality nationality) {
    this.nationality = nationality;
  }

  public LocalDate getDateOfBirth() {
    return this.dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getEmployeeNumber() {
    return this.employeeNumber;
  }

  public void setEmployeeNumber(String employeeNumber) {
    this.employeeNumber = employeeNumber;
  }

  public String getContact() {
    return this.contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public JobDescription getPosition() {
    return this.position;
  }

  public void setPosition(JobDescription position) {
    this.position = position;
  }

  public double getSalary() {
    return this.salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public LocalDate getJoinedDate() {
    return this.joinedDate;
  }

  public void setJoinedDate(LocalDate joinedDate) {
    this.joinedDate = joinedDate;
  }

  public TypeOfContract getContract() {
    return this.contract;
  }

  public void setContract(TypeOfContract contract) {
    this.contract = contract;
  }

  public Employee name(String name) {
    setName(name);
    return this;
  }

  public Employee id(String id) {
    setId(id);
    return this;
  }

  public Employee nationality(Nationality nationality) {
    setNationality(nationality);
    return this;
  }

  public Employee dateOfBirth(LocalDate dateOfBirth) {
    setDateOfBirth(dateOfBirth);
    return this;
  }

  public Employee employeeNumber(String employeeNumber) {
    setEmployeeNumber(employeeNumber);
    return this;
  }

  public Employee contact(String contact) {
    setContact(contact);
    return this;
  }

  public Employee position(JobDescription position) {
    setPosition(position);
    return this;
  }

  public Employee salary(double salary) {
    setSalary(salary);
    return this;
  }

  public Employee joinedDate(LocalDate joinedDate) {
    setJoinedDate(joinedDate);
    return this;
  }

  public Employee contract(TypeOfContract contract) {
    setContract(contract);
    return this;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(id, employee.id) && Objects.equals(nationality, employee.nationality) && Objects.equals(dateOfBirth, employee.dateOfBirth) && Objects.equals(employeeNumber, employee.employeeNumber) && Objects.equals(contact, employee.contact) && Objects.equals(position, employee.position) && salary == employee.salary && Objects.equals(joinedDate, employee.joinedDate) && Objects.equals(contract, employee.contract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, nationality, dateOfBirth, employeeNumber, contact, position, salary, joinedDate, contract);
  }

  @Override
  public String toString() {
    return "{" +
      " name='" + getName() + "'" +
      ", id='" + getId() + "'" +
      ", nationality='" + getNationality() + "'" +
      ", dateOfBirth='" + getDateOfBirth() + "'" +
      ", employeeNumber='" + getEmployeeNumber() + "'" +
      ", contact='" + getContact() + "'" +
      ", position='" + getPosition() + "'" +
      ", salary='" + getSalary() + "'" +
      ", joinedDate='" + getJoinedDate() + "'" +
      ", contract='" + getContract() + "'" +
      "}";
  }


}
