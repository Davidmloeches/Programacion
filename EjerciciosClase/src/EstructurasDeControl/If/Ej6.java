package EstructurasDeControl.If;

import java.util.Scanner;

/*
 * Escribe un programa que pida tres números y los muestre ordenados (de menor a mayor).
 */
public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime 3 números para ordenarlos de menor a mayor:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int menor, mayor, medio;

        // Comprobar cuál es el mayor
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
            if (num2 >= num3) {
                medio = num2;
                menor = num3;
            } else {
                medio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
            if (num1 >= num3) {
                medio = num1;
                menor = num3;
            } else {
                medio = num3;
                menor = num1;
            }
        } else {
            mayor = num3;
            if (num1 >= num2) {
                medio = num1;
                menor = num2;
            } else {
                medio = num2;
                menor = num1;
            }
        }

        // Imprimir en orden correcto
        System.out.println("El orden sería: " + menor + ", " + medio + ", " + mayor);

    }
}
