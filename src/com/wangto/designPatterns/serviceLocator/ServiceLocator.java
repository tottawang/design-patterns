package com.wangto.designPatterns.serviceLocator;

public class ServiceLocator {

  private static final Cache cache = Cache.getInstance();
  private static final InitialContext initialContext = new InitialContext();

  public Service getService(String jndiName) {
    Service service = cache.getService(jndiName);
    if (service == null) {
      service = initialContext.lookup(jndiName);
      cache.addService(service);
    }
    return service;
  }

}
