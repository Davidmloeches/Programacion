package condicional_IF;

import java.util.Scanner;

public class EjercicioIf02 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Dime 2 numeros: ");
        int num = sc.nextInt();
        int num2 = sc.nextInt();

        if (num>num2){
            System.out.println(num +" no es mayor que"+ num2);
        }else{
            System.out.println("el numero"+ num2+ " es el numero mayor");
        }
    }
}
