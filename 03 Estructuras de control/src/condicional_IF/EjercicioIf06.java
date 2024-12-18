package condicional_IF;

import java.util.Scanner;

public class EjercicioIf06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Dime el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Dime el tercer numero");
        int num3 = sc.nextInt();
        /*
        hay 6 posibilidades
        a < b < c
        a < c < b

        b < a < c
        b < c < a

        c < a < b
        c < b < a
        */
        //no se puede utilizar switch porque no es una variable, sino una expresion (tiene operadores)
        if (num1 <= num2 && num2 <= num3) {// a < b < c
            System.out.println(num1 + "" + num2 + num3);
        } else if (num1 <= num3 && num3 >= num2) {// a < c < b
            System.out.println();
        }


    }
}
