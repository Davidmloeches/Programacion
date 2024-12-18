package bucleFor;

import java.util.Scanner;
/**
 * Hacer un programa que pida dos números a y b, enteros, por teclado (se asume que a es menor que b siempre), e imprima la suma de todos los números enteros desde a hasta b, ambos inclusive.
 * */
public class EjercicioFor20 {
    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce a: ");
        int a = sc.nextInt(); // ej 5
        System.out.print("Introduce b: ");
        int b = sc.nextInt(); // ej 13

        int suma = 0;
        for (int i = a; i <= b ; i++) { // <= b < b + 1 son lo mismo
            suma = suma + i;
        }

        // output
        System.out.println(suma);
    }

}
