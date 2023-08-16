//Crear una clase con su constructor, las variables encapsuladas y varios m�todos.
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Programaci�n Orientada a Objetos (POO)
*
* @author Amparo Izquierdo Ba�ez
* @mail amizba@gmail.com
*/
package poo;

public class Ejercicio3 {

	public static void main(String[] args) {
		Libro libro1 = new Libro("Harry Potter", "J.K. Rowling");
        System.out.println("T�tulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());

	}

}
class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}