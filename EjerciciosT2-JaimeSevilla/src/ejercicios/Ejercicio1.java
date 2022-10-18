package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int numero, decimal1, decimal2, decimal3, decimal4;
		
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
			decimal1 = numero/1000;
			decimal3 = (numero/10)%10;
			decimal2 = decimal3%10;
			decimal4 = numero%10;
			if(numero/100==numero%100||(decimal1==decimal4&&decimal2==decimal3)) {
				System.out.println("Su número es capicúa");
			}
			else {
			System.out.println("Su número no es capicúa");
			}
		}
		sc.close();
	}
}
