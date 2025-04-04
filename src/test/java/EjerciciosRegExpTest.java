import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjerciciosRegExpTest {

    @Test
    void testTelefono() {
        assertTrue(Validador.validarTelefono("612345678"));
        assertFalse(Validador.validarTelefono("61234"));
    }


}