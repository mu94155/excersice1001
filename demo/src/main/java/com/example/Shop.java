package com.example;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class Shop extends Bill<Shop> {
public enum ShopCategory{HYPERMARKET,SUPERMARKET,MALLSUPERMARKET,OTHER}
private String shopName="";
private String address="";
private String ContactEmail="";
private ShopCategory shopCategory=ShopCategory.OTHER;
private String shopManager="";
public static ArrayList<Item> sales=new ArrayList<>();

  public Shop() {
  }
  public Shop(String shopName){
    this.shopName=shopName;
  }

  public Shop(String shopName, String Address, String ContactEmail, ShopCategory shopCategory, String shopManager) {
    this.shopName = shopName;
    this.address = Address;
    this.ContactEmail = ContactEmail;
    this.shopCategory = shopCategory;
    this.shopManager = shopManager;
  }

  public String getShopName() {
    return this.shopName;
  }

  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String Address) {
    this.address = Address;
  }

  public String getContactEmail() {
    return this.ContactEmail;
  }

  public void setContactEmail(String ContactEmail) {
    this.ContactEmail = ContactEmail;
  }

  public ShopCategory getShopCategory() {
    return this.shopCategory;
  }

  public void setShopCategory(ShopCategory shopCategory) {
    this.shopCategory = shopCategory;
  }

  public String getShopManager() {
    return this.shopManager;
  }

  public void setShopManager(String shopManager) {
    this.shopManager = shopManager;
  }

  public Shop SetName(String shopName) {
    setShopName(shopName);
    return this;
  }

  public Shop Address(String Address) {
    setAddress(Address);
    return this;
  }

  public Shop ContactEmail(String ContactEmail) {
    setContactEmail(ContactEmail);
    return this;
  }

  public Shop shopCategory(ShopCategory shopCategory) {
    setShopCategory(shopCategory);
    return this;
  }

  public Shop shopManager(String shopManager) {
    setShopManager(shopManager);
    return this;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Shop)) {
            return false;
        }
        Shop shop = (Shop) o;
        return Objects.equals(shopName, shop.shopName) && Objects.equals(address, shop.address) && Objects.equals(ContactEmail, shop.ContactEmail) && Objects.equals(shopCategory, shop.shopCategory) && Objects.equals(shopManager, shop.shopManager);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopName, address, ContactEmail, shopCategory, shopManager);
  }

  @Override
  public String toString() {
    return "{" +
      " shop name='" + getShopName() + "'" +
      ", Address='" + getAddress() + "'" +
      ", ContactEmail='" + getContactEmail() + "'" +
      ", shopCategory='" + getShopCategory() + "'" +
      ", shopManager='" + getShopManager() + "'" +
      "}";
  }

  
  public ArrayList<Item> getSales() {
    return sales;
  }

  @Override
  public void printBill(Shop shop, LocalDateTime localDateTime, SalesStaff salesStaff) {
    System.out.println("Date and time: " + localDateTime);
    System.out.println("Shop: " + shop.getShopName());
    System.out.println("Staff: " + salesStaff.getSalesStaffName());
    for (Item item : shop.getSales()) {
      System.out.println("Sales: " + item);
    }
  }
  }
