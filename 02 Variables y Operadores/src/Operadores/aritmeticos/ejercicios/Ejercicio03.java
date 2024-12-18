package Operadores.aritmeticos.ejercicios;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = sc.nextInt();
        System.out.println(((n + 1)*n+2)*n+3);
    }
}
