package com.testng;

import org.testng.annotations.Test;

public class TestNGGroup {
  @Test(groups = {"red"})
  public void red1() {
	  System.out.println("this is red group");
  }
  
  @Test(groups = {"red"})
  public void red2() {
	  System.out.println("this is red group");
  }
  
  @Test(groups = {"red"})
  public void red3() {
	  System.out.println("this is red group");
  }
  
  @Test(groups = {"green"})
  public void green1() {
	  System.out.println("this is green group");
  }
  
  @Test(groups = {"green"})
  public void green2() {
	  System.out.println("this is green group");
  }
  
  @Test(groups = {"green"})
  public void green3() {
	  System.out.println("this is green group");
  }
  
  
  @Test(groups = {"green","red"})
  public void greenandred() {
	  System.out.println("this is green and red group");
  }
}
