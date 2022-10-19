package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int distancia, dias;
		final double km = 2.5, descuento = 0.7;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuación se le pedira la distancia a recorrer y los días de estancia");
		System.out.print("Por favor, inserte la distancia en km que se va a desplazar en tren: ");
		distancia = sc.nextInt();
		System.out.print("Por favor, inserte los días que se va a hospedar: ");
		dias = sc.nextInt();
		
		if(distancia==0) {
			System.out.println("ERROR: Introduzca una distancia valida");
		}
		else if(dias>7&&distancia>800) {
			System.out.println("El precio total de su viaje, con descuento incluido, es de: "+((distancia*km)*descuento));
		}
		else {
			System.out.println("El precio total de su viaje, con descuento incluido, es de: "+(distancia*km));
		}
		sc.close();

	}

}
