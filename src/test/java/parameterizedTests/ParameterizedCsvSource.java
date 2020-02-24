package parameterizedTests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedCsvSource {
	
	@ParameterizedTest
	@CsvSource({"Hello, 1", "World, 2"})
	public void ParameterizedTest(String argument, int count) {
		assertNotNull(argument);
		assertTrue(count > 0);
		
		System.out.println(argument);
	}

}
