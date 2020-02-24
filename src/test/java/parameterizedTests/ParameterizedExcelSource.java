package parameterizedTests;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;

public class ParameterizedExcelSource {

	@ParameterizedTest
	@ExcelSource(file = "test.xls")
	public void parameterizedTest(String argument) {
		assertNotNull(argument);
	}
}
