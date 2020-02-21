package assertionsTimeouts;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class MyObjectTest {

	@Test
	public void sample1() {
		MyObject myObject = new MyObject();
		
		assertTimeout(Duration.ofMillis(2000), myObject::slow);
	}
	@Test
	public void sample2() {
		MyObject myObject = new MyObject();
		
		String output = assertTimeout(Duration.ofMillis(2000), myObject::slow);
		
		
		assertEquals("Slow", output);
	}
	@Test
	public void sample3() {
		MyObject myObject = new MyObject();
		
		assertTimeoutPreemptively(Duration.ofMillis(2000), myObject::slow);
	}
}
