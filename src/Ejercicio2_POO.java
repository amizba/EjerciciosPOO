/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios POO
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
import java.util.Scanner;

public class Ejercicio2_POO {

	public static void main(String[] args) {
		Ejercicio2_POO ejercicio2 = new Ejercicio2_POO();
		
		ejercicio2.cargarValor();
		

	}
	
	public void cargarValor() {
        Scanner teclado=new Scanner(System.in);
        int valor;
        do {
            System.out.print("Ingrese valor:");
            valor=teclado.nextInt();
            if (valor!=-1) {
                calcular(valor);
            }
        } while (valor!=-1);
    }
    
    public void calcular(int v) {
        for(int f=v;f<=v*10;f=f+v) {
            System.out.print(f+"-");
        }
    }}
