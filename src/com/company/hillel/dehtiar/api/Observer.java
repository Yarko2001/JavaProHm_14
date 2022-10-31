package com.company.hillel.dehtiar.api;

public interface Observer {

  <T> void update(String name,T update);

}
