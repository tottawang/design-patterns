package com.wangto.designPatterns.serviceLocator;

public class InitialContext {

  public Service lookup(String jndiName) {
    System.out.println(String.format("try to look up %s", jndiName));
    if ("serviceA".equals(jndiName)) {
      return new ServiceA();
    }
    if ("serviceB".equals(jndiName)) {
      return new ServiceB();
    }
    return null;
  }

}
