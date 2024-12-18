package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class AppTest {
	private static App ap;
	@BeforeAll
	public static void setupOnce() {
		ap=new App();
	}
    @Test
    public void testSumWithPositives() {
    	int x=10;
    	int y=20;
    	int expected=30;
    	int actual=ap.sum(x, y);
    	assertEquals(expected,actual);
       
    }
    @Test
    public void testSumWithNegitives() {
    	int x=-10;
    	int y=-20;
    	int expected=-30;
    	int actual=ap.sum(x, y);
    	assertEquals(expected,actual);
       
    }
    @Test
    public void testSumWithMixed() {
    	int x=-10;
    	int y=20;
    	int expected=10;
    	int actual=ap.sum(x, y);
    	assertEquals(expected,actual);
       
    }

    @Test public void testSumWithZeroes() { 
    	int x=0; int y=0;
    	int expected=0;
    	int actual=ap.sum(x, y); 
    	assertEquals(expected,actual);
	 }
	 @Test public void testSumWithNonZeroes() { 
		 int x=0; int y=1;
		 int expected=1;
		 int actual=ap.sum(x, y);
		 assertEquals(expected,actual);
	 }
	 
    @AfterAll
    public static void clearOnce() {
    	ap=null;
    }
}
