package testInterfaces;

public class TestInterfaces implements EqualsContract<String> {
	
	@Override
	public String createValue() {
		return "Hello";
	}
	
	@Override
	public String createNotEqualValue() {
		return "World";
	}

}
