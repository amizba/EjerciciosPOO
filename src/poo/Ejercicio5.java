/*Supongamos que tienes una clase llamada �Persona� con los siguientes atributos: 
 * �nombre�, �edad� y �sexo�. Implementa una sobrecarga de constructores para la 
 * clase �Persona�
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

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Persona3 persona1 = new Persona3(); // Sin nombre, edad 0, sexo desconocido
        Persona3 persona2 = new Persona3("Juan", 25); // Nombre: Juan, edad: 25, sexo desconocido
        Persona3 persona3 = new Persona3("Mar�a", 30, "Femenino"); // Nombre: Mar�a, edad: 30, sexo: Femenino

        // Imprimir informaci�n de las personas
        System.out.println("Persona 1: " + persona1.getNombre() + ", " + persona1.getEdad() + ", " + persona1.getSexo());
        System.out.println("Persona 2: " + persona2.getNombre() + ", " + persona2.getEdad() + ", " + persona2.getSexo());
        System.out.println("Persona 3: " + persona3.getNombre() + ", " + persona3.getEdad() + ", " + persona3.getSexo());
		

	}

}
class Persona3 {
    private String nombre;
    private int edad;
    private String sexo;

    // Constructor sin par�metros
    public Persona3() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.sexo = "Desconocido";
    }

    // Constructor con nombre y edad
    public Persona3(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = "Desconocido";
    }

    // Constructor con nombre, edad y sexo
    public Persona3(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    // Getter para el atributo 'nombre'
    public String getNombre() {
        return nombre;
    }
    // Getter para el atributo 'edad'
    public int getEdad() {
        return edad;
    }
    // Getter para el atributo 'edad'
    public String getSexo() {
        return sexo;
    }

}
