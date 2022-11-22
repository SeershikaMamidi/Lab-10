package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
	//	fail("Not yet implemented");
		jUnitFunctions junit = new jUnitFunctions();
		int result = junit.addNumbers(100, 200);
		assertEquals(300, result);
	}

}
