package Variables.EjerciciosVariables;

public class Ej9 {
    public static void main(String[] args) {
        //Ejercicio 9: Ejercicio con String Declara dos variables String, concaténalas usando el operador +, y muestra el resultado. Luego, utiliza el método .equals() para comparar si dos cadenas son iguales.

        // Declarar dos variables String
        String cadena1 = "Hola";
        String cadena2 = "Mundo";

        // Concatenar las cadenas usando el operador +
        String concatenacion = cadena1 + " " + cadena2;
        System.out.println("Resultado de la concatenación: " + concatenacion);

        // Declarar dos cadenas para comparar
        String cadena3 = "Hola Mundo";
        String cadena4 = "hola mundo";

        // Comparar si las cadenas son iguales usando .equals()
        boolean sonIguales = cadena3.equals(cadena4);
        System.out.println("¿Son iguales cadena3 y cadena4? " + sonIguales);

        // Comparar si las cadenas son iguales ignorando mayúsculas y minúsculas
        boolean sonIgualesIgnoreCase = cadena3.equalsIgnoreCase(cadena4);
        System.out.println("¿Son iguales cadena3 y cadena4 (ignorando mayúsculas/minúsculas)? " + sonIgualesIgnoreCase);

    }
}
