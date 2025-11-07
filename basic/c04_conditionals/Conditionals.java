package basic.c04_conditionals;

/*
Clase 35 - Condicionales
Vídeo: https://youtu.be/JOAqpdM36wI?t=9908
*/

public class Conditionals {

    public static void main(String[] args) {

        // Condicionales

        /*
        Clase 36 - Sentencia if
        Vídeo: https://youtu.be/JOAqpdM36wI?t=9978
        */

        // if, else if, else

        var age = 18;

        System.out.println(age >= 18);

        if (age > 18) {
            System.out.println("El usuario es mayor de edad");
        } else if (age == 18) {// hay que asegurarnos siempre que el if-else esta entre el if y el else. 
            //PRIORIDAD:
            System.out.println("El usuario acaba de cumplir 18");
        } else {// si pasa todo lo contrario al if, se ejecuta el else
            System.out.println("El usuario es menor de edad");
        }

        /*
        Clase 37 - Sentencia switch
        Vídeo: https://youtu.be/JOAqpdM36wI?t=10678
        */

        // switch: TENEMOS QUE ESTABLECER LA CONDICION. SIRVE PARA COMPROBAR EL VALOR DE UNA VARIABLE
        //EN EL CASE ESTABLECEMOS QUE VALOR QUEREMOS SI SE CUMPLE LA CONDICION DEL SWITCH
        //EL BREAK ROMPE CON EL CONTEXTO DE LAS LLAVES PARA SALTAR AL SIGUIENTE CASE
        //DEFAULT: no hace falta hacer break porque es la ultima instruccion 
        var day = 5;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("No es lunes, martes o miércoles");
        }
    }
}
