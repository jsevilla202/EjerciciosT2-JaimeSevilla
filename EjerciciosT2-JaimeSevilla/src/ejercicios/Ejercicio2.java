package ejercicios;

import java.util.Scanner;
/*
 * Pruebas (valor/es introducidos) : (respuestas)
 * 88888888 : Su letra es Y
 * 12121212 : Su letra es M
 * 0 : ERROR: DNI introducido no es valido
 * 100000000 : ERROR: DNI introducido no es valido
 * -1 : ERROR: DNI introducido no es valido
 * 1 : Su letra es R ( en sí 1 no puede ser un DNI, pero he tenido en cuenta que no todos los DNI tienen 8 cifras
 * por lo que el valor 1 lo interpreta como 00000001, siendo así un DNI correcto )
 * 2525252 : Su letra es J ( pasa lo mismo que en la prueba anterior )
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		//Nombramos a las variables "dni" y "letra" ( letra del dni ) como números enteros
		int dni, letra;
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca su DNI o uno aleatorio sin letra
		System.out.print("Estructura DNI requerido: 12345678 "
				+ "\nIntroduzca su DNI sin letra por favor: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "dni"
		dni = sc.nextInt();
		
		//Definimos la variable "letra" como el módulo del DNI inroducido entre 23
		letra = dni%23;
		
		//Si el DNI introducido no entra dentro del parámetro entablecido se le notificará al usuario por consola
		if(dni<1||dni>99999999) {
			System.out.println("ERROR: DNI introducido no es valido");
		}
		//En otro caso se procederá a calcular la letra que le corresponde
		else {
			//Dependiendo del valor que haya obtenido la variable "letra" se le asignará al DNI una letra u otra
			switch(letra) {
			case 0: System.out.println("Su letra es T"); break;
			case 1: System.out.println("Su letra es R"); break;
			case 2: System.out.println("Su letra es W"); break;
			case 3: System.out.println("Su letra es A"); break;
			case 4: System.out.println("Su letra es G"); break;
			case 5: System.out.println("Su letra es M"); break;
			case 6: System.out.println("Su letra es Y"); break;
			case 7: System.out.println("Su letra es F"); break;
			case 8: System.out.println("Su letra es P"); break;
			case 9: System.out.println("Su letra es D"); break;
			case 10: System.out.println("Su letra es X"); break;
			case 11: System.out.println("Su letra es B"); break;
			case 12: System.out.println("Su letra es N"); break;
			case 13: System.out.println("Su letra es J"); break;
			case 14: System.out.println("Su letra es Z"); break;
			case 15: System.out.println("Su letra es S"); break;
			case 16: System.out.println("Su letra es Q"); break;
			case 17: System.out.println("Su letra es V"); break;
			case 18: System.out.println("Su letra es H"); break;
			case 19: System.out.println("Su letra es L"); break;
			case 20: System.out.println("Su letra es C"); break;
			case 21: System.out.println("Su letra es K"); break;
			case 22: System.out.println("Su letra es E"); break;
			//En este caso, este switch no necesita "default", ya que ya hemos establecido un rango
			}
		}
	//cerramos el scanner	
	sc.close();

	}

}
