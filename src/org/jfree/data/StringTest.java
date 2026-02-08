package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringTest {

	@ParameterizedTest
	@CsvSource({
	  "0, 10",
	  "1, 10",
	  "2, 10",
	  "3, 10",
	  "4, 10",
	  "5, 10",
	  "6, 10",
	  "7, 10",
	  "8, 10",
	  "9, 10"
	})
	void toString_Format(int lower, int upper) {
	  Range exampleRange = new Range(lower, upper);
	  assertEquals("Range[" + lower + "," + upper + "]", exampleRange.toString());
	}


}
