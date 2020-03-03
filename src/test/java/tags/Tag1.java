package tags;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Tag1 {
	
	@Test
	@Tag("slow")
	@Tag("whatever")
	public void sample() {
		assertNotNull("...");
	}
	@Tag("tricolor")
	public void gremiosample() {
		assertNotNull("...");
	}
	@Tag("tricolor")
	public void saoPaulosample() {
		assertNotNull("...");
	}
	@Tag("tricolor")
	public void flusample() {
		assertNotNull("...");
	}
	@Tag("grupo")
	public void PRsample() {
		assertNotNull("...");
	}
	@Tag("grupo")
	public void SCsample() {
		assertNotNull("...");
	}

	
}
