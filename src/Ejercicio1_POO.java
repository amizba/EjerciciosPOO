/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios POO
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
import java.util.Scanner;

public class Ejercicio1_POO {

	public static void main(String[] args) {
		
		Ejercicio1_POO ejercicio1= new Ejercicio1_POO();
		
		
		ejercicio1.intNum_1();
		
		ejercicio1.intNum_2();
		
		System.out.println(ejercicio1.opSuma());
		System.out.println(ejercicio1.opResta());
		System.out.println(ejercicio1.opProd());
		System.out.println(ejercicio1.opDiv());

	}
	public void intNum_1() {
		
		
		System.out.println("Introduce el primer número: ");
		
		num1=sc.nextInt();
		

	}
	public void intNum_2() {
		
		System.out.println("Introduce el segundo número: ");
		
		num2=sc.nextInt();
	}

public String opSuma() {
	
	resultado=num1+num2;
	
	return "La suma de "+num1+" y "+num2+" es "+resultado;
}
public String opResta() {
	
	resultado=num1-num2;
	
	return "La resta de "+num1+" y "+num2+" es "+resultado;
}
public String opProd() {
	
	resultado=num1*num2;
	
	return "El producto de "+num1+" y "+num2+" es "+resultado;
}
public String opDiv() {
	
	resultado=num1/num2;
	
	return "La división de "+num1+" y "+num2+" es "+resultado;
}
	
	int num1, num2, resultado, suma, div, resta, prod;
	
	static Scanner sc = new Scanner(System.in);
}
