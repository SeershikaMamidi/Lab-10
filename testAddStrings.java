package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions junitstring = new jUnitFunctions();
		String result = junitstring.addStrings("capstone", "project");
		assertEquals("capstoneproject", result);
		//fail("Not yet implemented");
	}

}
