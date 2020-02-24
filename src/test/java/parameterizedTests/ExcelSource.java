package parameterizedTests;

import org.junit.jupiter.params.provider.ArgumentsSource;

@ArgumentsSource(ExcelArgumentProvider.class)
@interface ExcelSource {

	String file();
}
