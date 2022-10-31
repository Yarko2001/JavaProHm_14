package com.company.hillel.dehtiar.entity;

public abstract class Post {

  private final String name;
  private final Long size;

  public Post(String name, Long size) {
    this.name = name;
    this.size = size;
  }

  public String getName() {
    return name;
  }

  public Long getSize() {
    return size;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "{" + getName() + "}";
  }
}
