package Variables.EjerciciosVariables;

public class Ej13 {
    public static void main(String[] args) {
        //Ejercicio 13: Uso de operadores lógicos (de momento, no) Declara dos variables boolean y realiza operaciones lógicas (&&, ||, !). Muestra los resultados de cada operación lógica.

        // Declarar dos variables booleanas
        boolean valor1 = true;
        boolean valor2 = false;

        // Operaciones lógicas
        boolean resultadoAND = valor1 && valor2; // Operador AND, seria true si son iguales
        boolean resultadoOR = valor1 || valor2; // Operador OR
        boolean resultadoNOT1 = !valor1;        // Operador NOT en valor1, ! convierte en el contrario
        boolean resultadoNOT2 = !valor2;        // Operador NOT en valor2

        // Mostrar los resultados
        System.out.println("Valor1: " + valor1);
        System.out.println("Valor2: " + valor2);
        System.out.println("Resultado de Valor1 && Valor2: " + resultadoAND);
        System.out.println("Resultado de Valor1 || Valor2: " + resultadoOR);
        System.out.println("Resultado de !Valor1: " + resultadoNOT1);
        System.out.println("Resultado de !Valor2: " + resultadoNOT2);


    }
}
