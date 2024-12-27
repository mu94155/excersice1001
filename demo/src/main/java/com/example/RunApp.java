package com.example;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class RunApp {
ArrayList<Item> sales = new ArrayList<>();
    DeliveryOrder order;
    Item item1;
    Item item2;
    SalesStaff salesStaff;

  public RunApp() {
  }

  public RunApp(ArrayList<Item> sales, DeliveryOrder order, Item item1, Item item2, SalesStaff salesStaff) {
    this.sales = sales;
    this.order = order;
    this.item1 = item1;
    this.item2 = item2;
    this.salesStaff = salesStaff;
  }


  public ArrayList<Item> getSales() {
    return this.sales;
  }

  public void setSales(ArrayList<Item> sales) {
    this.sales = sales;
  }

  public DeliveryOrder getOrder() {
    return this.order;
  }

  public void setOrder(DeliveryOrder order) {
    this.order = order;
  }

  public Item getItem1() {
    return this.item1;
  }

  public void setItem1(Item item1) {
    this.item1 = item1;
  }

  public Item getItem2() {
    return this.item2;
  }

  public void setItem2(Item item2) {
    this.item2 = item2;
  }

  public SalesStaff getSalesStaff() {
    return this.salesStaff;
  }

  public void setSalesStaff(SalesStaff salesStaff) {
    this.salesStaff = salesStaff;
  }

  @Override
  public String toString() {
    return "{" +
      " sales='" + getSales() + "'" +
      ", order='" + getOrder() + "'" +
      ", item1='" + getItem1() + "'" +
      ", item2='" + getItem2() + "'" +
      ", salesStaff='" + getSalesStaff() + "'" +
      "}";
  }


    
    public static void issueBill(ArrayList<Item> sales,DeliveryOrder order,Item item1, Item item2,SalesStaff salesStaff) {
        
        sales=DeliveryOrder.getSales();
        order=new DeliveryOrder("Istiqrar");
        item1=new Item("Milk");
        item2=new Item("Bread");
        salesStaff=new SalesStaff("Ahmed");
        sales.add(item1);
        sales.add(item2);
        order.printBill(order,LocalDateTime.now(),salesStaff);
}
}
