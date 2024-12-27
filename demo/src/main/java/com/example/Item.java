package com.example;

import java.time.LocalDate;
import java.util.ArrayList;

import com.example.Supplier.ProductCategory;
import java.util.Objects;

public class Item {

  ArrayList<Supplier> suppliers=new ArrayList<>();
  
  private String itemName="";
  private String discription="";
  private int quantity=0;
  private double price=0.0;
  private ProductCategory productCategory=ProductCategory.OTHER;
  private LocalDate manufactureDate=LocalDate.now();
  private LocalDate expiryDate=LocalDate.now().plusYears(1);
  private String barCodeNumber="";


  public Item() {
  }

  public Item(String itemName){
    this.itemName=itemName;
  }

  public Item(ArrayList<Supplier> suppliers, String name, String discription, int quantity, double price, ProductCategory productCategory, LocalDate manufactureDate, LocalDate expiryDate, String barCodeNumber) {
    this.suppliers = suppliers;
    this.itemName = name;
    this.discription = discription;
    this.quantity = quantity;
    this.price = price;
    this.productCategory = productCategory;
    this.manufactureDate = manufactureDate;
    this.expiryDate = expiryDate;
    this.barCodeNumber = barCodeNumber;
  }

  public ArrayList<Supplier> getSuppliers() {
    return this.suppliers;
  }

  public void setSuppliers(ArrayList<Supplier> suppliers) {
    this.suppliers = suppliers;
  }

  public String getItemName() {
    return this.itemName;
  }

  public void setName(String itemName) {
    this.itemName = itemName;
  }

  public String getDiscription() {
    return this.discription;
  }

  public void setDiscription(String discription) {
    this.discription = discription;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public ProductCategory getProductCategory() {
    return this.productCategory;
  }

  public void setProductCategory(ProductCategory productCategory) {
    this.productCategory = productCategory;
  }

  public LocalDate getManufactureDate() {
    return this.manufactureDate;
  }

  public void setManufactureDate(LocalDate manufactureDate) {
    this.manufactureDate = manufactureDate;
  }

  public LocalDate getExpiryDate() {
    return this.expiryDate;
  }

  public void setExpiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
  }

  public String getBarCodeNumber() {
    return this.barCodeNumber;
  }

  public void setBarCodeNumber(String barCodeNumber) {
    this.barCodeNumber = barCodeNumber;
  }

  public Item suppliers(ArrayList<Supplier> suppliers) {
    setSuppliers(suppliers);
    return this;
  }

  public Item name(String name) {
    setName(name);
    return this;
  }

  public Item discription(String discription) {
    setDiscription(discription);
    return this;
  }

  public Item quantity(int quantity) {
    setQuantity(quantity);
    return this;
  }

  public Item price(double price) {
    setPrice(price);
    return this;
  }

  public Item productCategory(ProductCategory productCategory) {
    setProductCategory(productCategory);
    return this;
  }

  public Item manufactureDate(LocalDate manufactureDate) {
    setManufactureDate(manufactureDate);
    return this;
  }

  public Item expiryDate(LocalDate expiryDate) {
    setExpiryDate(expiryDate);
    return this;
  }

  public Item barCodeNumber(String barCodeNumber) {
    setBarCodeNumber(barCodeNumber);
    return this;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Item)) {
            return false;
        }
        Item item = (Item) o;
        return Objects.equals(suppliers, item.suppliers) && Objects.equals(itemName, item.itemName) && Objects.equals(discription, item.discription) && quantity == item.quantity && price == item.price && Objects.equals(productCategory, item.productCategory) && Objects.equals(manufactureDate, item.manufactureDate) && Objects.equals(expiryDate, item.expiryDate) && Objects.equals(barCodeNumber, item.barCodeNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suppliers, itemName, discription, quantity, price, productCategory, manufactureDate, expiryDate, barCodeNumber);
  }

  @Override
  public String toString() {
    return "{" +
      " suppliers='" + getSuppliers() + "'" +
      ", item name='" + getItemName() + "'" +
      ", discription='" + getDiscription() + "'" +
      ", quantity='" + getQuantity() + "'" +
      ", price='" + getPrice() + "'" +
      ", productCategory='" + getProductCategory() + "'" +
      ", manufactureDate='" + getManufactureDate() + "'" +
      ", expiryDate='" + getExpiryDate() + "'" +
      ", barCodeNumber='" + getBarCodeNumber() + "'" +
      "}";
  }

}
