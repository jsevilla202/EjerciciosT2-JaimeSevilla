package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int comida, animales, kilos;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor intrduzca la cantidad de comida en kilos de la que dispone: ");
		comida = sc.nextInt();
		System.out.print("Por favor intrduzca el número de animimales del que dispone:");
		animales = sc.nextInt();
		System.out.print("Por favor intrduzca la cantidad total de comida en kilos que necesitan los animales: ");
		kilos = sc.nextInt();
		
		if(animales==0) {
			System.out.println("Usted no tiene animales a los que alimentar");
		}
		else if(comida>=kilos) {
			System.out.println("Podrá alimentar a sus animales sin problemas");
		}
		else {
			System.out.println(comida!=0?"Tendrá que cambiar cantidad de quilos de alimento para sus animales a " + comida/animales:
				"Usted carece de comida para alimentar a sus animales");
		}
		
		sc.close();
	}

}
