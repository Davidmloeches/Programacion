package Operadores.aritmeticos.ejercicios;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int num3 = sc.nextInt();
        System.out.println("Ingrese el quarto numero: ");
        int num4 = sc.nextInt();

        System.out.println("Suma del 1º y 2º numero: " + (num1 + num2));

        System.out.println("Multiplicacion del 3º y 4º numero: " + num3 * num4);

    }
}
