package com.devops.java.basic;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(MyHelloWorldTest.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println("Message from JUnit:" + failure.toString());
      }
		
      System.out.println("Message from JUnit:" +result.wasSuccessful());
   }
}  