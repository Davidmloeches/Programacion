import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*
        Escribe un programa que lea tres cadenas de texto y las muestre en orden inverso, cada una en una nueva línea.
        Entrada:
           Java
           Programación
           Idioma
        Salida:
           Idioma
           Programación
           Java
         */
        Scanner sc = new Scanner(System.in);
        String palabra1= sc.nextLine();
        String palabra2= sc.nextLine();
        String palabra3= sc.nextLine();


        System.out.println(palabra3 + "\n" + palabra2+ "\n" + palabra1);
    }
}
