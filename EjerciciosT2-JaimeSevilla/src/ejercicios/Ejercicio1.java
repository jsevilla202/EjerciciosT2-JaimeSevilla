package ejercicios;

import java.util.Scanner;
/*
 * Pruebas (valor/es introducidos) : (respuestas)
 * 
 *  1 : Su número es capicúa
 *  12 : Su número no es capicúa
 *  22 : Su número es capicúa
 *  090 : Su número no es capicúa (El programa no cuenta los 0 a la izquierda por lo que interpreta 90 que no es capicúa)
 *  191 : Su número es capicúa
 *  2552 : Su número es capicúa
 *  2553 : Su número no es capicúa
 *  1431 : Su número no es capicúa
 *  1442 : Su número no es capicúa
 *  10000000 : El número introducido no es valido
 *  -1 : El número introducido no es valido
 */ 
public class Ejercicio1 {

	public static void main(String[] args) {
		/*Nombramos a las variables "numero" (el número insertado), "unidad", "decena", "centena" y
		"millar" (la unidad, decena, centena y millar del número) como números enteros*/
		int numero, unidad, decena, centena, millar;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Pedimos al usuario que inserte un número establecido entre los límites marcados
		System.out.print("Inserte un numero entre 0 al 9999: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero"
		numero = sc.nextInt();
		
		/*Creamos una condición por la cual si es número es menor a 0 o mayor a 9999
		( siendo estos los límites que hemos establecido al usuario al pedirle el número )*/
		if(numero<0||numero>9999) {
			//Si esta condición se cumple, indicaremos al usuario que el número introducido no es valido con un mensaje por consola
			System.out.println("El número introducido no es valido");
		}
		//Con las siguientes condiciones mandaremos al número dentro de una condición dependiendo del número de cifras que tenga
		//En caso de tener una cifra entraría en esta condición
		else if(numero<=9) {
			//Al tener una sola cífra el número siempre será capicúa
			System.out.println("Su número es capicúa");
		}
		//En caso de tener dos cifras entraría en esta condición
		else if(numero<=99) {
			/*Para comprobar si es capicúa o no usaremos el módulo de 11, ya que todos los números
			capicúas son multiplos de 11*/
			if(numero%11==0) {
				//Si el modulo del numero entre 11 es igual a 0, el número será capicúa y se lo indicamos al usuario por consola
				System.out.println("Su número es capicúa");
			}
			else {
				//En otro caso no será capicúa y se lo indicamos al usuario por consola
				System.out.println("Su número no es capicúa");
			}
		}
		//En caso de tener tres cifras entraría en esta condición
		else if(numero<=999){
			//Comprobamos que la centena del número sea igual a la unidad, si lo es, el numero es capicúa
			if(numero%10==numero/100) {
				//En caso de cumplirse, el número es capicúa y se lo indicamos al usuario por consola
				System.out.println("Su número es capicúa");
			}
			else {
				//En otro caso, no es capicúa y se lo indicamos al usuario por consola
				System.out.println("Su número no es capicúa");
			}
		}
		//Si no es ningún caso de los anteriores, el número tendrá 4 cifras
		else{
			//Definimos las variables "unidad", "centena", "decena" y "millar"
			//M-C-D-U
			unidad = numero/1000;
			centena = (numero/10)%10;
			decena = (numero/100)%10;
			millar = numero%10;
			/*Hacemos las siguientes comprobaciones:
			 * - Si las dos primeras cifras y las dos últimas son iguales
			 * - Si la unidad y el millar son iguales
			 * - Si la decena y la centan son iguales
			 * Estas dos últimas van ligadas
			 */
			if(numero/100==numero%100||(unidad==millar&&decena==centena)) {
				//Si se cumplen las condiciones anteriores, el número es capicúa y se lo indicamos al usuario por consola 
				System.out.println("Su número es capicúa");
			}
			else {
				//En otro caso, no es capicúa y se lo indicamos al usuario por consola
			System.out.println("Su número no es capicúa");
			}
		}
		//Cerramos el scanner
		sc.close();
	}
}
