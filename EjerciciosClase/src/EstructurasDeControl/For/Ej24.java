package EstructurasDeControl.For;

import java.util.Scanner;

/*
 * [FOR ANIDADO] Escribe un programa que reciba dos valores enteros por teclado, a y b, y dibuje un rectángulo en que la base sea el número mayor y la altura el número menor, con un carácter también introducido por teclado.
 * */
public class Ej24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el primer valor:");
        int a = sc.nextInt();
        System.out.println("Dime el segundo valor:");
        int b = sc.nextInt();
        System.out.println("Dime que caracter quieres:");
        char caracter = sc.next().charAt(0);

        int mayor = Math.max(a,b);
        int menor = Math.min(a,b);

        for (int i = 0; i < menor; i++) {
            for (int j = 0; j < mayor; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }

    }
}
