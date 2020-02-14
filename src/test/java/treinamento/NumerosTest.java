package treinamento;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class NumerosTest {

	@Test
    public void test() {
        Numeros num = new Numeros();
        int resultado = num.addnumero(5, 5);
        assertEquals(10, resultado);
	}

}
