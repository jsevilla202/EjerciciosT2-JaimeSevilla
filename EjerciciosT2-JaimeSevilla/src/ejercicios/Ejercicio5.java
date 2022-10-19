package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		double numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte cualquier número que desee y se le devolverá el valor absoluto: ");
		numero = sc.nextDouble();
		
		System.out.println(numero<0?"El valor absoluto de su número es: " + numero*(-1):"El valor absoluto de su número es: " + numero);
		
		sc.close();

	}

}
