package parameterizedTests;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.support.AnnotationConsumer;

public class ExcelArgumentProvider implements ArgumentsProvider, AnnotationConsumer<ExcelSource>{

	private String fileName;
	
	@Override
	public void accept(ExcelSource excelSource) {
		this.fileName = excelSource.file();
	}
	
	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
		return Stream.empty();
	}
	
}


