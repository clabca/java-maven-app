package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
}


public class BadCodeExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        
        // División entre cero
        int result = a / b;
        
        // Uso de variables no utilizadas
        int unusedVariable = 5;
        
        // Código duplicado
        System.out.println("Hello, world!");
        System.out.println("Hello, world!");
        
        // Uso de comentarios inapropiados
        int x = 0; // x es el contador
        
        // Nombres de variables poco descriptivos
        int c = 15;
        
        // Uso de variables globales
        System.out.println(globalVariable);
        
        // Uso de valores mágicos
        if (a == 5) {
            // ...
        }
        
        // Bloque de try-catch vacío
        try {
            // ...
        } catch (Exception e) {
            
        }
        
        // Uso incorrecto de cadenas
        String s = "Example";
        if (s == "Example") {
            // ...
        }
    }
    
    // Métodos con demasiados parámetros
    public void calculate(int a, int b, int c, int d, int e, int f) {
        // ...
    }
    
    // Métodos con demasiadas líneas de código
    public void longMethod() {
        // Línea 1
        // Línea 2
        // ...
        // Línea 100
    }
    
    // Métodos sin documentación
    public void undocumentedMethod() {
        // ...
    }
    
    // Clase con demasiadas responsabilidades
    // Métodos largos y complejos
    
    // Uso incorrecto de excepciones
    public void doSomething() throws Exception {
        // ...
    }
}

