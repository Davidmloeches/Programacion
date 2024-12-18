package Operadores.aritmeticos.ejercicios;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de 2 digitos: ");
        int num = sc.nextInt();
        System.out.println();
        // se divide entre 10 para calcular las decenas
        //del ej 34 las decenas es el 3 y las unidades es el 4
        int resultado = num / 10;
        System.out.println(resultado);
        // para calcular las unidades seria con % es decir el resto de la division


    }
}
