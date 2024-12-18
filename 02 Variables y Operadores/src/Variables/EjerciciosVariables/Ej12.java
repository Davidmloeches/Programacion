package Variables.EjerciciosVariables;

public class Ej12 {
    public static void main(String[] args) {
        //Ejercicio 12: Promedio de tres números decimales Declara tres variables de tipo double, calcula el promedio de los tres valores, y muestra el resultado con 2 decimales de precisión.
        // Declarar tres variables de tipo double
        double num1 = 7.5, num2 = 8.2, num3 = 9.3;

        // Calcular el promedio
        double promedio = (num1 + num2 + num3) / 3;

        // Mostrar el resultado con 2 decimales de precisión
        System.out.printf("El promedio de los tres números es: %.2f%n", promedio);

    }
}
