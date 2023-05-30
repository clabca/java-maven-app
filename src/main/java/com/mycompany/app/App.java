package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);

        // Malas prácticas agregadas:

        // Uso de variables no utilizadas
        int unusedVariable = 5;

        // Bloque de código sin indentación
        for (int i = 0; i < 10; i++) {
        System.out.println(i);
        }

        // Comentarios inapropiados
        int x = 0; // Este es un contador

        // Nombres de variables poco descriptivos
        int c = 15;

        // Uso incorrecto de cadenas
        String s = new String("Example");
        if (s.equals("Example")) {
            // ...
        }

        // Clase con demasiadas responsabilidades
        // Métodos largos y complejos
    }

    public String getMessage() {
        return MESSAGE;
    }
}
