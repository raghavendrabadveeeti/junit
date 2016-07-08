package com.rs;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

  // assigning the values
@Before
  public void setUp(){
    System.out.println("Setup");
    System.out.println("Setup");
    System.out.println("Setup");
    System.out.println("Setup");

  }



  @Test
  public void checkAddString() {
    String str = "Hellos";
    assertEquals("Hello", str);
  }
}