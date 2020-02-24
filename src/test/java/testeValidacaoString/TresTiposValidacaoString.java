package testeValidacaoString;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TresTiposValidacaoString {

	@DisplayName("Validacao de String nula")
    @Test
    public void testeStringNula() {
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> this.validarPreenchimento(null));
        Assertions.assertEquals("Erro de Preenchimento de String NULL", exception.getMessage());
        System.out.println(exception.getMessage());
    }
 
    @DisplayName("Validacao nao preenchimento de Strings")
    @ParameterizedTest(name = "Validacao da String \"{arguments}\"")
    @ValueSource(strings = {"", " ", "  ", "   ", "    " })
    public void testeStringNaoPreenchida(String string) {
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> this.validarPreenchimento(string));
        Assertions.assertEquals("Erro de Preenchimento de String", exception.getMessage());
    }
 
//    @DisplayName("Validacao preenchimento Strings")
//    @ParameterizedTest(name = "Validacao da String \"{arguments}\"")
//    @ValueSource(strings = {"   abc", "abc     ", "abc" })
//    public void testeStringPreenchida(String string) {
//        this.validarPreenchimento(string);
//        Assertions.assertTrue(true);
//    }
    
    @DisplayName("Validacao preenchimento Strings")
    @ParameterizedTest(name = "Validacao da String \"{arguments}\"")
    @ValueSource(strings = {"   abc", "abc     ", "abc" })
    public void testeStringPreenchida(String string) {
    	RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> this.validarPreenchimento(string));
    	Assertions.assertEquals("Erro de Preenchimento de String", exception.getMessage());
        System.out.println(exception.getMessage());
    }
 
    private void validarPreenchimento(String string) {
        if (string == null) {
            throw new RuntimeException("Erro de Preenchimento de String NULL");
        }
        if (string.isEmpty()) {
            throw new RuntimeException("Erro de Preenchimento de String");
        }
        if (string.trim().isEmpty()) {
            throw new RuntimeException("Erro de Preenchimento de String");
        }
    }
    
}
