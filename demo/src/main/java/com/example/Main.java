package com.example;


import java.util.ArrayList;

public class Main {
    
         
     
    public static void main(String[] args) {
        ArrayList<Item> sales = new ArrayList<>();
        DeliveryOrder order = new DeliveryOrder("Istiqrar"); Item item1 = new Item("Milk");
        Item item2 = new Item("Bread");
        SalesStaff salesStaff = new SalesStaff("Ahmed");
        new RunApp();
        RunApp.issueBill(sales, order, item1, item2, salesStaff);
    
}
}