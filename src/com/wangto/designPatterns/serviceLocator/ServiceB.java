package com.wangto.designPatterns.serviceLocator;

public class ServiceB implements Service {

  @Override
  public String getName() {
    return "serviceB";
  }

  @Override
  public void execute() {
    System.out.println("Service B");
  }

  @Override
  public String toString() {
    return getName();
  }

}
