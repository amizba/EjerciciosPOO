/* Crear y utilizar un tipo enumerado en Java para los días de la semana, que nos 
 * indique si es laboral o fin de semana.  
 */
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Programación Orientada a Objetos (POO)
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
package poo;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
        System.out.println("Escribe un dia de la semana");
        String dia = sn.next();
         
        DiaSemana diaS = DiaSemana.valueOf(dia.toUpperCase());
         
        switch(diaS){
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("El dia "+diaS.name().toLowerCase()+" es laborable");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("El dia "+diaS+" no es laborable");
                break;
             
        }
         
    }
     
}