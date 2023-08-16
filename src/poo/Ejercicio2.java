/*Crear dos clases que a su vez hereden de una tercera clase y compartan un mismo 
 * método, es decir, que se sobrescriba el método en las tres clases.
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

public class Ejercicio2 {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
        animal1.hacerSonido();

        Perro perro1 = new Perro();
        perro1.hacerSonido();

        Gato gato1 = new Gato();
        gato1.hacerSonido();

	}

}
class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}
class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}
class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El gato maulla.");
    }
}