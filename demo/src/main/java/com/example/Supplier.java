package com.example;
import java.util.Objects;

public class Supplier {
  public enum ProductCategory{FOOD,VEGETABES,FRUITS,OTHER};
  private String name="";
  private String Address="";
  private ProductCategory productCategory;

  public Supplier() {
  }

  public Supplier(String name, String Address, ProductCategory productCategory) {
    this.name = name;
    this.Address = Address;
    this.productCategory = productCategory;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return this.Address;
  }

  public void setAddress(String Address) {
    this.Address = Address;
  }

  public ProductCategory getProductCategory() {
    return this.productCategory;
  }

  public void setProductCategory(ProductCategory productCategory) {
    this.productCategory = productCategory;
  }

  public Supplier name(String name) {
    setName(name);
    return this;
  }

  public Supplier Address(String Address) {
    setAddress(Address);
    return this;
  }

  public Supplier productCategory(ProductCategory productCategory) {
    setProductCategory(productCategory);
    return this;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Supplier)) {
            return false;
        }
        Supplier supplier = (Supplier) o;
        return Objects.equals(name, supplier.name) && Objects.equals(Address, supplier.Address) && Objects.equals(productCategory, supplier.productCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, Address, productCategory);
  }

  @Override
  public String toString() {
    return "{" +
      " name='" + getName() + "'" +
      ", Address='" + getAddress() + "'" +
      ", productCategory='" + getProductCategory() + "'" +
      "}";
  }

}
