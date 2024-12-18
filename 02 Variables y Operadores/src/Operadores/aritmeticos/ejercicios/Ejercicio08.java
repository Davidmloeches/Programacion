package Operadores.aritmeticos.ejercicios;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero con 2 unidades: ");
        int num = sc.nextInt();
        int decenas = num /10;
        int unidades = num % 10;
        int numInvertido = unidades * 10 + decenas;

        System.out.println(numInvertido);
    }
}
