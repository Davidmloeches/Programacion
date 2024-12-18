package Operadores.aritmeticos.ejercicios;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 4 numeros numero: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();

        double suma = num1 + num2 + num3 + num4;
        System.out.println("La suma es: " + suma + " y la media es: " + suma/4);


    }
}
