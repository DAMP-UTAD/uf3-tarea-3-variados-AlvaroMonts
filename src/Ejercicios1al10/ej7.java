package Ejercicios1al10;

import java.util.Scanner;

public class ej7 {
	public static void main(String[] args) {
		int numtotal, numcorrectas, porcentaje;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca el numero total de preguntas: ");
		numtotal = scanner.nextInt();
		System.out.print("Introduzca el numero de preguntas que contesto correctamente: ");
		numcorrectas = scanner.nextInt();

		porcentaje = (numcorrectas * 100) / numtotal;
		if (porcentaje < 50)
			System.out.println("Fuera de nivel");
		else if (porcentaje >= 50 && porcentaje < 75)
			System.out.println("Nivel regular");
		else if (porcentaje >= 75 && porcentaje < 90)
			System.out.println("Nivel medio");
		else
			System.out.println("Nivel maximo");
	}
}
