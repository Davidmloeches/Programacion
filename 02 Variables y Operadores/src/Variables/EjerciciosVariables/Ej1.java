package Variables.EjerciciosVariables;

public class Ej1 {
    public static void main(String[] args) {
        //Ejercicio 1: Declaración y uso de variables primitivas Declara una variable para cada tipo de dato primitivo (byte, short, int, long, float, double, boolean, char) y asígnales valores. Luego imprime todos los valores usando System.out.println.

        // Declaración y asignación de variables
        byte miByte = 100;          // Tipo byte, valor entre -128 y 127
        short miShort = 32000;      // Tipo short, valor entre -32,768 y 32,767
        int miInt = 100000;         // Tipo int, valor entre -2^31 y 2^31-1
        long miLong = 10000000000L; // Tipo long, valor muy grande, se usa 'L' al final
        float miFloat = 3.14f;      // Tipo float, se usa 'f' al final para especificar el tipo
        double miDouble = 3.14159;  // Tipo double, valor con mayor precisión que float
        boolean miBoolean = true;   // Tipo boolean, puede ser 'true' o 'false'
        char miChar = 'A';          // Tipo char, se utiliza un solo carácter entre comillas simples


        // Imprimir valores
        System.out.println("Valor de byte: " + miByte);
        System.out.println("Valor de short: " + miShort);
        System.out.println("Valor de int: " + miInt);
        System.out.println("Valor de long: " + miLong);
        System.out.println("Valor de float: " + miFloat);
        System.out.println("Valor de double: " + miDouble);
        System.out.println("Valor de boolean: " + miBoolean);
        System.out.println("Valor de char: " + miChar);

    }
}
