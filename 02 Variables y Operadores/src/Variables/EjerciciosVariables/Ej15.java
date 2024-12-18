package Variables.EjerciciosVariables;

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        //Ejercicio 15: Introducción de datos desde el teclado Escribe un programa que solicite al usuario ingresar un número decimal, lo lea usando Scanner y luego imprima el valor ingresado formateado a 2 decimales.

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduce un número decimal: ");
        double decimal = sc.nextDouble();

        // Imprimir el valor ingresado formateado a 2 decimales
        System.out.printf("El número ingresado es: %.2f%n", decimal);
    }
}
