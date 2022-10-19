package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int numero1, numero2, respuesta, respuestausuario;
		
		Scanner sc = new Scanner(System.in);
		
		numero1 = (int) (Math.random()*100);
		numero2 = (int) (Math.random()*100);
		respuesta = numero1+numero2;
		
		System.out.println("Por favor inserte la suma de los siguientes números:\n"+numero1+"\n"+numero2);
		respuestausuario = sc.nextInt();
		
		if(respuestausuario==respuesta) {
			System.out.println("¡ENHORABUENA! SU RESPUESTA ES CORRECTA");
		}
		else {
			System.out.println("Su respuesta es incorrecta");
		}
		
		sc.close();
	}

}
