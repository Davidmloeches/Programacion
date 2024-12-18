package Operadores.aritmeticos.ejercicios;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de segundos: ");
        int segundos = sc.nextInt();
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosR = segundos % 60;

        System.out.println(segundos + " segundos son " + horas + " horas, "+ minutos + " minutos y " + segundosR + " segundos");

    }
}
