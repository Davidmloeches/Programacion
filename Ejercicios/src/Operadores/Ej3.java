package Operadores;

import java.util.Scanner;

public class Ej3 {
    /*
     * Escribe un programa que lea un valor entero n de la entrada estándar y muestre el resultado de la siguiente expresión aritmética:
     * ((n + 1) * n + 2) * n + 3
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero para n en esta operacion: ((n + 1) * n + 2) * n + 3:");
        int n = sc.nextInt();

        int operacion = ((n + 1) * n + 2) * n + 3;
        System.out.println("El resultado de la operacion es: " + operacion);

    }
}
