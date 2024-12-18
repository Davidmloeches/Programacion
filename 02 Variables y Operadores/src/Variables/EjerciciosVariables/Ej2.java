package Variables.EjerciciosVariables;

public class Ej2 {
    public static void main(String[] args) {
        /**Ejercicio 2: Conversión de tipos de datos (de momento, no) Declara una variable int y conviértela en double. Luego, declara una variable double y conviértela en int. Imprime los resultados antes y después de la conversión.
        */
        int miInt=42;
        // Conversión de int a double
        double miDoubleDesdeInt = miInt;
        System.out.println(miDoubleDesdeInt);

        // Imprimir los valores antes y después de la conversión
        System.out.println("Valor original de int: " + miInt);
        System.out.println("Valor convertido de int a double: " + miDoubleDesdeInt);

        // Declaración y asignación de una variable double
        double miDouble = 42.78;
        // Conversión de double a int
        int miIntDesdeDouble = (int) miDouble; // Se hace un cast explícito

        // Imprimir los valores antes y después de la conversión
        System.out.println("Valor original de double: " + miDouble);
        System.out.println("Valor convertido de double a int: " + miIntDesdeDouble);

    }
}
