package parameterizedTests;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class ParameterizedEnumSource {

	@ParameterizedTest
	@EnumSource(TimeUnit.class)
	public void parameterizedTest (TimeUnit timeUnit) {
		assertNotNull(timeUnit);
		System.out.println(timeUnit);
	}
}
