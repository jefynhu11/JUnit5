package parameterizedTests;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class CustomArgumentProvider implements ArgumentsProvider{
	@Override
	public Stream< ? extends Arguments>
	provideArguments(ExtensionContext context) throws Exception {
		return Stream.of(Arguments.of("Hello1", 1), Arguments.of("World1", 1));
	}

}
