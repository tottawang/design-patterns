package com.wangto.designPatterns.serviceLocator;

public class ServiceA implements Service {

  @Override
  public String getName() {
    return "serviceA";
  }

  @Override
  public void execute() {
    System.out.println("Service A");
  }

  @Override
  public String toString() {
    return getName();
  }

}
