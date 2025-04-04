

public class Validador {
    public static void main(String[] args) {



    //probamos el metodo 1 de validar telefono
        String telefono = "123456789";
        System.out.println(validarTelefono(telefono));

        String nombre = "Lucía";
        System.out.println(validarNombre(nombre));
    }


    // Ejercicio 1. Validar número de teléfono
    //Escribe un método que reciba un `String` y valide si es un número de teléfono con exactamente nueve cifras.
    public static boolean validarTelefono(String telefono){
        return telefono.matches("\\d{9}");
    }

    //### Ejercicio 2. Validar nombre
    //Escribe un método que reciba un `String` y verifique si contiene solo letras (incluidos acentos y ñ).
    public static boolean validarNombre(String nombre) {
        return nombre.matches("[a-zA-ZáéíóúñÑ]+");
    }
    //### Ejercicio 3. Validar código postal
    //Escribe un método que compruebe si un `String` contiene exactamente cinco cifras.

    public static boolean validarCP(String codigoPostal) {
        return codigoPostal.matches("\\d{5}");
    }
    //### Ejercicio 4. Validar correo electrónico
    //Escribe un método que determine si una cadena tiene el formato básico de un email.
        public static boolean validarEmail(String email) {
        return email.matches("\\w+@\\w+\\.\\w{2,5}");
        }

    //### Ejercicio 5. Validar fecha formato dd/mm/aaaa
    //Escribe un método que reciba una fecha en forma de `String` y compruebe si está en formato `dd/mm/aaaa`.
    public static boolean validarFecha(String fecha) {
        return fecha.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    //### Ejercicio 6. Validar contraseña segura
    //Escribe un método que verifique si una contraseña contiene al menos una letra minúscula, una mayúscula, un número y tiene al menos 6 caracteres.
public static boolean validarPassword(String password) {
        return password.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.{6,})");
        // en javasript seria asi /^(?=.*[0-9])(?=.*[!@#$%^&*])(?=.{6,})/
}
}
