import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorTest {

    @Test
    void testTelefono() {
        assertTrue(Validador.validarTelefono("612345678"));
        assertFalse(Validador.validarTelefono("61234"));
    }

    @Test
    void testNombre() {
        assertTrue(Validador.validarNombre("Lucía"));
        assertFalse(Validador.validarNombre("Lucía2"));
    }

    @Test
    void testCP() {
        assertTrue(Validador.validarCP("28001"));
        assertFalse(Validador.validarCP("2800"));
    }

    @Test
    void testEmail() {
        assertTrue(Validador.validarEmail("persona@email.com"));
        assertFalse(Validador.validarEmail("persona@correo"));
    }

    @Test
    void testFecha() {
        assertTrue(Validador.validarFecha("23/04/2025"));
        assertFalse(Validador.validarFecha("23-04-2025"));
    }

    @Test
    void testPassword() {
        assertTrue(Validador.validarPassword("Clave123"));
        assertFalse(Validador.validarPassword("clave"));
    }
}