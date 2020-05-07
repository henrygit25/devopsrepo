package com.devops.java.basic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.devops.java.basic.HelloWorld;


public class MyHelloWorldTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Set Up Before Class - @BeforeAll");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Tear Down After Class - @AfterAll");
	}

	@Before
	public void setUp() throws Exception {
	System.out.println("Set Up @BeforeEach");
	}

   @After
	public void tearDown() throws Exception {
		System.out.println("Tear Down @AfterEach");
	}
	

	@Test
	public void test_add() {
		assertEquals(11, HelloWorld.add(5,6));
	//	fail("Not yet implemented");
	}

}
