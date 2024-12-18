package Operadores.aritmeticos.ejercicios;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de minutos: ");
        int minutos = sc.nextInt();
        int horas = minutos / 60;
        int resto = minutos % 60;
        System.out.println(minutos + "minutos son " + horas + " horas y " + resto + " minutos");

    }
}
