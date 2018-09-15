package com.wangto.designPatterns.serviceLocator;

/**
 *  Service Locator is a single point of contact to get service.
 *
 */
public class ServiceLocator {

  private static final Cache cache = Cache.getInstance();
  private static final InitialContext initialContext = new InitialContext();

  public Service getService(String jndiName) {
    Service service = cache.getService(jndiName);
    if (service == null) {
    	System.out.println("Not found in cache, keep looking up..");
    	service = initialContext.lookup(jndiName);
    	cache.addService(service);
    }
    return service;
  }

}
