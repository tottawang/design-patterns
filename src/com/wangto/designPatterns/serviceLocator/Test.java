package com.wangto.designPatterns.serviceLocator;

/**
 * Reference 
 * </br>
 * https://www.tutorialspoint.com/design_pattern/service_locator_pattern.htm
 * 
 * Nice sequence diagram 
 * </br>
 * http://www.oracle.com/technetwork/java/servicelocator-137181.html
 *
 */
public class Test {

	 public static void main(String[] args) {
		 
		ServiceLocator serviceLocater = new ServiceLocator();
		Service service = serviceLocater.getService("serviceA");
		System.out.println(service);
		
		serviceLocater.getService("serviceA");
		System.out.println(service);
	 }
}
