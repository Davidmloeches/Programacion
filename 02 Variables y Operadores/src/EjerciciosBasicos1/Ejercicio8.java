import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        /*
        Imagina que eres un gerente de recursos humanos en un restaurante y necesitas contratar a un chef. Para hacer eso, necesitas recopilar algunos datos preliminares sobre los candidatos, concretamente 5 campos: nombre, edad, años de experiencia, preferencia de cocina. Escribe un programa que lea todas las palabras (o números) una a una e imprima lo siguiente: "El formulario de <NOMBRE>, de <EDAD> años y <AÑOS DE EXPERIENCIA> de experiencia, está completo. Nos comunicaremos con usted si necesitamos a alguien que cocine comida <PREFERENCIA DE COCINA>".
        Entrada:

            Eugenio
            33
            8
            vegetariana
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese sus años de experiencia: ");
        int añosXp = sc.nextInt();
        System.out.println("Ingrese si tiene alguna preferencia de cocina: ");
        //Se escribe un nextLine(), porque al utilizar un nextInt y luego un nextLine se salta el ultimo nextLine.
        sc.nextLine();
        String preferencia = sc.nextLine();

        System.out.println("El formulario de " + nombre + ", de " + edad + " años y " + añosXp + " de experiencia, esta completo. Nos comunicaremos con usted si necesitamos alguien que cocine comida " + preferencia);
    }
}
