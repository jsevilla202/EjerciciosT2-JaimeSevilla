package ejercicios;

import java.util.Scanner;

class Ejercicio7 {

	public static void main(String[] args) {
		int hora, minuto, segundo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuación se le requerirá que inserte, una hora, un minuto y un segundo a su elección "
				+ "y el programa le sumará 1 segundo");
		System.out.print("Por favor inserte la hora: ");
		hora = sc.nextInt();
		System.out.print("Por favor inserte el minuto: ");
		minuto = sc.nextInt();
		System.out.print("Por favor inserte el segundo: ");
		segundo = sc.nextInt();
		
		if(hora>24||minuto>60||segundo>60||hora<0||minuto<0||segundo<0) {
			System.out.println("ERROR: La hora, minutos o segundos introducido es erronea");
		}
		
		else {
			if(segundo==59) {
				segundo = 0;
				minuto = minuto+1;
				
				if(minuto==60) {
					minuto = 0;
					hora = hora+1;
					if(hora==24);
					hora = 0;
				}
			}
		}
		System.out.println("Serían las "+hora+":"+minuto+":"+segundo+" si le añadimos 1 segundo");
		sc.close();
	}

}
