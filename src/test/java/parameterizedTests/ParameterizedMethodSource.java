package parameterizedTests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ParameterizedMethodSource {

//	@ParameterizedTest
//	@MethodSource("ParameterFactory")
//	public void parameterizedTest(String argument) {
//		assertNotNull(argument);
//		System.out.println(argument);
//	}
//	
//	static Collection<String> parameterFactory(){
//		return Arrays.asList("Hello", "World");
//	}
	
	/** outro tipo **/
	@Disabled
	@ParameterizedTest
	@MethodSource("ParameterFactory")
	public void parameterizedTest1(String argument, int count) {
		assertNotNull(argument);
		assertTrue(count > 0);
		System.out.println(argument);
	}
	
	static Collection<Arguments> parameterFactory1(){
		return Arrays.asList(Arguments.of("Hello", 1), Arguments.of("World", 1));
	}
	
	@ParameterizedTest
	@MethodSource("stringProvider")
	void testWithExplicitLocalMethodSource(String argument) {
	    assertNotNull(argument);
	    System.out.println(argument);
	}

	static Stream<String> stringProvider() {
	    return Stream.of("apple", "banana");
	}
}
