package ejercicios;

import java.util.Scanner;
/*
 * Pruebas (valor/es introducidos) : (respuestas)
 * 5 - El valor absoluto de su número es: 5.0
 * -1 - El valor absoluto de su número es: 1.0
 * 0 - El valor absoluto de su número es: 0.0
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		//Nombramos a la variable "numero" como double ( numero con decimales ) ya que no nos especifican si es entero o no
		double numero;
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Pedimos al usuario que inserte un número y se lo devolveremos en valor absoluto, es decir, siempre positivo
		System.out.print("Inserte cualquier número que desee y se le devolverá el valor absoluto: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero"
		numero = sc.nextDouble();
		
		/*Utilizamos un ternario como nos piden en el enunciado. 
		 * Si el valor del número es inferior a 0, lo multiplicamos por (-1) para hacerlo positivo y lo mostramos por consola.
		 * Si el valor del número es positivo, lo mostramos tal cual
		*/
		System.out.println(numero<0?"El valor absoluto de su número es: " + numero*(-1):"El valor absoluto de su número es: " + numero);
		
		//cerramos el scanner
		sc.close();

	}

}
