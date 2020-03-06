package assertionsEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AssertionsEquals {

	@Test
	public void testString() {
		assertEquals("Google", "Google");
	}
	
	@Test
	public void testInt() {
		assertEquals(4, 4);
	}
}
