package de.hfu;
import org.junit.Test;
import static org.junit.Assert.*;
public class UnitTest {

	@Test
	public void testIstErstesHalbjahr(){
		assertEquals(true, Util.istErstesHalbjahr(1));
		assertEquals(false, Util.istErstesHalbjahr(12));
	}
	
}
