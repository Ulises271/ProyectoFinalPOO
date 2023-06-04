package org.example;

import org.example.Controlador.Controlador;
import org.example.Vista.Ventana;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Ventana view = new Ventana("Ejemplo proyecto final ");
        Controlador controller = new Controlador(view);
    }
}