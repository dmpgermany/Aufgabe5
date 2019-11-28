package de.hfu;
import org.junit.Test;
import static org.junit.Assert.*;
public class QueueTest {
	
	@Test
	public void testQueue(){
		Queue test = new Queue(3);
		test.enqueue(1);
		test.enqueue(2);
		test.enqueue(3);
		test.enqueue(4);
		assertEquals(1, test.dequeue());
		assertEquals(2, test.dequeue());
		assertEquals(4, test.dequeue());
		try {
			test.dequeue();
			fail("Erwartete Ausnahme wurde nicht geworfen");
		} catch (IllegalStateException e) {

		}
	}
	
	
}
