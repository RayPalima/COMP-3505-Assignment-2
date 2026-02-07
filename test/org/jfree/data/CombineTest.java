package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CombineTest {
	private Range testRange1;
	private Range testRange2;
	private Range combinedRange;
	
	@BeforeEach
    void setUp() {
        testRange1 = new Range(-5.0, 10.0);
        testRange2 = new Range(0.0, 20.0);
        
    }
	
	@Test
	void combineRangeA_RangeB() {
		combinedRange = Range.combine(testRange1, testRange2);
		assertAll(
			    () -> assertEquals(-5.0, combinedRange.getLowerBound(), 0.0),
			    () -> assertEquals(20.0, combinedRange.getUpperBound(), 0.0)
			);
	}
	@Test
	void combine_RangeA_Null() {
		combinedRange = Range.combine(testRange1, null);
		assertAll(
			    () -> assertEquals(-5.0, combinedRange.getLowerBound(), 0.0),
			    () -> assertEquals(10.0, combinedRange.getUpperBound(), 0.0)
			);
	}
	@Test
	void combine_RangeB_Null() {
		combinedRange = Range.combine(null, testRange2);
		assertAll(
			    () -> assertEquals(0.0, combinedRange.getLowerBound(), 0.0),
			    () -> assertEquals(20.0, combinedRange.getUpperBound(), 0.0)
			);
	}
	@Test
	void combine_Null_RangeA_Null_RangeB() {
		assertNull(Range.combine(null, null));
	}

}
