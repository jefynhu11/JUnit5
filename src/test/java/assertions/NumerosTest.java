package assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumerosTest {

	@Test
    public void test() {
        Numeros num = new Numeros();
        int resultado = num.addnumero(5, 5);
        assertEquals(10, resultado);
	}
	
	@Test
	public void sample1() {
		assertEquals(2,	1+1, () -> "A soma (1+1) é 2 ");
	}

	@Test
	public void sample2() {
		assertEquals(2,	1+1, "A soma (1+1) é 2 ");
	}

}
