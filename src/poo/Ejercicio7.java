/*Supongamos que tenemos una clase padre “Animal” y una subclase “Perro” que 
 * comparten un método. Realizar un casting de una subclase a una superclase y un 
 * casting de una superclase a una subclase (con instanceof para evitar excepciones.  
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

public class Ejercicio7 {

	public static void main(String[] args) {
		// Casting de una subclase a una superclase
		Perro3 perro = new Perro3();
		Animal3 animal = (Animal3) perro;
		animal.hacerSonido(); // Salida: El perro hace: ¡Guau!
		
		//Casting de una superclase a una subclase
		Animal3 animal2 = new Animal3();
		if (animal instanceof Perro3) {
		    Perro3 perro2 = (Perro3) animal;
		    perro2.hacerSonido();
		} else {
		    System.out.println("El animal no es un perro");
		}

	}

}
class Animal3 {
    public void hacerSonido() {
        System.out.println("Haciendo un sonido indefinido");
    }
}

class Perro3 extends Animal3 {
    public void hacerSonido() {
        System.out.println("El perro hace: ¡Guau!");
    }

}
