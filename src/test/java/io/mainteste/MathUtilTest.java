package io.mainteste;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilTest {
	
	MathUtil mathUtil;
	TestInfo testInfo;
	TestReporter testReporter;
	
	@BeforeAll
	static void antesSetUp() {
		System.out.println("( BeforeALL )");
	}

	@BeforeEach
	void setUp(TestInfo testInfo, TestReporter testReporter) {
		System.out.println("( BeforeEACH )");
		this.testInfo = testInfo;
		this.testReporter = testReporter;
		mathUtil = new MathUtil();
		testReporter.publishEntry("Executando " + testInfo.getDisplayName() + " com tags " + testInfo.getTags());
	}

	@AfterEach
	void tearDown() {
		System.out.println("( AfterEACH )");
	}

	@AfterAll
	static void tearDownFull() {
		System.out.println("( AfterALL )");
	}

	@Test
	@DisplayName("Somar")
	void testAdd() {
		System.out.println("SOMAR");
		int expected = 2;
		int actual = mathUtil.add(1, 1);
		assertEquals(expected, actual, "erro noob");
	}

	@Nested
	@DisplayName("Add metodo")
	@Tag("Math")
	class AddTest{

		@Test
		@DisplayName("numero positivo para somar")
		void testAddPositive() {
			System.out.println("SOMAR ++");
			assertEquals(2, mathUtil.add(1,1), "erro noob");
		}
		
		@Test
		@DisplayName("Numero negativo para somar")
		void testAddNegative() {
			System.out.println("SOMAR --");
			assertEquals(-2, mathUtil.add(-1,-1),"erro noob");
		}
	}

	@Test
	@DisplayName("Multiplicar")
	@Tag("Math")
	void testMultiply() {
//		assertEquals(4, mathUtil.multiply(2, 2),"erro noob");
		System.out.println("MULTIPLICAR");
		assertAll(
				() -> assertEquals(4, mathUtil.multiply(2, 2)),
				() -> assertEquals(0, mathUtil.multiply(2, 0)),
				() -> assertEquals(-2, mathUtil.multiply(2, -1))
				);
	}
	
	@Test
	@DisplayName("Dividir")
	@Tag("Math")
	void testDivide() {
		System.out.println("DIVIDIR");
//		assumeTrue(false);
		assumeTrue(true);
		assertThrows(ArithmeticException.class, () -> mathUtil.divide(1, 0)); 
	}
	
	@Test
	@DisplayName("Math.PI")
	@Tag("Circle")
//	@RepeatedTest(2)
	void testComputeCirculeRadius() {
		System.out.println("MATH.PI");
		assertEquals(314.1592653589793, mathUtil.computeCirculeArea(10), "Resultado...");
	}
	
	@Test
	@Disabled
	@DisplayName("Teste para fail")
	void testFail() {
		System.out.println("FAIL");
		fail("verdadeiro fail");
	}
	
	@Test
	@DisplayName("CSV TESTE")
	@ParameterizedTest
	@CsvSource({"test,TEST", "tEst,TEST", "Java,JAVA"})
	void toUpperCase_ShouldGenerateTheExpectedUppercaseValue(String input, String expected) {
	    String actualValue = input.toUpperCase();
	    assertEquals(expected, actualValue);
	}
}
