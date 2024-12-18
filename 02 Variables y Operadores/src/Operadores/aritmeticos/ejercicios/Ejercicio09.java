package Operadores.aritmeticos.ejercicios;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de 3 cifras: ");
        int num = sc.nextInt();
        int centenas = num / 100;
        int resto = num % 100;
        int decenas = resto /10;
        int unidades = resto % 10;
        System.out.println(unidades+""+decenas+""+centenas);

    }
}
