package assertionsAssertAll;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {
	
	@Test
	public void sample1() {
		Person person = new Person("Jeferson", 27);
		
		assertAll(
				() -> assertEquals("Jeferson", person.name),
				() -> assertEquals(27, person.age)); 
	}
	@Test
	public void sample2() {
		Person person = new Person("Jeferson", 27);
		
		assertAll(
				() -> assertEquals("Jeferson", person.name),
				() -> assertEquals(27, person.age)); 
	}

}
