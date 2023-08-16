/*Creamos una clase abstracta llamada Figura que servir� como base para otras 
 * clases de figuras geom�tricas concretas como Circulo y Rectangulo. Cada figura 
 * tiene un m�todo abstracto para calcular su �rea.
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

public class Ejercicio8 {

	public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("�rea del c�rculo: " + circulo.calcularArea());

        Rectangulo rectangulo = new Rectangulo(4, 6);
        System.out.println("�rea del rect�ngulo: " + rectangulo.calcularArea());

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


