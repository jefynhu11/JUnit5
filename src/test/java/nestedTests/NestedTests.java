package nestedTests;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedTests {
	
	private Stack<String> stack;
	
	@Test
	@DisplayName("is instantiated with new Stack()")
	void isInstantiatedWithNew() {
		new Stack<>();
	}
	
	@Nested
	@DisplayName("when new")
	class WhenNew {
		@BeforeEach
		void createNewStack() {
			stack = new Stack<>();
		}
		
		@Test
		@DisplayName("is empty")
		void isEmpaty() {
			assertTrue(stack.isEmpty());
		}
		
		@Test
		@DisplayName("throws EmptyStackException when popped")
		void throwsExceptionWhenPopped() {
			assertThrows(EmptyStackException.class, () -> stack.pop());
		}
		
		@Nested
		@DisplayName("after pushing an element")
		class AfterPushing{
			String anElement = "am element";
			
			@BeforeEach
			void pushAnElement() {
				stack.push(anElement);
			}
			
			@Test
			@DisplayName("it is no longer empty")
			void isNotEmpty() {
				assertFalse(stack.isEmpty());
			}

			@Test
			@DisplayName("return the element when popped and is empty")
			void returnElementWhenPopped() {
				assertEquals(anElement, stack.pop());
				assertTrue(stack.isEmpty());
			}

			@Test
			@DisplayName("return the element when peeked but remains not empty")
			void returnElementWhenPeeked() {
				assertEquals(anElement, stack.peek());
				assertTrue(stack.isEmpty());
			}
			
			
			
			
		}
	}
	
	
	
}
