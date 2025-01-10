package Operadores;

import java.util.Scanner;

public class Ej5 {
    /*
     * Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas y 40 minutos.
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime una cantidad en minutos:");
        int minutos = sc.nextInt();

        int horas = minutos / 60;
        int min = minutos % 60;

        System.out.println(minutos + " minutos son " + horas + " horas y " + min + " minutos");
    }
}
