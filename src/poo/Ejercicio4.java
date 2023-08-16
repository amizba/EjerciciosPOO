/*Supongamos que tienes una clase llamada “Persona” con los atributos “nombre” y 
 * “edad”, implementa los métodos getter y setter para estos atributos.
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

public class Ejercicio4 {

	public static void main(String[] args) {
		Persona2 persona = new Persona2();

        // Usando el setter para asignar valores
        persona.setNombre("Paco");
        persona.setEdad(25);

        // Usando el getter para obtener valores
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

	}

}
class Persona2 {
    private String nombre;
    private int edad;

    // Getter para el atributo 'nombre'
    public String getNombre() {
        return nombre;
    }

    // Setter para el atributo 'nombre'
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el atributo 'edad'
    public int getEdad() {
        return edad;
    }

    // Setter para el atributo 'edad'
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }
}
