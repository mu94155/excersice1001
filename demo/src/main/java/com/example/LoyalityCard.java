package com.example;

import java.time.LocalDate;
import java.util.Objects;

public class LoyalityCard {
  public enum CardCategory{STATNDARD,SILVER,GOLD};
  
  private String cardNumber="";
  String cutomer = new Customer().getName();
  private LocalDate issuDate=LocalDate.now();
  private LocalDate expiryDate=LocalDate.now().plusYears(1);
  private CardCategory cardCategory=CardCategory.STATNDARD;

  public LoyalityCard() {
  }

  public LoyalityCard(String cardNumber, String cutomer, LocalDate issuDate, LocalDate expiryDate, CardCategory cardCategory) {
    this.cardNumber = cardNumber;
    this.cutomer = cutomer;
    this.issuDate = issuDate;
    this.expiryDate = expiryDate;
    this.cardCategory = cardCategory;
  }

  public String getCardNumber() {
    return this.cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public String getCutomer() {
    return this.cutomer;
  }

  public void setCutomer(String cutomer) {
    this.cutomer = cutomer;
  }

  public LocalDate getIssuDate() {
    return this.issuDate;
  }

  public void setIssuDate(LocalDate issuDate) {
    this.issuDate = issuDate;
  }

  public LocalDate getExpiryDate() {
    return this.expiryDate;
  }

  public void setExpiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
  }

  public CardCategory getCardCategory() {
    return this.cardCategory;
  }

  public void setCardCategory(CardCategory cardCategory) {
    this.cardCategory = cardCategory;
  }

  public LoyalityCard cardNumber(String cardNumber) {
    setCardNumber(cardNumber);
    return this;
  }

  public LoyalityCard cutomer(String cutomer) {
    setCutomer(cutomer);
    return this;
  }

  public LoyalityCard issuDate(LocalDate issuDate) {
    setIssuDate(issuDate);
    return this;
  }

  public LoyalityCard expiryDate(LocalDate expiryDate) {
    setExpiryDate(expiryDate);
    return this;
  }

  public LoyalityCard cardCategory(CardCategory cardCategory) {
    setCardCategory(cardCategory);
    return this;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LoyalityCard)) {
            return false;
        }
        LoyalityCard loyalityCard = (LoyalityCard) o;
        return Objects.equals(cardNumber, loyalityCard.cardNumber) && Objects.equals(cutomer, loyalityCard.cutomer) && Objects.equals(issuDate, loyalityCard.issuDate) && Objects.equals(expiryDate, loyalityCard.expiryDate) && Objects.equals(cardCategory, loyalityCard.cardCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, cutomer, issuDate, expiryDate, cardCategory);
  }

  @Override
  public String toString() {
    return "{" +
      " cardNumber='" + getCardNumber() + "'" +
      ", cutomer='" + getCutomer() + "'" +
      ", issuDate='" + getIssuDate() + "'" +
      ", expiryDate='" + getExpiryDate() + "'" +
      ", cardCategory='" + getCardCategory() + "'" +
      "}";
  }
  
}
