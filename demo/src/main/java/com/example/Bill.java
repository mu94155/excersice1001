package com.example;

import java.time.LocalDateTime;

public abstract class Bill<T> {
// private String itemName;
// private int quantity;
// private double price;
public abstract void printBill(T t,LocalDateTime localDateTime,SalesStaff salesStaffName);
}


