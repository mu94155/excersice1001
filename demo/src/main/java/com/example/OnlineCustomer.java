package com.example;
import java.util.Objects;

public class OnlineCustomer extends Customer{
private String mobileContact="";
public OnlineCustomer(String name,String contactEmail,String address,String mobileContact) {
super(name, contactEmail, address);
this.mobileContact=mobileContact;
}

  public OnlineCustomer() {
    super("","","");
  }

  public OnlineCustomer(String mobileContact) {
    super("","","");
    this.mobileContact = mobileContact;
  }

  public String getMobileContact() {
    return this.mobileContact;
  }

  public void setMobileContact(String mobileContact) {
    this.mobileContact = mobileContact;
  }

  public OnlineCustomer mobileContact(String mobileContact) {
    setMobileContact(mobileContact);
    return this;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof OnlineCustomer)) {
            return false;
        }
        OnlineCustomer onlineCustomer = (OnlineCustomer) o;
        return Objects.equals(mobileContact, onlineCustomer.mobileContact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(),mobileContact);
  }


  @Override
  public String toString() {
    return "{" +super.toString()+
      " mobileContact='" + getMobileContact() + "'" +
      "}";
  }


}
