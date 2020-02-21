package assertionsExceptions;

public class MyObject {

	void dangerous(String arg) {
		throw new IllegalArgumentException("Invalid argument: " + arg);
	}
	
	void safe() {
		
	}
}
