/*Supongamos que tenemos una jerarqu�a de clases que representa diferentes tipos de 
 * animales. En el m�todo main crear un array de objetos de tipo Animal que pueden 
 * contener instancias de Perro, Gato y Vaca. Luego llamar al m�todo hacerSonido() 
 * en cada uno de ellos, y utilizar el polimorfismo que se encargar� de ejecutar la 
 * versi�n correspondiente de ese m�todo para cada tipo de animal
 * 
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
