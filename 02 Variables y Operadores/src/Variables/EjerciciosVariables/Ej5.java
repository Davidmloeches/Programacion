package Variables.EjerciciosVariables;

public class Ej5 {
    public static void main(String[] args) {
        //Ejercicio 5: Truncado de decimales Declara una variable double con el valor de 10.0 / 3.0 y muestra el resultado truncando a 2 y 4 decimales usando System.out.printf.

        double resultado = 10.0 / 3.0;

        // Truncado a 2 decimales
        System.out.printf("Resultado truncado a 2 decimales: %.2f%n", resultado);

        // Truncado a 4 decimales
        System.out.printf("Resultado truncado a 4 decimales: %.4f%n", resultado);
    }
}

