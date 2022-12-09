package Junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Sample {

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("teardown");
	}

	@Test
	public void test() {
		System.out.println("test");
	}
	@Test
	public void sunny() {
		System.out.println("test2");
	}

	@Test
	public void bunny() {
		System.out.println("test3");
	}
}
