package Operadores.aritmeticos.ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia: ");

        double radio = sc.nextDouble();
        double logitud= 2*Math.PI*radio;
        System.out.println("La circunferencia es: "+logitud);
        //para sacar 2 decimales
        System.out.printf("longitud =%.2f", logitud);
    }
}
