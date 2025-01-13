package EstructurasDeControl.For;

import java.util.Scanner;

/*
* Hacer un programa que pida dos números a y b, enteros, por teclado (se asume que a es menor que b siempre), e imprima la suma de todos los números enteros desde a hasta b, ambos inclusive.
 * */
public class Ej20 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Dime 2 numeros, el primero tiene que ser menor:");
        System.out.print("Dime el primero:");
        int a= sc.nextInt();
        System.out.print("Dime el segundo:");
        int b= sc.nextInt();

        int suma= 0;
        for (int i =a; i <= b; i++) {
            suma+=i;
        }
        System.out.println(suma);
    }
}
