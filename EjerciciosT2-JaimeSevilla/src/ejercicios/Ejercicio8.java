package ejercicios;

import java.util.Scanner;
/*
 * Pruebas (valor/es introducidos) : (respuestas)
 * 20-5 : El precio total de su viaje es de: 50.0€
 * 0-5 : ERROR: Introduzca una distancia o días validos
 * 5-0 : El precio total de su viaje es de: 12.5€
 * 900-8 : El precio total de su viaje, con descuento incluido, es de: 1575.0€
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 * Nombramos las variables "distancia" ( distancia que recorre el pasajero ) y "días"
		 * ( días que va a pasar de viaje ) como números enteros
		 */
		int distancia, dias;
		/*
		 * Nombramos las variables "km" ( precio por kilómetro ) y "descuento" como números con decimales
		 * y constantes
		 */
		final double km = 2.5, descuento = 0.7;
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamos al usuario los datos que va a tener que introducir
		System.out.println("A continuación se le pedira la distancia a recorrer y los días de estancia");
		//Pedimos al usuario que inserte la distancia en kms que va a recorrer
		System.out.print("Por favor, inserte la distancia en km que se va a desplazar en tren: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "distancia"
		distancia = sc.nextInt();
		//Pedimos al usuario que indique los días que va a estar de viaje
		System.out.print("Por favor, inserte los días que se va a hospedar: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "dias"
		dias = sc.nextInt();
		
		//Comprobamos si la distancia o días están fuera de los parámetros lógicos
		if(distancia<=0||dias<0) {
			//Si lo está, le indicamos al usuario que ha introducido una distancia o días erronea
			System.out.println("ERROR: Introduzca una distancia o días validos");
		}
		//Comprbamos si es apto para obtener el descuento
		else if(dias>7&&distancia>800) {
			//Si lo es, se lo notificaremos por consola junto con el precio que le corresponde
			System.out.println("El precio total de su viaje, con descuento incluido, es de: "+((distancia*km)*descuento)+"€");
		}
		else {
			//En otro caso, no se le aplica el descuento y se le muesra el precio del viaje
			System.out.println("El precio total de su viaje es de: "+(distancia*km)+"€");
		}
		//Cerramos el scanner
		sc.close();

	}

}
