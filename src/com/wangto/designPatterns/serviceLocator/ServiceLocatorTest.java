package com.wangto.designPatterns.serviceLocator;

public class ServiceLocatorTest {

  public static void main(String[] args) {

    ServiceLocator serviceLocater = new ServiceLocator();
    Service service = serviceLocater.getService("serviceA");
    System.out.println(service);

    serviceLocater.getService("serviceA");
    System.out.println(service);
  }

}
