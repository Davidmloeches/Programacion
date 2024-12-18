package Variables.EjerciciosVariables;

public class Ej10 {
    public static void main(String[] args) {
        //Ejercicio 10: Operaciones con caracteres (de momento, no) Declara una variable char con el valor 'A'. Suma 1 a esta variable y muestra el resultado (debería mostrar el siguiente carácter en el código ASCII).

        char numChar = 'A';
        numChar = (char) (numChar + 1); //char es necesario para que lo transforme en ascii
        System.out.println("El siguiente carácter en ASCII después de 'A' es: " + numChar);

    }
}
