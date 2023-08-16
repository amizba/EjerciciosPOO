/*Crear una clase Persona que contenga dos variables: nombre y edad, luego 
 * un m�todo para mostrar el nombre y edad de varios objetos de la clase Persona.
 */
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Programaci�n Orientada a Objetos (POO)
*
* @author Amparo Izquierdo Ba�ez
* @mail amizba@gmail.com
*/
package poo;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Persona persona1 = new Persona();
		
		System.out.println("Introduce t� nombre: ");
		
        persona1.nombre = sc.next();
        
        System.out.println("Introduce t� edad: ");
        
        persona1.edad = sc.nextInt();
        
        persona1.saludar();

        Persona persona2 = new Persona();
        
        System.out.println("Introduce t� nombre: ");
        
        persona2.nombre = sc.next();
        
        System.out.println("Introduce t� edad: ");
        
        persona2.edad = sc.nextInt();
        
        persona2.saludar();

	}

}
class Persona {
    String nombre;
    int edad;

    void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " a�os.");
    }
}