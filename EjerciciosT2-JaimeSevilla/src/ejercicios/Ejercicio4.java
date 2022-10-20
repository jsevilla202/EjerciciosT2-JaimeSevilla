package ejercicios;

import java.util.Scanner;
/*
 * Pruebas (valor/es introducidos) : (respuestas)
 * 12 - Doce
 * 20 - veinte
 * 30 - Treinta
 * 22 - VentiDos
 * 0 - Cero
 * 35 - Treinta y Cinco
 * 16 - DieciSeis
 * 100 - Error: Ha introducido un número fuera de rango
 * -1 - Error: Ha introducido un número fuera de rango
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		//Nombramos a las variables "numero", "unidad" ( unidad del número ) y "decena" ( decena del número ) como números enteros
		int numero, unidad, decena;
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Pedimos al usuario un número entre el 0 y el 99 para mostrarlo por consola en letras
		System.out.print("Inserte un número entre 0 y 99 en digitos para pasarl a letras: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero"
		numero = sc.nextInt();
		
		//Definimos las variables "unidad" y "decena"
		unidad = numero%10;
		decena = numero/10;
		
		if(0>numero||numero>99) {
			System.out.println("Error: Ha introducido un número fuera de rango");
		}
		else if(numero%10!=0&&((numero>=1&&numero<=9)||numero>=16)) {
		switch(decena) {
		case 1 -> System.out.print("Dieci");
		case 2 -> System.out.print("Venti");
		case 3 -> System.out.print("Trenta y ");
		case 4 -> System.out.print("Cuarenta y ");
		case 5 -> System.out.print("Cincuenta y ");
		case 6 -> System.out.print("Sesenta y ");
		case 7 -> System.out.print("Setenta y ");
		case 8 -> System.out.print("Ochenta y ");
		case 9 -> System.out.print("Noventa y ");
		}
		switch(unidad) {
		case 1 -> System.out.print("Uno");
		case 2 -> System.out.print("Dos");
		case 3 -> System.out.print("Tres");
		case 4 -> System.out.print("Cuatro");
		case 5 -> System.out.print("Cinco");
		case 6 -> System.out.print("Seis");
		case 7 -> System.out.print("Siete");
		case 8 -> System.out.print("Ocho");
		case 9 -> System.out.print("Nueve");
		}
		}
		
		else {
			switch(numero) {
			case 0 -> System.out.println("Cero");
			case 10 -> System.out.println("Diez");
			case 11 -> System.out.println("Once");
			case 12 -> System.out.println("Doce");
			case 13 -> System.out.println("Trece");
			case 14 -> System.out.println("Catorce");
			case 15 -> System.out.println("Quince");
			case 20 -> System.out.println("Veinte");
			case 30 -> System.out.println("Treinta");
			case 40 -> System.out.println("Cuarenta");
			case 50 -> System.out.println("Cincuenta");
			case 60 -> System.out.println("Sesenta");
			case 70 -> System.out.println("Setenta");
			case 80 -> System.out.println("Ochenta");
			case 90 -> System.out.println("Noventa");
			}
		}

		sc.close();
	}
}

