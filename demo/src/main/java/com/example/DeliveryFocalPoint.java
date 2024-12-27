package com.example;

import java.time.LocalDate;
import java.util.Objects;

public class DeliveryFocalPoint extends Employee {
  private enum OrderCenter {
    SEEB, ALKHUWAIR, QURUM, MATRAH, WADIKABEER, SALALAH
  }

  private OrderCenter orderCenter = OrderCenter.SEEB;

  public DeliveryFocalPoint(String name, String id, Nationality nationality, LocalDate dateOfBirth,
      String employeeNumber, String contact, JobDescription position, double salary, LocalDate joinedDate,
      TypeOfContract contract, OrderCenter orderCenter) {
    super(name, id, nationality, dateOfBirth, employeeNumber, contact, position, salary, joinedDate, contract);
    this.orderCenter = orderCenter;
  }

  public DeliveryFocalPoint() {
  }

  public DeliveryFocalPoint(OrderCenter orderCenter) {
    this.orderCenter = orderCenter;
  }

  public OrderCenter getOrderCenter() {
    return this.orderCenter;
  }

  public void setOrderCenter(OrderCenter orderCenter) {
    this.orderCenter = orderCenter;
  }

  public DeliveryFocalPoint orderCenter(OrderCenter orderCenter) {
    setOrderCenter(orderCenter);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof DeliveryFocalPoint)) {
      return false;
    }
    DeliveryFocalPoint deliveryFocalPoint = (DeliveryFocalPoint) o;
    return Objects.equals(orderCenter, deliveryFocalPoint.orderCenter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), orderCenter);
  }

  @Override
  public String toString() {
    return "{" + super.toString() +
        " orderCenter='" + getOrderCenter() + "'" +
        "}";
  }

}
