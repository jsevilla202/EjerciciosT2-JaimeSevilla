package ejercicios;

import java.util.Scanner;
/*
 * Pruebas (valor/es introducidos) : (respuestas)
 * 1-1-1 : Serían las 1:1:2 si le añadimos 1 segundo
 * 23-59-59 : Serían las 0:0:0 si le añadimos 1 segundo
 * 0-59-58 : Serían las 0:59:59 si le añadimos 1 segundo
 * 0-61-0 : ERROR: La hora, minutos o segundos introducido es erronea
 * 
 */
class Ejercicio7 {

	public static void main(String[] args) {
		//Nombramos a las variables "hora", "minuto", y "segundo" como números enteros
		int hora, minuto, segundo;
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Mostramos al usuario la función del programa y lo que se le va a pedir por consola
		System.out.println("A continuación se le requerirá que inserte, una hora, un minuto y un segundo a su elección "
				+ "y el programa le sumará 1 segundo");
		//Pedimos al usuario que inserte una hora al azar
		System.out.print("Por favor inserte la hora: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "hora"
		hora = sc.nextInt();
		//Pedimos al usuario que inserte un minuto al azar
		System.out.print("Por favor inserte el minuto: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "minuto"
		minuto = sc.nextInt();
		//Pedimos al usuario que inserte un segundo al azar
		System.out.print("Por favor inserte el segundo: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "segundo"
		segundo = sc.nextInt();
		
		/*
		 * A continuación, realizamos las siguientes comprobaciones:
		 * - La hora es mayor que 24
		 * - Los minutos o segundos son mayores que 60
		 * - La hora, minutos o segundos son inferiores a 0
		 */
		if(hora>24||minuto>60||segundo>60||hora<0||minuto<0||segundo<0) {
			//Si algo de lo anterior se cumple, mostramos un mensaje de error por consola
			System.out.println("ERROR: La hora, minutos o segundos introducido es erronea");
		}
		else {
			if (hora==24||minuto==60||segundo==60) {
				if(hora==24) {
					hora = 0;
				}
				if(minuto==60) {
					minuto = 0;
				}
				if(segundo==60) {
					segundo = 0;
				}
			}
			//Si los segundos son 59
			if(segundo==59) {
				//Como se le suma 1 segundo, los segundos pasan a ser 0 y se le suma 1 a los minutos
				segundo = 0;
				minuto = minuto+1;
				
				if(minuto==60) {
					/*
					 * Si despues de la anterior suma los minutos son 60, los minutos pasan a ser 0 
					 * y se le suma 1 a la hora
					 */
					minuto = 0;
					hora = hora+1;
					if(hora==24);
						//Si la hora es 24 después de la suma anterior, pasa a ser 0, al ser el día siguiente
						hora = 0;
						//Mostramos la hora final que nos ha dado al sumar 1 segundo
						System.out.println("Serían las "+hora+":"+minuto+":"+segundo+" si le añadimos 1 segundo");
				}
			}
			else {
				//Si lo anterior no se cumple mostramos la hora final que nos ha dado al sumar 1 segundo
				System.out.println("Serían las "+hora+":"+minuto+":"+(segundo+1)+" si le añadimos 1 segundo");
			}
		}
				//cerramos el scanner
				sc.close();
			}
		}

