package EstructurasDeControl.For;

import java.util.Scanner;

/*
* Hacer un programa que calcule el factorial de un número pedido por teclado. (Ejemplo: el factorial de 5 sería 5 * 4 * 3 * 2 * 1; el de 4 sería 4* 3 * 2 * 1, etc.)
* */
public class Ej27Mal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Dime un numero para calcular el factorial: ");
        int num=sc.nextInt();

        int resultado=1;
        for (int i = 0; i < num; i++) {
            resultado=num*i;
            System.out.println(resultado);
        }
        System.out.println(resultado);
    }
}
