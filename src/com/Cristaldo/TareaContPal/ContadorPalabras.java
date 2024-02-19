package com.Cristaldo.TareaContPal;

import java.util.Map;

@FunctionalInterface
public interface ContadorPalabras {
    Map<String,Integer> contarPalabras(String frase);
    /*Recibe '(String frase)'*/
    /*Devuelve 'Map<String,Integer>'*/
}
