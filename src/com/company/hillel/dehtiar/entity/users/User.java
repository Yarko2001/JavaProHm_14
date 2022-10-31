package com.company.hillel.dehtiar.entity.users;

import com.company.hillel.dehtiar.api.Observer;

public abstract class User implements Observer {

  private final String nickName;
  private final int age;

  public User(String name, int age) {
    this.nickName = name;
    this.age = age;
  }

  @Override
  public <T> void update(String name, T update) {
    String message = "---> " + this.nickName + " has received " + name + " post :: " + update;
    System.out.println(message);
  }

  public int getAge() {
    return age;
  }
}
