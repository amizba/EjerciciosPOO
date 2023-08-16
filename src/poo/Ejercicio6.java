/*Supongamos que tenemos una jerarquía de clases que representa diferentes tipos de 
 * animales. En el método main crear un array de objetos de tipo Animal que pueden 
 * contener instancias de Perro, Gato y Vaca. Luego llamar al método hacerSonido() 
 * en cada uno de ellos, y utilizar el polimorfismo que se encargará de ejecutar la 
 * versión correspondiente de ese método para cada tipo de animal
 * 
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

public class Ejercicio6 {

	public static void main(String[] args) {
		Animal2[] animales = new Animal2[3];
        animales[0] = new Perro2();
        animales[1] = new Gato2();
        animales[2] = new Vaca2();

        for (Animal2 animal : animales) {
            animal.hacerSonido();
        }

	}

}
class Animal2 {
    public void hacerSonido() {
        System.out.println("Sonido desconocido");
    }
}

class Perro2 extends Animal2 {
    @Override
    public void hacerSonido() {
        System.out.println("Woof woof");
    }
}

class Gato2 extends Animal2 {
    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}

class Vaca2 extends Animal2 {
    @Override
    public void hacerSonido() {
        System.out.println("Muuu");
    }
}
