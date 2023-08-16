/*Creamos una clase abstracta llamada Figura que servirá como base para otras 
 * clases de figuras geométricas concretas como Circulo y Rectangulo. Cada figura 
 * tiene un método abstracto para calcular su área.
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

public class Ejercicio8 {

	public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("Área del círculo: " + circulo.calcularArea());

        Rectangulo rectangulo = new Rectangulo(4, 6);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

	}

}
abstract class Figura {
    abstract double calcularArea();
}

class Circulo extends Figura {
    double radio;

    Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo extends Figura {
    double base;
    double altura;

    Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return base * altura;
    }
}


