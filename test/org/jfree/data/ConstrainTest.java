package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ConstrainTest {
	private Range exampleRange;
	private static final int TIMEOUT = 5;
	
	@BeforeEach
  	void setUp() throws Exception {
		exampleRange = new Range(0, 10);
  	}
	
	@Timeout(TIMEOUT)
  	@Test
  	void constrainWithinValueRange() {
 		assertEquals(4.0, exampleRange.constrain(4),"The Target is within Range");
  	}
	@Test
  	void constrainAboveUpperBound() {
 		assertEquals(10.0, exampleRange.constrain(15),"The Target is constrained in Upper Bound");
  	}
	@Test
  	void constrainBelowLowerBound() {
 		assertEquals(0.0, exampleRange.constrain(-10),"The Target is constrained in Lower Bound");
  	}
	@Test
  	void constrainAtUpperBound() {
 		assertEquals(10.0, exampleRange.constrain(10),"The Target is on Upper Bound");
  	}
	@Test
  	void constrainAtLowerBound() {
 		assertEquals(0.0, exampleRange.constrain(0),"The Target is  on Lower Bound");
  	}
	@ParameterizedTest
	@ValueSource(ints = {0,1,2,3,4,5,6,7,8,9})
	void constrainTest0to9(int value) {
	    Range range = new Range(0, 10);
	    assertEquals(value, range.constrain(value), 0.0);
	}
}
