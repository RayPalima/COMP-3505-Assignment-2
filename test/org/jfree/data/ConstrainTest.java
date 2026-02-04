package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstrainTest {
	private Range exampleRange;
	private int exampleTarget;
	
	@BeforeEach
  	void setUp() throws Exception {
		exampleRange = new Range(1, 1);
		exampleTarget = 4;
  	}

  	@Test
  	void test() {
 		assertEquals(0, exampleRange.constrain(4),0.1d,"The central value of (-1,1) is 0");
  	}

}
