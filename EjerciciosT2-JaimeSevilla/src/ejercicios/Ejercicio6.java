package ejercicios;

import java.util.Scanner;
/*
 * Pruebas (valor/es introducidos) : (respuestas)
 * 174 - ¡ENHORABUENA! SU RESPUESTA ES CORRECTA
 * 2 - Su respuesta es incorrecta
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * Nombramos a las variables "numero1", "numero2" ( numero1 y numero2 son los números generados aleatoriamente ), 
		 * "respuesta" ( la suma de numero1 y numero2 ) y respuestausuario ( respuesta que da el suaurio a la suma )
		 * como números enteros
		 */
		int numero1, numero2, respuesta, respuestausuario;
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Generamos los número aleatorios y los metemos cada uno dentro de una variable diferente
		 * 
		 * Math.random() genera un número aleatorio entre 0 y 1, por lo que para que esté dentro del rango que queremos ( 1-99 )
		 * lo tendremos que multiplicar por 100, si queremos incluir más números, lo multiplicaremos por 1000 y así respectivamente
		 * 
		 * Truncamos el número con (int) para convertirlo en entero y que no tenga decimales
		 */
		numero1 = (int) ((Math.random()*99)+1);
		numero2 = (int) ((Math.random()*99)+1);
		//Damos valor a la variable "respuesta", siendo esta la suma de "numero1" y "numero2"
		respuesta = numero1+numero2;
		
		//Mostramos al usuario por consola la suma que debe realizar
		System.out.println("Por favor inserte la suma de los siguientes números:\n"+numero1+"\n"+numero2);
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "respuestausuario"
		respuestausuario = sc.nextInt();
		
		/*
		 * Usando un ternario comprobamos si la respuesta dada por el usuario es igual a la respuesta correcta.
		 * Si es así mostrara un mensaje de enhorabuena, pero si no lo es mostrará un mensaje de respuesta incorrecta
		 */
		
		System.out.println(respuestausuario==respuesta?"¡ENHORABUENA! SU RESPUESTA ES CORRECTA":"Su respuesta es incorrecta");
		
		//Cerramos el scanner
		sc.close();
	}

}
