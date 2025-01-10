package EstructurasDeControl.If;

import java.util.Scanner;

public class Ej2 {
    /*
     * Escribe un programa que pida dos números e indique si el primero es mayor que el segundo o no
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime 2 numeros para saber cual es mayor:");
        System.out.println("Dime el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Dime el segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else {
            System.out.println(num1 + " es menor que " + num2);
        }


    }
}
