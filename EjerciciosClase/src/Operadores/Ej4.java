package Operadores;

import java.util.Scanner;

public class Ej4 {
    /*
     * Unas ardillas encuentran unas nueces y deciden dividirlas equitativamente. Escribe un programa que pregunte por el número de ardillas y nueces, y, a continuación, calcule (y muestre) cuántas nueces corresponden a cada ardilla y cuántas sobrarán tras el reparto.
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas ardillas hay?");
        int ardillas = sc.nextInt();

        System.out.println("Cuantas nueces hay?");
        int nueces = sc.nextInt();

        int div = nueces / ardillas;
        int resto = nueces % ardillas;
        System.out.println("Siendo " + ardillas + " ardillas y teniendo " + nueces + " nueces, corresponden a cada ardilla " + div + " y sobran " + resto);


    }
}
