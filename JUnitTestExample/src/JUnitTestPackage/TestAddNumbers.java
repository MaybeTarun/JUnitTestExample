package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumbers {

	@Test
	public void test() {
		JUnitFunctions junit = new JUnitFunctions();
		int result = junit.AddNumbers(52, 38);
		assertEquals(90, result);
	}

}
