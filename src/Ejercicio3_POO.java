/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios POO
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
import java.util.Scanner;

public class Ejercicio3_POO {

	public static void main(String[] args) {
		Ejercicio3_POO ejercicio3 = new Ejercicio3_POO();
		
		ejercicio3.cargarValores();

	}
	public void cargarValores() {
    	Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese primer valor:");
        int valor1=sc.nextInt();
        System.out.print("Ingrese segundo valor:");
        int valor2=sc.nextInt();
        System.out.print("Ingrese tercer valor:");
        int valor3=sc.nextInt();
        int mayor,menor;
        mayor=calcularMayor(valor1,valor2,valor3);
        menor=calcularMenor(valor1,valor2,valor3);
        System.out.println("El valor mayor de los tres es:"+mayor);
        System.out.println("El valor menor de los tres es:"+menor);
    }
    
    public int calcularMayor(int v1,int v2,int v3) {
        int m;
        if(v1>v2 && v1>v3) {
          m=v1;
        } else {
            if(v2>v3) {
                m=v2;
            } else {
            	m=v3;
            }
        }
        return m;
    }
    
    public int calcularMenor(int v1,int v2,int v3) {
        int m;
        if(v1<v2 && v1<v3) {
          m=v1;
        } else {
            if(v2<v3) {
                m=v2;
            } else {
            	m=v3;
            }
        }
        return m;
    }
}

