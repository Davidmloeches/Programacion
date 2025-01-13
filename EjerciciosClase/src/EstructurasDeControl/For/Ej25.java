package EstructurasDeControl.For;

import java.util.Scanner;

/*
* [FOR ANIDADO]Hacer un programa que introduzca un número entero, positivo, y calcule su tabla de multiplicar, hasta llegar a él. (Nota: para que los números queden alineados en columnas puedes usar el tabulador \t). Ejemplo:
 * */
public class Ej25 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Dime un numero entero:");
        int num = sc.nextInt();
        int resultado=0;
        if (num>=0){
            for (int i = 1; i <= 10; i++) {
                resultado = num*i;
                System.out.println(resultado);
            }
        }else {
            System.out.println("Escribe un numero valido");
        }

    }
}
