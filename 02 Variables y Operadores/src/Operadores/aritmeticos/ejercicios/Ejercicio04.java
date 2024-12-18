package Operadores.aritmeticos.ejercicios;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el numero de ardillas: ");
        int ardillas = sc.nextInt();
        System.out.println("Dime el numero de nueces: ");
        int nueces = sc.nextInt();

        int division = nueces / ardillas;
        int resto = nueces % ardillas;

        System.out.println("Corresponde a cada una: " + division);
        System.out.println("Sobran: " + resto);

    }
}
