package EstructurasDeControl.Switch;

import java.util.Scanner;

/*
* Escribe un programa que pida dos números enteros, y pida la operación que quiere realizar con estos (+, -, *, /). El programa debe realizar la operación pedida y visualizar el resultado. En caso de que el símbolo introducido no sea correcto, visualizar: operación incorrecta
* */
public class Ej16 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Dime 2 numeros enteros:");
        System.out.print("Primer numero:");
        int num1= sc.nextInt();
        System.out.print("Segundo numero:");
        int num2= sc.nextInt();

        System.out.println("Indica la operacion que quieres hacer: (+, -, *, /)");
        char operacion = sc.next().charAt(0);

        int resultado;

        switch (operacion){
            case '+':
                resultado= num1+num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                resultado= num1/ num2;
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("operación incorrecta");
        }
    }
}
