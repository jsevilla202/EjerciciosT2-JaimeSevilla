package ejercicios;

import java.util.Scanner;
/*
 * Pruebas (valor/es introducidos) : (respuestas)
 * 0-1-2 : Usted carece de comida para alimentar a sus animales
 * 2-1-0 : Podrá alimentar a sus animales sin problemas
 * 2-0-1 : Usted no tiene animales a los que alimentar
 * 2-5-3 : Tendrá que cambiar cantidad de quilos de alimento para sus animales a 0.4 kilos por animal
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		/*Nombramos a la variable "animales" ( número total de animales ) como número entero*/
		int animales;
		/*Nombramos a las variables "comida" ( kilos de comida que tiene actualmente ) 
		 * y "kilos" ( kilos totales que necesitan los animales ) como números con decimales*/
		double comida, kilos;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca la cantidad de comida en kilos que tiene actualmente
		System.out.print("Por favor intrduzca la cantidad de comida en kilos de la que dispone: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "comida"
		comida = sc.nextDouble();
		//Pedimos al usuario que introduzca el número total de animales que tiene actualmente
		System.out.print("Por favor intrduzca el número de animimales del que dispone: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "animales"
		animales = sc.nextInt();
		//Pedimos al usuario que introduzca los kilos de comida que necesita para alimentar a todos los animales
		System.out.print("Por favor intrduzca la cantidad total de comida en kilos que necesitan los animales: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "kilos"
		kilos = sc.nextDouble();
		
		//Comprobamos si el usuario ha introducido un valor negativo
		if(animales<0||kilos<0||comida<0) {
			System.out.println("ERROR: No se admiten valores negativos");
		}
		//Si el número total de animales es 0, no tiene sentido continua con el programa ya que no hay animales que alimentar
		if(animales==0) {
			//Si es así, se mostrará por consola que no hay animales que alimentar
			System.out.println("Usted no tiene animales a los que alimentar");
		}
		//Comprobamos si la comida que tiene es mayor a la cantidad que necesita
		else if(comida>=kilos) {
			//De ser así, le mostramos al usuario por pantalla que no tiene problemas para alimentarlos
			System.out.println("Podrá alimentar a sus animales sin problemas");
		}
		else {
			/*En caso contrario, comprobamos si tiene comida para alimentarlos, si tiene comida, la repartimos entre los animales 
			y le mostramos el resultado por consola. En caso de no tener comida, se lo indicamos por consola*/
			System.out.println(comida!=0?"Tendrá que cambiar cantidad de quilos de alimento para sus animales a " + comida/animales + " kilos por animal":
				"Usted carece de comida para alimentar a sus animales");
		}
		//cerramos el scanner
		sc.close();
	}

}
