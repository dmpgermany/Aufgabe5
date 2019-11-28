package de.hfu;

import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTest {

	@Test
	public void testIstErstesHalbjahr() {
		assertEquals(true, Util.istErstesHalbjahr(1));
		assertEquals(true, Util.istErstesHalbjahr(6));
		assertEquals(false, Util.istErstesHalbjahr(7));
		assertEquals(false, Util.istErstesHalbjahr(12));
	}

	@Test
	public void testIllegalArgument() {
		try {
			Util.istErstesHalbjahr(0);
			fail("Erwartete Ausnahme wurde nicht geworfen");
		} catch (IllegalArgumentException e) {

		}
		
		try {
			Util.istErstesHalbjahr(13);
			fail("Erwartete Ausnahme wurde nicht geworfen");
		} catch (IllegalArgumentException e) {

		}

	}

}
