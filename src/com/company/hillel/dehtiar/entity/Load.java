package com.company.hillel.dehtiar.entity;

import java.util.ArrayList;
import java.util.List;

public class Load <T extends Post>{

  private final List<T> posts = new ArrayList<>();

  public void add(T post) {
    posts.add(post);
  }
}
