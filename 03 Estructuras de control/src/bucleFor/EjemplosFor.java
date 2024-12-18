package bucleFor;

public class EjemplosFor {
    public static void main(String[] args) {
        //bucles: sirve para repetir las intruccioes dentro del bloque{} un cierto numero de veces

        //si se conoce el número exacto de veces que lo queremos repetir se usar for (normalmente)

        //si no se conoce el número de interacciones se utiliza while o do-while (normalmente, porque en realidad todos los tipos de bucles son intercambiables)

        // bucle for
        // el valor de i es 0
        // a la variable i se la denomina variable del bucle, y es quien cuenta las vueltas, es decir por cada vuelta se incrementa una unidad

        //EJ
        int tope=10;
        //mientras i sea menor que 10
        for (int i = 0; i < tope; i++) {
            System.out.println("vuelta numero:" + i);
        }


    }
}
