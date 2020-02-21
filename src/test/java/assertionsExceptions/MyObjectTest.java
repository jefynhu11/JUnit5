package assertionsExceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MyObjectTest {

	@Test
	public void sample1() {
		MyObject myObjetc = new MyObject();
		
		assertThrows(IllegalArgumentException.class, () -> myObjetc.dangerous("bla"));
	}
	
	@Test
	public void sample2() {
		MyObject myObjetc = new MyObject();
		
		assertThrows(IllegalStateException.class, () -> myObjetc.dangerous("bla"));
	}
	
	@Test
	public void sample3() {
		MyObject myObjetc = new MyObject();
		
		assertThrows(IllegalStateException.class, myObjetc::safe);
	}
	
	@Test
	public void sample4() {
		MyObject myObjetc = new MyObject();
		
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, 
				() -> myObjetc.dangerous("bla"));
		
		assertEquals("Invalid argument: bla", exception.getMessage());
	}
}
