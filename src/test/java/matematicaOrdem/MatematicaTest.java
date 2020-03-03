package matematicaOrdem;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class MatematicaTest {
	
	MatematicaOperacao matematica = new MatematicaOperacao();
	
	@Test
	@Order(1)
	public void somar() {
		matematica.adicao(2, 2);
		System.out.println(matematica.adicao(2,2));
	}
	
	@Test
	@Order(2)
	public void desconto() {
		System.out.println(matematica.subtracao(2, 2));
	}
	
	@Test
	@Order(4)
	public void divisao() {
		System.out.println(matematica.dividir(2, 2));
	}
	
	@Test
	@Order(3)
	public void dobro() {
		System.out.println(matematica.multiplicar(2, 2));
	}

}
