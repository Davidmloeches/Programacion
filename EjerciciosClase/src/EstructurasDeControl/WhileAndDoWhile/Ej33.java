package EstructurasDeControl.WhileAndDoWhile;

import java.util.Scanner;

/*
* Escribe un programa que cuente la cantidad de números que vamos introduciendo por teclado. Cuando el programa lee 0, debe terminar y mostrar la longitud de la secuencia (sin contar el 0 final).
* */
public class Ej33 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num;
        int numNums = 0;
        do {
            System.out.println("Introduce numeros para contarlos: ");
            num= sc.nextInt();
            numNums++;

        }while (num !=0);


    }
}
