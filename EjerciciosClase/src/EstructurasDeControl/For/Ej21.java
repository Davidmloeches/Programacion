package EstructurasDeControl.For;

import java.util.Scanner;

/*Hacer el ejercicio anterior, pero sin asumir que el primer número es menor que el segundo. Es decir, pedir dos números enteros por teclado e imprimir la suma de todos los números enteros desde el menor hasta el mayor, ambos inclusive.*/
public class Ej21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime 2 numeros");
        System.out.print("Dime el primero:");
        int a = sc.nextInt();
        System.out.print("Dime el segundo:");
        int b = sc.nextInt();

        int menor = Math.min(a, b);
        int mayor = Math.max(a, b);

        int suma = 0;
        for (int i = menor; i <= mayor; i++) {
            suma += i;
        }
        System.out.println(suma);
    }

}
