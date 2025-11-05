package basic.c02_operators;

/*
Clase 23 - Ejercicios: Operadores
Vídeo: https://youtu.be/JOAqpdM36wI?t=8085
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        int numeroUno = 3;
        int numeroDos = 5;
        System.out.println(numeroUno + numeroDos);
        System.out.println(numeroUno - numeroDos);
        System.out.println(numeroUno * numeroDos);
        System.out.println(numeroUno / numeroDos);
        System.out.println(numeroUno % 2 );
        // 2. Crea una variable para cada tipo de operación de asignación.
        numeroUno = numeroDos * 2;
        System.out.println(numeroUno);
        numeroUno += numeroDos;
        System.out.println(numeroUno);
        numeroUno -= numeroDos;
        System.out.println(numeroDos);
        numeroUno *= numeroUno;
        System.out.println(numeroUno);
        System.err.println(numeroUno);
        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(numeroUno <= numeroDos);
        System.out.println(numeroDos >= numeroUno);
        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.

        // 5. Utiliza el operador lógico and.
        System.out.println(true && true);
        // 6. Utiliza el operador lógico or.
        System.out.println(true || false);
        // 7. Combina ambos operadores lógicos.

        // 8. Añade alguna negación.
        System.out.println(true && !false);
        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        int a = 3;
        int b = 5;
        System.out.println(++b);
        System.out.println(--b);
        System.out.println(++a);
        // 10. Combina operadores aritméticos, de comparación y lógicos.
    }
}

