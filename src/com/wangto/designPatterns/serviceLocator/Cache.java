package com.wangto.designPatterns.serviceLocator;

import java.util.ArrayList;

public class Cache {

  private ArrayList<Service> services = new ArrayList<>();

  private Cache() {

  }

  public Service getService(String jndiName) {
    for (Service service : services) {
      if (service.getName().equals(jndiName)) {
        return service;
      }
    }
    return null;
  }

  public void addService(Service service) {
    if (service.getName() == null || service.getName() == "") {
      throw new IllegalArgumentException("service name must not empty");
    }
    if (getService(service.getName()) == null) {
      services.add(service);
    }
  }

  public static Cache getInstance() {
    return new Cache();
  }

}
