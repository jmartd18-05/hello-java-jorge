package basic.c01_beginner;

/*
Clase 17 - Ejercicios: Variables y constantes
Vídeo: https://youtu.be/JOAqpdM36wI?t=6732
*/

public class BeginnerExercises {

    public static void main(String[] args) {

               // 1. Declara una variable de tipo String y asígnale tu nombre.
        String miNombre = "Jorge martínez";
        System.out.println(miNombre);
        // 2. Crea una variable de tipo int y asígnale tu edad.
        int miEdad = 18;
        System.out.println(miEdad);
        // 3. Crea una variable double con tu altura en metros.
        double miAltura = 1.79;
        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean interesProgramar = true;
        System.out.println(interesProgramar);
        // 5. Declara una constante con tu email.
        final String miCorreo = "jorgemartinez@gmail.com";
        System.out.println(miCorreo);
        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char miInicial = 'J';
        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String miLocalidad = "islas canarias";
        miLocalidad = "trobajo del camino, Leon";
        System.out.println(miLocalidad);
        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int numeroUno = 6;
        int numeroDos = 2;
        int resultadoNumero = numeroUno + numeroDos;
        System.out.println(resultadoNumero );
        // 9. Imprime el tipo de dos variables creadas anteriormente.

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        var variableRandom = "lionel messi";
        System.out.println(variableRandom);
    } 
}

