package com.rs;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

  public static void main(String[] args) {
    // write your code here
    Result result = JUnitCore.runClasses(MainTest.class);
    System.out.println("Run Count -->" + result.getRunCount());
    System.out.println("Failure Count -->" + result.getFailureCount());
    System.out.println("Ignore Count -->" + result.getIgnoreCount());

    for (Failure failure : result.getFailures()) {

      System.out.println(failure.toString());
    }

  }
}
