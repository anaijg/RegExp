import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EjerciciosRegExpTest {
    @Test
    void testTelefono() {
        assertTrue(Validador.validarTelefono("612345678"));
        assertFalse(Validador.validarTelefono("61234"));
        assertFalse(Validador.validarTelefono("6123A5678"));
        assertFalse(Validador.validarTelefono("+34 6123A5678"));
        assertFalse(Validador.validarTelefono("+34 612 345 678"));
    }

    @Test
    void testNombre() {
        assertTrue(Validador.validarNombre("Lucía"));
        assertFalse(Validador.validarNombre("Lucía2"));
        assertFalse(Validador.validarNombre(""));
        assertTrue(Validador.validarNombre("Aquilino"));
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