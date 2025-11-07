package basic.c04_conditionals;

/*
Clase 38 - Ejercicios: Condicionales
Vídeo: https://youtu.be/JOAqpdM36wI?t=11021
*/

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int edad = 20;
        if( edad>18) {
            System.out.println("Es apto para votar");
        } else {
            System.out.println("no es apto para votar");
        }
        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int numeroUno = 10;
        int numeroDos = 9;
        if (numeroUno < numeroDos) {
            System.out.println("primero menor que el segundo");
        }  else if ( numeroUno == numeroDos) {
            System.out.println("Ambos numeros son iguales");
        }  else  {
            System.out.println(" Numero uno mayor que numero dos");
        }
         
        
        // 3. Dado un número, verifica si es positivo, negativo o cero.
         int numeroA = -3;
         if (numeroA < 0) {
            System.out.println(" es negativo");
        }  else if ( numeroA == 0 ) {
            System.out.println("Es cero");
        }  else  {
            System.out.println(" es positivo");
        }
        // 4. Crea un programa que diga si un número es par o impar.

        // 5. Verifica si un número está en el rango de 1 a 100.
        int numeroX = 110;
        if (numeroX >= 1 && numeroX <= 99) {
            System.out.println("el numero esta en el intervalo");   
        } else {
            System.out.println("el numero no esta en el intervalo");
        }
        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        int diaSemana = 5;
        switch(diaSemana) {
            case 1:
        System.out.println("Lunes");
        break;
            case 2:
        System.out.println("Martes");
        break;
            case 3:
        System.out.println("miercoles");
        break;
           case 4:
        System.out.println("jueves");
        break;
           case 5:
        System.out.println("viernes");
        break;
        default :
        System.out.println("fin de semana");
            }

        }
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

    }

