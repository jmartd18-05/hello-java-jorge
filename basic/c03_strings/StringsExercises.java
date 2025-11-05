package basic.c03_strings;

/*
Clase 34 - Ejercicios: Strings
Vídeo: https://youtu.be/JOAqpdM36wI?t=9838
*/

public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
       String asignaturaUno = "lengua castellana";
       String asignaturaDos = "mates";
       System.out.println(asignaturaUno + " " + asignaturaDos);
        // 2. Muestra la longitud de una cadena de texto.
       System.out.println(asignaturaUno.length());
        // 3. Muestra el primer y último carácter de un string.
        System.out.println(asignaturaUno.charAt(9));
        System.out.println(asignaturaUno.charAt( 16));
        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(asignaturaUno.toUpperCase());
        System.out.println(asignaturaDos.toLowerCase());
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(asignaturaUno.substring(3, 6));
        // 6. Formatea un string con un entero.
        System.out.println();
        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println("    Lengua Castellana  ".trim());
        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println("   Lengua Castellana  ".replace( " ", "-"));
        // 9. Comprueba si dos strings son iguales.
        var numeroOne = "Messi";
        var numeroTwo = "cr7";
        System.out.println(a.equals(b));
        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(a.length().equals(b.length()));
    }   
}

