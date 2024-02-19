package com.Cristaldo.TareaContPal;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        /*Expresión Lambda 'ContadorPalabras'*/
        ContadorPalabras contador = entrada -> {

            // Eliminando puntos, comas y dejando todo en minúsculas luego con 'Split' convierte la entrada en un arreglo para iterarlo.
            String[] entrada_arreglo = entrada.replace(".", "").replace(",", "").split(" ");

            int max = 0;
            String palabra = null;

            for (int i = 0; i < entrada_arreglo.length; i++) {
                int cantidad = 0;
                for (int j = 0; j < entrada_arreglo.length; j++) {
                    if (entrada_arreglo[i].equalsIgnoreCase(entrada_arreglo[j])) {  /*'equalsIgnoreCase' comparar dos cadenas de texto sin tener en cuenta las diferencias entre mayúsculas y minúsculas*/
                        cantidad++;
                    }
                }
                if(cantidad > max){
                    max = cantidad;
                    palabra = entrada_arreglo[i];
                }
            }

            //Se devuelve el resultado de la palabra más repetida y el número de veces que se repite en un Map
            return Collections.singletonMap(palabra, max);
        };
/*Collections.singletonMap se utiliza para crear un mapa inmutable(un mapa que no se puede modificar después de su creación).*/

//El map que devuelve lo iteramos con un forEach mostrando la llave o palabra y el valor la cantidad
        contador.contarPalabras("Yo ni te conozco, ni te he visto, ni se tu nombre, ni te hablaré, ni me interesas.").forEach( (k, v) -> System.out.println("la palabra '" + k + "' se repite " + v + " veces."));
    }
}
