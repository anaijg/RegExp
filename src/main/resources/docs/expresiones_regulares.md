
# Guía completa sobre expresiones regulares y su uso en Java

## 1. Introducción a las expresiones regulares

Las **expresiones regulares** son patrones que se utilizan para encontrar, validar o reemplazar texto dentro de cadenas. No son exclusivas de Java y pueden usarse en muchos lenguajes y herramientas.

### Tabla de símbolos comunes:

| Símbolo | Significado                                            |
|---------|---------------------------------------------------------|
| `.`     | Cualquier carácter excepto salto de línea              |
| `\d`    | Un dígito (equivalente a `[0-9]`)                      |
| `\w`    | Carácter de palabra (letra, dígito o guion bajo)       |
| `\s`    | Espacio en blanco (espacio, tab, salto de línea)        |
| `*`     | Cero o más repeticiones del patrón anterior            |
| `+`     | Una o más repeticiones del patrón anterior              |
| `?`     | Cero o una repetición del patrón anterior              |
| `{n}`   | Exactamente n repeticiones                             |
| `{n,m}` | Entre n y m repeticiones                               |
| `[]`    | Conjunto de caracteres                                 |
| `[^]`   | Conjunto negado                                        |
| `^`     | Inicio de la cadena                                    |
| `$`     | Fin de la cadena                                       |
| `|`     | Alternancia (OR)                                       |
| `()`    | Agrupación o captura                                   |

### Ejemplos sin Java:
- `\d{9}`: Nueve dígitos (ej. 612345678)
- `[A-Z][a-z]+`: Una palabra que empieza por mayúscula y sigue en minúscula
- `\w+@\w+\.\w{2,6}`: Email básico

---

## 2. Uso de expresiones regulares en Java

En Java, las expresiones regulares pueden usarse con:
- `String.matches(String regex)`
- Clases `Pattern` y `Matcher` del paquete `java.util.regex`

### Ejemplos:
```java
// Teléfono español de 9 cifras
String telefono = "612345678";
boolean valido = telefono.matches("\\d{9}");

// Validar nombre con letras y acentos
String nombre = "Lucía";
boolean correcto = nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+( [a-zA-ZáéíóúÁÉÍÓÚñÑ]+)?");

// Validar email
String email = "usuario@gmail.com";
boolean esEmail = email.matches("[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}");
```

---

## 3. Ejercicios prácticos

### Ejercicio 1. Validar número de teléfono
Escribe un método que reciba un `String` y valide si es un número de teléfono con exactamente nueve cifras.

### Ejercicio 2. Validar nombre
Escribe un método que reciba un `String` y verifique si contiene solo letras (incluidos acentos y ñ).

### Ejercicio 3. Validar código postal
Escribe un método que compruebe si un `String` contiene exactamente cinco cifras.

### Ejercicio 4. Validar correo electrónico
Escribe un método que determine si una cadena tiene el formato básico de un email.

### Ejercicio 5. Validar fecha formato dd/mm/aaaa
Escribe un método que reciba una fecha en forma de `String` y compruebe si está en formato `dd/mm/aaaa`.

### Ejercicio 6. Validar contraseña segura
Escribe un método que verifique si una contraseña contiene al menos una letra minúscula, una mayúscula, un número y tiene al menos 6 caracteres.

---

## 4. Clase de test con JUnit 5

```java
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
```

> Puedes adaptar esta clase incluyendo otros métodos y casos. Recuerda siempre incluir la dependencia de JUnit 5 en tu proyecto (Maven, Gradle o configuración manual en IntelliJ).
