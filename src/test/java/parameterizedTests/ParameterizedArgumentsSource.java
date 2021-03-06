package parameterizedTests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

public class ParameterizedArgumentsSource {
	
	@ParameterizedTest
	@ArgumentsSource(CustomArgumentProvider.class)
	public void parameterizedTest(String argument, int count) {
		assertNotNull(argument);
		assertTrue(count > 0);
		System.out.println(argument);
	}

}
