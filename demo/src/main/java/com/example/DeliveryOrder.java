package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class DeliveryOrder extends Bill<DeliveryOrder> {
  private String orderNumber;
  private String customerContact = "";
  private String Address = "";
  private LocalDate date = LocalDate.now();
  private ArrayList<Item> shoppingBasket;
  private DeliveryFocalPoint deliveryFocalPoint;
  private String callCenterCode="";
  private static ArrayList<Item> sales = new ArrayList<>();
  
    public static ArrayList<Item> getSales() {
      return sales;
  }

  public void setSales(ArrayList<Item> sales) {
    DeliveryOrder.sales = sales;
  }

  public String getCallcenterCode() {
    return this.callCenterCode;
  }

  public void setCallcenterCode(String callcenterCode) {
    this.callCenterCode = callcenterCode;
  }

  public DeliveryOrder getDeliveryOrder() {
    return this.deliveryOrder;
  }

  public void setDeliveryOrder(DeliveryOrder deliveryOrder) {
    this.deliveryOrder = deliveryOrder;
  }

  private DeliveryOrder deliveryOrder;

  public DeliveryOrder(String customerContact, String Address, LocalDate date, ArrayList<Item> shoppingBasket,
      DeliveryFocalPoint deliveryFocalPoint, String orderNumber) {
    this.customerContact = customerContact;
    this.Address = Address;
    this.date = date;
    this.shoppingBasket = shoppingBasket;
    this.deliveryFocalPoint = deliveryFocalPoint;
    this.orderNumber = orderNumber;
  }

  public DeliveryOrder getShop() {
    return this.deliveryOrder;
  }

  public DeliveryOrder() {
  }

  public DeliveryOrder(String callCenterCode) {
    this.callCenterCode = callCenterCode;
  }

  public String getOrderNumber() {
    return this.orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public DeliveryOrder orderNumber(String orderNumber) {
    setOrderNumber(orderNumber);
    return this;
  }

  public String getCustomerContact() {
    return this.customerContact;
  }

  public void setCustomerContact(String customerContact) {
    this.customerContact = customerContact;
  }

  public String getAddress() {
    return this.Address;
  }

  public void setAddress(String Address) {
    this.Address = Address;
  }

  public LocalDate getDate() {
    return this.date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public ArrayList<Item> getShoppingBasket() {
    return this.shoppingBasket;
  }

  public void setShoppingBasket(ArrayList<Item> shoppingBasket) {
    this.shoppingBasket = shoppingBasket;
  }

  public DeliveryFocalPoint getDeliveryFocalPoint() {
    return this.deliveryFocalPoint;
  }

  public void setDeliveryFocalPoint(DeliveryFocalPoint deliveryFocalPoint) {
    this.deliveryFocalPoint = deliveryFocalPoint;
  }

  public DeliveryOrder customerContact(String customerContact) {
    setCustomerContact(customerContact);
    return this;
  }

  public DeliveryOrder Address(String Address) {
    setAddress(Address);
    return this;
  }

  public DeliveryOrder date(LocalDate date) {
    setDate(date);
    return this;
  }

  public DeliveryOrder shoppingBasket(ArrayList<Item> shoppingBasket) {
    setShoppingBasket(shoppingBasket);
    return this;
  }

  public DeliveryOrder deliveryFocalPoint(DeliveryFocalPoint deliveryFocalPoint) {
    setDeliveryFocalPoint(deliveryFocalPoint);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof DeliveryOrder)) {
      return false;
    }
    DeliveryOrder deliveryOrder = (DeliveryOrder) o;
    return Objects.equals(customerContact, deliveryOrder.customerContact)
        && Objects.equals(Address, deliveryOrder.Address) && Objects.equals(date, deliveryOrder.date)
        && Objects.equals(shoppingBasket, deliveryOrder.shoppingBasket)
        && Objects.equals(deliveryFocalPoint, deliveryOrder.deliveryFocalPoint)
        && Objects.equals(orderNumber, deliveryOrder.orderNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContact, Address, date, shoppingBasket, deliveryFocalPoint, orderNumber);
  }

  @Override
  public String toString() {
    return "{" +
        " orderNumber='" + getOrderNumber() + "'" +
        ", deliveryFocalPoint='" + getDeliveryFocalPoint() + "'" +
        ", customerContact='" + getCustomerContact() + "'" +
        ", Address='" + getAddress() + "'" +
        ", date='" + getDate() + "'" +
        ", shoppingBasket='" + getShoppingBasket() + "'" +
        "}";
  }

  public void printShoppingBaseket(){
    for (Item item : sales) {
      System.out.println("Sales: " + "\n" + item.getItemName() + "\n" +
          "quantity: " + item.getQuantity() + "\n" +
          "price: " + item.getPrice() +
          "total price: " + (item.getQuantity() * item.getPrice()));
    }
  }

  @Override
  public void printBill(DeliveryOrder deliveryOrder, LocalDateTime localDateTime, SalesStaff salesStaff) {
    System.out.println("Date and time: " + localDateTime);
    System.out.println("Call center: " + deliveryOrder.callCenterCode);
    System.out.println("Staff: " + salesStaff.getName());
    printShoppingBaseket();
  }

}
