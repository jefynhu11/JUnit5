package parameterizedTests;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedValueSource {

	@ParameterizedTest
	@ValueSource(strings = {"Hello", "World"})
	public void parameterizedTest(String argument) {
		assertNotNull(argument);
		System.out.println(argument);
	}
}
