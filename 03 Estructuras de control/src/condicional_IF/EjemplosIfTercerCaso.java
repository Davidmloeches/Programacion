package condicional_IF;

import java.util.Scanner;

public class EjemplosIfTercerCaso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero de dia de la semana: ");
        int num = sc.nextInt();
        if (num <= 0 || num > 7){
            System.out.println("No es un numero de la semana correcto");
        }else if (num ==1){
            System.out.println("Lunes");
        }else if (num ==2){
            System.out.println("Martes");
        }else if (num ==3){
        System.out.println("Miercoles");
        }else if (num ==4){
        System.out.println("Jueves");
        }else if (num ==5){
            System.out.println("Viernes");
        }else if (num ==6){
            System.out.println("Sabado");
        }else{
            System.out.println("Domingo");
        }
    }
}
