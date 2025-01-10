package Operadores;

import java.util.Scanner;

public class Ej2 {
    /*
     * Escribir un programa en el cual se piden cuatro números y se calcule e imprima la suma de los dos primeros y el producto del tercero y el cuarto
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        int suma = num1 + num2;
        System.out.println("La suma de los 2 primeros es " + suma);

        int resto = num3 % num4;
        System.out.println("El producto de los 2 ultimos es " + resto);

    }
}
