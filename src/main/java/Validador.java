

public class Validador {
    public static void main(String[] args) {
        //Ejemplos

        // Teléfono español de 9 cifras
        String telefono = "612345678";
        boolean valido = telefono.matches("\\d{9}");
        System.out.println(valido);

        // Validar nombre con letras y acentos
        String nombre = "Lucía";
        valido = nombre.matches("[A-Z][a-záéíóúüñ]+");//Según chatGPT, si hubiera segundo nombre, merjor asi ->[a-zA-ZáéíóúÁÉÍÓÚñÑ]+( [a-zA-ZáéíóúÁÉÍÓÚñÑ]+)?");
        System.out.println(valido);

        // Validar email
        String email = "usuario@gmail.com";
        valido = email.matches("\\w+@+\\w+\\.\\w{2,5}");
        //boolean esEmail = email.matches("[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}");

    }

    //tal como está la clase de test, tienen que ser metodos estaticos

    //3. Ejercicios prácticos
    //Ejercicio 1. Validar número de teléfono
    //Escribe un método que reciba un String y valide si es un número de teléfono con exactamente nueve cifras.

    public static boolean validarTelefono(String telefono){
        return telefono.matches("\\d{9}");

    }
    //
    //Ejercicio 2. Validar nombre
    //Escribe un método que reciba un String y verifique si contiene solo letras (incluidos acentos y ñ).

    public static boolean validarNombre(String nombre ){
        return nombre.matches("");
    }
    //
    //Ejercicio 3. Validar código postal
    //Escribe un método que compruebe si un String contiene exactamente cinco cifras.
    //
    //Ejercicio 4. Validar correo electrónico
    //Escribe un método que determine si una cadena tiene el formato básico de un email.
    //
    //Ejercicio 5. Validar fecha formato dd/mm/aaaa
    //Escribe un método que reciba una fecha en forma de String y compruebe si está en formato dd/mm/aaaa.
    //
    //Ejercicio 6. Validar contraseña segura
    //Escribe un método que verifique si una contraseña contiene al menos una letra minúscula, una mayúscula, un número y tiene al menos 6 caracteres.
}
