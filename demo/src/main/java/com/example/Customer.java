package com.example;
import java.util.Objects;

public class Customer {
  private String name="";
  private String contactEmail="";
  private String address="";

  public Customer() {
  }

  public Customer(String name, String contactEmail, String address) {
    this.name = name;
    this.contactEmail = contactEmail;
    this.address = address;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getContactEmail() {
    return this.contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Customer name(String name) {
    setName(name);
    return this;
  }

  public Customer contactEmail(String contactEmail) {
    setContactEmail(contactEmail);
    return this;
  }

  public Customer address(String address) {
    setAddress(address);
    return this;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Customer)) {
            return false;
        }
        Customer cutomer = (Customer) o;
        return Objects.equals(name, cutomer.name) && Objects.equals(contactEmail, cutomer.contactEmail) && Objects.equals(address, cutomer.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, contactEmail, address);
  }

  @Override
  public String toString() {
    return "{" +
      " name='" + getName() + "'" +
      ", contactEmail='" + getContactEmail() + "'" +
      ", address='" + getAddress() + "'" +
      ",";
  }
  
  




}
