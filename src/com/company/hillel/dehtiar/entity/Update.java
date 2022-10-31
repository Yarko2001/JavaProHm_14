package com.company.hillel.dehtiar.entity;

import java.util.ArrayList;
import java.util.List;

public class Update <T>{
  private final T data;

  public Update(T data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return data.toString();
  }

  public T getData() {
    return data;
  }
}
