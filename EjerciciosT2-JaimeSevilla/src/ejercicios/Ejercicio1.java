package ejercicios;

import java.util.Scanner;
/*
 * Pruebas (valor/es introducidos) : (respuestas)
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		int numero, unidad, decena, centena, millar;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte un numero entre 0 al 9999: ");
		numero = sc.nextInt();
		
		if(numero<0&&numero>9999) {
			System.out.println("El número introducido no es valido");
		}
		
		else if(numero<=9) {
			System.out.println("Su número es capicúa");
		}
		
		else if(numero<=99) {
			if(numero%11==0) {
				System.out.println("Su número es capicúa");
			}
			else {
				System.out.println("Su número no es capicúa");
			}
		}
		
		else if(numero<=999){
			if(numero%10==numero/100) {
				System.out.println("Su número es capicúa");
			}
			else {
				System.out.println("Su número no es capicúa");
			}
		}
		
		else{
			unidad = numero/1000;
			centena = (numero/10)%10;
			decena = centena%10;
			millar = numero%10;
			if(numero/100==numero%100||(unidad==millar&&decena==centena)) {
				System.out.println("Su número es capicúa");
			}
			else {
			System.out.println("Su número no es capicúa");
			}
		}
		sc.close();
	}
}
